package IO流Exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {


    FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Cai\\Desktop\\1.jpg");
    FileOutputStream fileOutputStream = new FileOutputStream("D:\\1.jpg");
    byte[] bytes = new byte[1024];
    int len = 0;
    while((len = fileInputStream.read(bytes))!=-1) {
        fileOutputStream.write(bytes,0,len);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}
