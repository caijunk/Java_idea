package IO流Exception;

import java.io.*;

public class Test2_zhuanhuang {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("d:\\gbk.txt"),"gbk");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("d:\\我是utf_8.txt"),"utf-8");
        int len = 0;
        while ((len = inputStreamReader.read())!=-1){
            outputStreamWriter.write(len);
        }
        outputStreamWriter.close();
        inputStreamReader.close();
    }
}
