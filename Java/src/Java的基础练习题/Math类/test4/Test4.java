package Java的基础练习题.Math类.test4;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("请输入原字符串：");
        Scanner scanner =new Scanner(System.in);
        String srcStr = scanner.nextLine();
        System.out.println("请输入删除的字符串：");
        String delStr = scanner.nextLine();
        printCount(srcStr,delStr);
    }

    private static void printCount(String srcStr,String delStr) {
        String result = srcStr.replace(delStr, "");
        int count =(srcStr.length()-result.length())/delStr.length();
        System.out.println("源字符串中总共包含:"+ count +" 个 "+ delStr +" ,\r\n删除"+ delStr +"后的字符串为: "+ result);
    }
}
