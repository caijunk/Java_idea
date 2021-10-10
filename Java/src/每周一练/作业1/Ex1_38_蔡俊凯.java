package 每周一练.作业1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_38_蔡俊凯 {

    public static boolean prime(int p){
        if (p <= 3){
            return p > 1;
        }
        for (int i = 2; i <p ; i++) {
            if (p % i==0){
                return  false;
            }
        }
        return true;
    }

    public static void sushu(int number){
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i < number; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            count++;
            System.out.print(list.get(i)+" ");
            if(count % 10 == 0){
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        sushu(1000);
        System.out.println();
        System.out.println("请输入一个整数");
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        System.out.println(prime(p));
       }
    }
