package 数据结构与算法.栈.数组模拟栈;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(4);
        String key = "";
        boolean loop = true; //控制是否退出菜单
        Scanner scanner = new Scanner(System.in);

        while(loop) {
            System.out.println("show: 表示显示栈");
            System.out.println("exit: 退出程序");
            System.out.println("push: 表示添加数据到栈(入栈)");
            System.out.println("pop: 表示从栈取出数据(出栈)");
            System.out.println("请输入你的选择");
            key = scanner.next();
            switch (key) {
                case "show":
                    stack.list();
                    break;
                case "push":
                    System.out.println("请输入一个数");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case "pop":
                    try {
                        int res = stack.pop();
                        System.out.printf("出栈的数据是 %d\n", res);
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println(e.getMessage());
                    }
                    break;
                case "exit":
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }

        System.out.println("程序退出~~~");
    }
}
//定义一个栈
class ArrayStack{
    private int maxSize;
    private int[] stack;
    private int top = -1;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }
//    判断栈是否满
    public boolean isFull(){
        return top == maxSize-1;
    }
//    判断栈是否空
    public boolean isEmpty(){
        return top == -1;
    }
//    入栈push
    public void push(int value){
        if(isFull()){
            System.out.println("栈满，不能加入。");
            return;
        }
        top++;
        stack[top] = value;
    }
//    出栈pop
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("栈为空，没有输出出来。");
        }
        int value = stack[top];
        top--;
        return value;
    }
//    遍历
    public void list(){
        if (isEmpty()){
            System.out.println("栈空，没有数据。");
            return;
        }
        for (int i = top; i >=0 ; i--) {
            System.out.printf("stack[%d]=%d\n",i,stack[i]);
        }
    }

}
