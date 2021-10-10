package 每周一练.作业3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3_38_蔡俊凯 {
    public static void main(String[] args){
        String menu = "烤鸭：35.5酸菜鱼：25.5红烧肉：45.5";
        System.out.println(menu);
        System.out.println("----------------------------");
        method1(menu);
        System.out.println("----------------------------");
        method2(menu);
        System.out.println("----------------------------");
        method3(menu);
        System.out.println("----------------------------");
        method4(menu);
        System.out.println("----------------------------");
        method5(menu);
        System.out.println("----------------------------");
    }


    private static void method5(String menu) {
        System.out.println("5.利用Pattern和Matcher类方法所输出的结果");
        String regex = "[0123456789.]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(menu);
        double sum = 0;
        while (matcher.find()){
            String str = matcher.group();
            double sum1 = Double.parseDouble(str);
            sum = sum +sum1;
        }
        System.out.println("菜单的总价格："+sum);
        System.out.println("平均价格："+sum/3);
    }

    private static void method4(String menu) {
        System.out.println("4.利用StringTokenizer类方法所输出的结果");
        String regex = "[^0123456789.]+";
        menu = menu.replaceAll(regex,"@");
        StringTokenizer fenxi = new StringTokenizer(menu,"@");
        double sum =0;
        while (fenxi.hasMoreTokens()){
            String str = fenxi.nextToken();
            double sum1 = Double.parseDouble(str);
            sum = sum + sum1;
        }
        System.out.println("菜单的总价格："+sum);
        System.out.println("平均价格："+sum/3);
    }

    private static void method3(String menu) {
        System.out.println("3.利用substring方法所输出的结果");
        String str1 = menu.substring(3, 7);
        String str2 = menu.substring(11, 15);
        String str3 = menu.substring(19, 23);
        double sum1 = Double.parseDouble(str1);
        double sum2 = Double.parseDouble(str2);
        double sum3 = Double.parseDouble(str3);
        double count = sum1+sum2+sum3;
        System.out.println("菜单的总价格："+count);
        System.out.println("平均价格："+count/3);
    }

    private static void method2(String menu) {
        System.out.println("2.利用split方法所输出的结果");
        String[] strings = menu.split("[^0123456789.]+");
        double count = 0;
        for (int i = 1; i < strings.length; i++) {
                String s = strings[i];
                double sum = Double.parseDouble(s);
                count += sum;
        }
        System.out.println("菜单的总价格："+count);
        System.out.println("平均价格："+count/3);
    }

    private static void method1(String menu){
        System.out.println("1.利用Scanner类方法所输出的结果");
        Scanner scanner = new Scanner(menu);
        String regex = "[^0123456789.]+";
        scanner.useDelimiter(regex);
        double count = 0;
        while(scanner.hasNext()){
            try {
                double price = scanner.nextDouble();
                count = count + price;
            }
            catch (InputMismatchException exception) {
                String t = scanner.next();
            }
        }
        System.out.println("菜单总价格："+count);
        System.out.println("平均价格："+count/3);
        
    }

}
