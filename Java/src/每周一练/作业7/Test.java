package 每周一练.作业7;

import java.io.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Cai\\Desktop\\成绩1.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Cai\\Desktop\\成绩2.txt"));
        LinkedList<Student> list = new LinkedList<>();
        String str ; ;
        String regex = "\\s+";
        int count = 0;
        System.out.println("排序前的成绩:");
        while ((str = bufferedReader.readLine())!=null){
            String[] split = str.split(regex);
            list.add(new Student(split[0],Integer.parseInt(split[1])));
            System.out.print("学生的学号:"+split[0]+" ");
            System.out.println("学生的成绩:"+split[1]);
            count++;
        }
        int sum =0;
        for (int i = 0;i< list.size();i++){
            Student student = list.get(i);
            int score1 = student.score;
            sum+=score1;
        }
        System.out.println("平均成绩为:"+1.0*sum/count);
        System.out.println("排序后的成绩:");
        Collections.sort(list);
        Iterator<Student> iterator = list.iterator();
            while(iterator.hasNext()){
                Student s = iterator.next();
                bufferedWriter.write("学生的学号:");
                bufferedWriter.write(s.number);
                bufferedWriter.write("      ");
                bufferedWriter.write("学生的成绩:");
                bufferedWriter.write((String.valueOf(s.score)));
                bufferedWriter.newLine();
                System.out.print("学生的学号:"+s.number+" ");
                System.out.println("学生的成绩:"+s.score);
            }
        System.out.println("平均成绩为:"+1.0*sum/count);
            bufferedWriter.close();
            bufferedReader.close();
    }
}
