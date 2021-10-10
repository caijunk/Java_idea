package 每周一练.作业5.另外写法;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        Window window = new Window();
    }
}


class Window extends JFrame{
    JTextField jTextField = new JTextField(20);
    JLabel jLabel = new JLabel();
    JButton jButton = new JButton("确定");
    ReaderListener readerListener = new ReaderListener();
     public Window(){

         setLayout(new BorderLayout());
         setBounds(400,400,300,300);
         setTitle("测试");
         add(jTextField,BorderLayout.NORTH);
         add(jLabel,BorderLayout.CENTER);
         add(jButton,BorderLayout.SOUTH);
         jButton.addActionListener(readerListener);
         setVisible(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         readerListener.setjTextField(jTextField);
         readerListener.setjLabel(jLabel);
     }



}


class ReaderListener implements ActionListener{
    JTextField jTextField;
    JLabel jLabel;

    public void setjTextField(JTextField jTextField) {
        this.jTextField = jTextField;
    }

    public void setjLabel(JLabel jLabel) {
        this.jLabel = jLabel;
    }

    public void actionPerformed(ActionEvent e) {
        String str = jTextField.getText();
        jLabel.setText(str+"的长度为："+str.length());
    }
}