package 每周一练.作业8;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Targe implements Runnable{
    Window window;
    JTextField jTextField;
    JTextField jTextField2;

    public Targe(Window window, JTextField jTextField, JTextField jTextField2) {
        this.window = window;
        this.jTextField = jTextField;
        this.jTextField2 = jTextField2;
    }

    @Override
    public void run() {
        while (true) {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            String text = sdf.format(date);
            jTextField.setText(text);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
