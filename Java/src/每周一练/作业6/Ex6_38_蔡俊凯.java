package 每周一练.作业6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex6_38_蔡俊凯 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader  = new FileReader("C:\\Users\\Cai\\Desktop\\string.txt");
        System.out.print("变化前的字符串：");
        int len ;
        while((len = fileReader.read())!=-1) {
            System.out.print((char) len);
        }
        System.out.println( );
        FileReader fileReader1  = new FileReader("C:\\Users\\Cai\\Desktop\\string.txt");
        FileWriter fileWriter =  new FileWriter("C:\\Users\\Cai\\Desktop\\result.txt");
        System.out.print("变化后的字符串：");
        while((len = fileReader1.read())!=-1){
                if (len>=97&&len<=123){
                    int num = len-32;
                    System.out.print((char) num);
                    fileWriter.write(num);
            }else {
                    System.out.print((char) len);
                    fileWriter.write(len);
                }

        }
        fileReader.close();
        fileReader1.close();
        fileWriter.close();
    }
}
