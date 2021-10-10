package IO流Exception;

import java.io.*;
import java.util.HashMap;

public class Test_paixu {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\out.txt"));
        String line;
        while ((line = br.readLine())!=null){
            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);
        }
        for(String key: map.keySet()){
            String value = map.get(key);
            line = key+"."+value;
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
