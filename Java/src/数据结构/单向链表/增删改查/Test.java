package 数据结构.单向链表.增删改查;

public class Test {
    public static void main(String[] args) {
        Node node1 = new Node(1,"王五");
        Node node2 = new Node(2,"小明");
        Node node3 = new Node(3,"李红");
        Node newnode = new Node(2,"小白");

        SeqList seqList = new SeqList();
        SeqList seqList1 = new SeqList();
//        seqList.addNode(node3);
//        seqList.addNode(node2);
//        seqList.addNode(node1);
//        seqList.showList();
//        System.out.println("-------------------");
        seqList1.addNode2(node3);
        seqList1.addNode2(node2);
        seqList1.addNode2(node1);
        seqList1.showList();
        System.out.println("-------------------");
//        seqList1.update(newnode);
        seqList1.delete(2);
        seqList1.showList();
    }
}

class SeqList{
    private Node head = new Node(0,"");

//    不能自动排序的增添方法(插入尾节点)
    public void addNode(Node node){
        Node temp = head;
        while (true){
            if (temp.next == null){
                break;
            }
            temp = temp.next;
        }
            temp.next = node;
    }

//    能按照顺序自动排序的增添方法
    public void addNode2(Node node){
        Node temp = head;
        boolean flag = false;
        while (true){
            if (temp.next == null){
                break;
            }
            if (temp.next.no > node.no){
                break;
            }else if (temp.next.no == node.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            System.out.printf("%d节点已存在",temp.no);
        }else {
            node.next = temp.next;
            temp.next = node;
        }
    }
//修改
    public void update(Node node){
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        Node temp =head.next;
        boolean flag = false;
        while (true){
            if (temp == null){
                break;
            }
            if (temp.no == node.no ){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.name = node.name;
        }else {
            System.out.println("找不到该节点");
        }
}
//删除
public void delete(int no){
        Node temp = head;
        boolean flag = false;
        while (true){
            if (temp.next == null){
                break;
            }
            if (temp.next.no == no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.next = temp.next.next;
        }else {
            System.out.println("没有找到该节点");
        }
}

//遍历
    public void showList(){
        if(head.next == null){
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

//节点类
class Node{
    int no;
    String name;
    Node next;

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
