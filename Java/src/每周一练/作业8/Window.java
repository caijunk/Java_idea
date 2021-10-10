package 每周一练.作业8;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    JLabel jLabel = new JLabel("当前时间:");
    JLabel jLabel2 = new JLabel("剩余时间:");
    JTextField jTextField = new JTextField();
    JTextField jTextField2 = new JTextField();
    public Window(){
        setLayout(new GridLayout(2,2));
        setBounds(400,400,600,150);
        setTitle("显示时间");
        add(jLabel);
        add(jTextField);
        add(jLabel2);
        add(jTextField2);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
