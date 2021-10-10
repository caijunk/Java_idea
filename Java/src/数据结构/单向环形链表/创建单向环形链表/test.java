package 数据结构.单向环形链表.创建单向环形链表;
public class test{
    public static void main(String[] args) {
        Seqlist seqlist = new Seqlist();
        seqlist.addNode(10);
        seqlist.showList();
    }

}
//创建环形链表
class Seqlist {
    private Node first = null;
//增加
    public void addNode(int nums){
        if (nums < 1){
            System.out.println("数据错误");
            return;
        }
        Node curnode = null;
        for (int i = 1; i <= nums; i++) {
            Node node = new Node(i);
            if (i == 1){
                first = node;
                first.next = first;
                curnode = first;
            }else {
                curnode.next = node;
                node.next = first;
                curnode = node;
            }
        }
    }
//遍历
    public void showList(){
        if (first == null){
            System.out.println("链表为空");
            return;
        }
        Node curnode = first;
        while (true){
            System.out.printf("节点为%d\n",curnode.date);
            if (curnode.next == first ){
                break;
            }
            curnode = curnode.next;
        }
    }
}


//节点类
class Node{
    int date;
    Node next;
    public Node(int date) {
        this.date = date;
    }
}
