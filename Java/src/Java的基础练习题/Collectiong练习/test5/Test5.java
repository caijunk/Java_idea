package Java的基础练习题.Collectiong练习.test5;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("itcast");
        list.add("itheima");
        list.add("java");
        System.out.println(listTest(list,"jb"));
        System.out.println(listTest(list,"java"));
    }
    public static boolean listTest(ArrayList<String> list,String s){
        if(list.contains(s)){
            return true;
        }
        return false;
    }
}
