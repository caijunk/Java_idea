package 每周一练.作业9.复习题1;

import java.io.*;

public class Text {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Cai\\Desktop\\1.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Cai\\Desktop\\2.txt"));
        String len = null;
        int num = 1;
        while ((len = bufferedReader.readLine())!= null){
//            bufferedWriter.write(num);
//            bufferedWriter.write(len);
            String str = num+":"+len;
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            num++;
//            int num2 = Integer.parseInt(num);
//            num2++;
//            num = num2 +"";
        }
        bufferedWriter.write("10 1班-37号-蔡俊凯");
        bufferedWriter.close();
        bufferedReader.close();
    }
}
