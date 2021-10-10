package Java的基础练习题.Math类.test2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入你的号码：");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println("你输入的号码是否正确："+checkQQ(next));
    }

    private static boolean checkQQ(String next) {
        if (next.length()<5||next.length()>12){
            return false;
        }
        if (next.charAt(0)=='0'){
            return false;
        }
        for (int i = 0; i < next.length()-1; i++) {
            char ch = next.charAt(i);
            if(ch<'0' || ch>'9'){
                return  false;
            }
        }
        return  true;
    }
}
