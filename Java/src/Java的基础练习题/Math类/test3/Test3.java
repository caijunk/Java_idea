package Java的基础练习题.Math类.test3;

import java.util.Scanner;

/*
 * indexOf(String str, int fromIndex)
 * 该方法作用：从fromIndex位置开始查找，字符串str第一次出现的位置；若没找到，放回-1
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println("请输入一段大的字符串：");
        Scanner scanner =new Scanner(System.in);
        String big = scanner.next();
        System.out.println("请输入一段小的字符串：");
        Scanner scanner1 =new Scanner(System.in);
        String small = scanner1.next();
        System.out.println("小字符串："+small+"大字符串:"+big+",出现的次数为："+getCount(big,small));
    }

    private static int getCount(String big,String small) {
        int index =0;
        int count =0;
        while ((index = big.indexOf(small,index))!=-1){
            index++;
            count++;
        }
        return count;
    }
}
