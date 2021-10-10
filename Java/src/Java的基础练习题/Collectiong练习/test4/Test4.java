package Java的基础练习题.Collectiong练习.test4;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        Object[] objects = list.toArray();
        for(Object obj:objects){
            System.out.println(obj);
        }
    }
}
