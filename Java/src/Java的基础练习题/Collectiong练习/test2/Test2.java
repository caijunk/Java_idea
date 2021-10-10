package Java的基础练习题.Collectiong练习.test2;

import java.util.ArrayList;
import java.util.Collection;

public class Test2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:"+listTest(list, "a"));
        System.out.println("b:"+listTest(list, "b"));
        System.out.println("c:"+listTest(list, "c"));
        System.out.println("xxx:"+listTest(list, "xxx"));
    }
    public static int listTest(Collection<String> list,String s){
        int count = 0;
        for (String string : list) {
            if (string.equals(s)){
                count++;
            }
        }
        return count;
    }
}
