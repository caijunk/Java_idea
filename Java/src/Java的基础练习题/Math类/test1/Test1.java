package Java的基础练习题.Math类.test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println("你输入的字符串"+ s);
        String s1 = reverseStr(s);
        System.out.println("反转后的字符串"+s1);
    }

    public static String reverseStr(String s) {
        String s1 = "";
        char[] chars = s.toCharArray();
        for (int i = chars.length-1; i >0 ; i--) {
            s1 = s1 + chars[i];
        }
        return s1;
    }
}
