package 每周一练.作业2;

import java.util.Scanner;

public class Ex2_38_蔡俊凯 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入第一个数：");
        int p1 = scanner.nextInt();
        System.out.print("输入第二个数：");
        int p2 = scanner.nextInt();
        System.out.print("输入第三个数：");
        int p3 = scanner.nextInt();
        System.out.print("输入第四个数：");
        int p4 = scanner.nextInt();
        System.out.print("输入第五个数：");
        int p5 = scanner.nextInt();
        int num []= {p1,p2,p3,p4,p5};
        max(num);
        min(num);
        average(num);
        System.out.print("输入第一个正整数：");
        int p6 = scanner.nextInt();
        System.out.print("输入第二个正整数：");
        int p7 = scanner.nextInt();
        System.out.println("您输入的两个正整数的最大公约数为："+gcd(p6,p7));
        System.out.println("您输入的两个正整数的最小公倍数为："+lcm(p6,p7));
    }


    private static int lcm(int p6, int p7) {
        return p6*p7/gcd(p6, p7);
    }

    private static int gcd(int p6, int p7) {
        int min = Integer.min(p6, p7);
        for (int k = min; k >0 ; k--) {
            if (p6%k == 0 && p7%k == 0){
                return k;
            }
        }
        return 1;
    }

    private static void average(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("平均数为："+sum/num.length);
    }

    private static void min(int[] num) {
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (min > num[i]){
                min = num[i];
            }
        }
        /*if(min > num[1]){
            min = num[1];
        }
        if (min > num[2]){
            min = num[2];
        }
        if (min > num[3]){
            min = num[3];
        }
        if (min > num[4]){
            min = num[4];
        }*/
        System.out.println("最小值为："+min);
    }

    private static void max( int num[] ) {
            int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]){
                max = num[i];
            }
        }
            /*if(max < num[1]){
                max = num[1];
            }
            if (max < num[2]){
                max = num[2];
            }
            if (max < num[3]){
                max = num[3];
            }
            if (max < num[4]){
                max = num[4];
            }*/
        System.out.println("最大值为："+max);
    }
}
