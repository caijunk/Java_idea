package Java的基础练习题.Collectiong练习.test6;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(listTest(list,2));
        System.out.println(listTest(list,5));
    }
    public static int listTest(ArrayList<Integer> list,Integer s){
        for(int i =0 ;i<list.size();i++){
            if (list.get(i).equals(s))
                return i;
        }
        return -1;
    }
}
