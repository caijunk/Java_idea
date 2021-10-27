package 数据结构与算法.栈.链表模拟栈;

public class test {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        linkedListStack singleLinkedListStack = new linkedListStack();
        singleLinkedListStack.push(node1);
        singleLinkedListStack.push(node2);
        singleLinkedListStack.push(node3);
        singleLinkedListStack.push(node4);
        singleLinkedListStack.pop();
        singleLinkedListStack.show();
    }
}
//      头插法
class linkedListStack{
    private Node top = new Node(-1);

    public boolean isEmpty(){
        return top.next == null;
    }

    public void push(Node node){
        if (top.next == null){
            top.next = node;
            return;
        }
        Node temp = top.next;
        top.next = node;
        node.next = temp;
    }

    public void pop(){
        if (top.next == null){
            System.out.println("栈空");
            return;
        }
        System.out.println("节点为"+top.next.no);
        top = top.next;
        }
    public void show() {
        if (isEmpty()) {
            System.out.println("栈为空！");
            return;
        }
        Node temp = top;
        while (temp.next != null) {
            System.out.println("节点为：" + temp.next.no);
            temp = temp.next;
        }
    }
    }



class Node{
    int no;
    Node next;

    public Node(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                '}';
    }
}
