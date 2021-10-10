package 数据结构.队列.数组模拟队列;

import java.util.Scanner;

public class test {
//    测试队列
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        Scanner scanner = new Scanner(System.in);

        boolean loop=true;
        while (loop){

            System.out.println("s(show)：显示队列");
            System.out.println("e(exit)：退出队列");
            System.out.println("a(add)：添加数据到队列");
            System.out.println("g(get)：从队列中取出数据");
            System.out.println("h(head)：查看队列头的数据");
            String next = scanner.next();
            switch (next){
                case "s":
                    arrayQueue.showQueue();
                    break;
                case "a":
                    System.out.println("请输入一个数");
                    int i = scanner.nextInt();
                    arrayQueue.addQueue(i);
                    break;
                case "g":

                    try {
                        int res= arrayQueue.getQueue();
                        System.out.println("取出的数据是 "+res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "h":
                    try {
                        int res=arrayQueue.headQueue();
                        System.out.println("队列头数据是" +res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case "e":
                    scanner.close();
                    loop=false;
                    break;
            }

        }
        System.out.println("程序退出");
    }
}

class ArrayQueue{

    private int maxSize;//数组的最大容量
    private int front;//队列头
    private int rear;//队列尾
    private int []arr;//存放数据，模拟队列

    public ArrayQueue(int arrmaxSize){
        maxSize = arrmaxSize;
        arr = new int[maxSize];//创建队列数组
        front = -1;//指向队列头部（队列头的前一个位置）
        rear = -1;//指向队列尾部（队列的最后一个数据）
    }
    //判断队列是否为满
    public boolean ifFull(){
        return rear == maxSize-1;
    }
    //判断队列是否为空
    public boolean ifEmpty(){
        return front == rear;
    }
    //添加数据到队列
    public void addQueue(int n){
        if (ifFull()){
            System.out.println("队列满了，不能添加");
            return;
        }
        rear++;
        arr[rear] = n;
    }
    //获取队列数据，出队列
    public int getQueue(){
        if (ifEmpty()){
            throw new RuntimeException("队列空，不能获取");
        }
        front++;
        return arr[front];
    }
    //显示队列
    public void showQueue(){
        if (ifEmpty()){
            System.out.println("队列是空的，没有数据");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n",i,arr[i]);
        }
    }
    //显示队列头数据(不是取数据)
    public int headQueue(){
        if (ifEmpty()){
            throw new RuntimeException("队列为空没有数据");
        }
        return arr[front+1];
    }
}
