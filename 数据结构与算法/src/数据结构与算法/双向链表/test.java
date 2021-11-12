package 数据结构与算法.双向链表;


public class test {
    public static void main(String[] args) {
        Node node1 = new Node(1,"a");
        Node node2 = new Node(2,"b");
        Node node3 = new Node(3,"c");
        Node node4 = new Node(4,"d");
        Node node5 = new Node(5,"e");

        Node nodeupdate = new Node(3,"改后的c");

        DoubleList doubleList = new DoubleList();
//        doubleList.add(node2);
//        doubleList.add(node1);
//        doubleList.add(node3);
//        doubleList.add(node4);
//        doubleList.add(node5);
//        doubleList.showdoubulelist();
//        System.out.println("删除之后------------");
//        doubleList.delete(2);
//        doubleList.showdoubulelist();
//        System.out.println("修改之后------------");
//        doubleList.update(nodeupdate);
//        doubleList.showdoubulelist();
        System.out.println("自动按照顺序排列------");
        doubleList.addorder(node2);
        doubleList.addorder(node1);
        doubleList.addorder(node3);
        doubleList.addorder(node5);
        doubleList.addorder(node4);
        doubleList.showdoubulelist();

    }
}

class DoubleList{
    Node head = new Node(0,"");
//    增加（在尾部加）
    public void add (Node node){
        Node temp = head;
        while (true){
            if (temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
        node.pre = temp;
    }
//    增加（按照编号加）
    public void addorder(Node node){
        Node temp = head;
        boolean flag = false;
        while (true){
            if (temp.next == null){
                break;
            }
            if (temp.next.no > node.no){
                break;
            }else if(temp.next.no == node.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("该节点已存在");
        }else{
            node.next = temp.next;
            temp.next = node;
            temp.next.pre = node;
            node.pre = temp;
        }
    }
//    删除(根据编号)
    public void delete(int no){
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        Node temp = head.next;
        boolean flag = false;
        while (true){
            if (temp == null){
                break;
            }
            if (temp.no == no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.pre.next = temp.next;
            if (temp.next != null){
                temp.next.pre = temp.pre;
            }
        }else {
            System.out.println("该数据不存在");
        }
    }
//    修改
    public void update(Node node){
        if (head.next == null ){
            System.out.println("链表为空");
            return;
        }
        Node temp = head.next;
        boolean flag = false;
        while (true){
            if (temp == null){
                break;
            }
            if (temp.no == node.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.name = node.name;
        }else{
            System.out.println("没有找到该数据");
        }
    }
//    遍历
    public void showdoubulelist(){
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        Node temp = head.next;
        while (true){
            if (temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
}

class Node{
    int no;
    String name;
    Node next;
    Node pre;

    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}