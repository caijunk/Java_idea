package 数据结构.队列.数组模拟环形队列;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(4); // 其队列的有效数据最大为4，最后一个位置为预留位置

        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while(loop) {
            System.err.println("s(show): 显示队列");
            System.err.println("a(add): 添加数据到队列");
            System.err.println("g(get): 从队列取出数据");
            System.err.println("h(head): 查看队列头元素");
            System.err.println("e(exit): 程序");

            char key = scanner.next().charAt(0); //接受一个字符

            switch (key) {
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("输入一个数");
                    int nextInt = scanner.nextInt();
                    queue.addQueue(nextInt);
                    break;
                case 'g':
                    try {
                        int data = queue.getQueue();
                        System.out.printf("取出的数据是%d\n",data);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':

                    try {
                        int headQueue = queue.headQueue();
                        System.out.printf("队列头元素是%d\n",headQueue);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;

                default:
                    break;
            }

        }

        System.out.println("程序已退出");
    }
}

class ArrayQueue{
    private int maxSize;
    private int front;
    private int rear;
    private int []arr;

    public ArrayQueue(int arrmaxSize){
        maxSize = arrmaxSize;
        arr = new int[maxSize];
        front = 0;
        rear = 0;
    }
    public boolean isFull(){
        return (rear + 1)%maxSize == front;
    }
    public boolean isEmpty(){
        return front == rear;
    }
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列已满，不能添加数据");
            return;
        }
        arr[rear] = n;
        rear = (rear + 1)%maxSize;
    }
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列是空的，没有数据");
        }
        int value = arr[front];
        front = (front + 1)%maxSize;
        return value;
    }
    public int size(){
        return (rear + maxSize - front)%maxSize;
    }
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列为空，没有数据");
            return;
        }
        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d]=%d\n", i % maxSize,arr[i % maxSize]);
        }
    }
    public int headQueue(){
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有数据");
        }
        return arr[front];
    }
}
