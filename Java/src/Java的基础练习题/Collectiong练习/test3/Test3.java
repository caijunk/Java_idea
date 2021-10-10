package Java的基础练习题.Collectiong练习.test3;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> list = listTest(arr);
        System.out.println(list);
    }
    public static ArrayList<Integer> listTest(int[] arr){
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int a :arr){
            list1.add(a);
        }
        return list1;
    }

}
