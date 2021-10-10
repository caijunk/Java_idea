package 时间类;

import java.text.SimpleDateFormat;
import java.util.Date;

public class  Time {


    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String text = sdf.format(date);
            System.out.println(text);
            Thread.sleep(1000);

        }
    }
}



