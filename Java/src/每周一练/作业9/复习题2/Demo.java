package 每周一练.作业9.复习题2;

import java.util.Collections;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student(01,"张三",65);
        Student student2 = new Student(02,"李四",76);
        Student student3 =  new Student(03,"王五",45);
        Student student4 =  new Student(04,"李六",99);
        LinkedList <Student> linkedList = new LinkedList();
        linkedList.add(student1);
        linkedList.add(student2);
        linkedList.add(student3);
        linkedList.add(student4);
        Collections.sort(linkedList);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i).getNumber()+" ");
            System.out.print(linkedList.get(i).getName()+" ");
            System.out.print(linkedList.get(i).getScore()+"分");
            System.out.println("");
        }
        System.out.print(linkedList.getFirst().getNumber()+" ");
        System.out.print(linkedList.getFirst().getName()+" ");
        System.out.print(linkedList.getFirst().getScore()+"分");

        }
    }

