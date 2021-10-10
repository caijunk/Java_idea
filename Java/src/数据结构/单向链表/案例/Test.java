package 数据结构.单向链表.案例;

import java.util.Stack;

public class Test {
    //123
    public static void main(String[] args) {

        Node node1 = new Node(1, "a");
        Node node2 = new Node(2, "b");
        Node node3 = new Node(3, "c");
        Node node4 = new Node(4, "d");
        Node node5 = new Node(5, "e");
        SeqList seqList = new SeqList();
        seqList.addNode2(node1);
        seqList.addNode2(node2);
        seqList.addNode2(node3);
        seqList.addNode2(node4);
        seqList.addNode2(node5);
//        System.out.println(getlength(seqList.head));
//        System.out.println(getNode(seqList.head, 1));
//        reversetList(seqList.head);
//        seqList.showList();
        reversePrint(seqList.head);
    }

    //    1.求单链表中有效节点的个数
    public static int getlength(Node head) {
        if (head.next == null) {
            return 0;
        }
        int length = 0;
        Node temp = head.next;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    //    2.查找单链表中的倒数第k个节点
    public static Node getNode(Node head, int index) {
        if (head.next == null) {
            return null;
        }
        int size = getlength(head);
        if (index <= 0 || index > index) {
            return null;
        }
        Node temp = head.next;
        for (int i = 0; i < size - index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //    3.单链表的反转（头插入法）
    public static void reversetList(Node head) {
        if (head.next == null || head.next.next == null) {
            return;
        }
        Node cur = head.next;
        Node next = null;
        Node reverseHead = new Node(0, "");
        while (cur != null) {
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        head.next = reverseHead.next;
    }
//    4.从尾到头打印单链表
    public static void reversePrint(Node head){
        if (head.next == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = head.next;
        while (cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }
}

class SeqList{
    Node head = new Node(0,"");
//    增添
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
//    遍历
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