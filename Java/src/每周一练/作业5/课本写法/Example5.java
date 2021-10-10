package 每周一练.作业5.课本写法;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example5 {
    public static void main(String[] args) {
        WindowActionEvent win = new WindowActionEvent();
        ReaderListen readerListen = new ReaderListen();
        win.setBounds(100,100,400,300);
        win.setListener(readerListen);
        win.setTitle("操作GUI及事件响应");

    }
}
class WindowActionEvent extends JFrame{

    JTextField jTextField =new JTextField(20);
    JLabel jLabel=new JLabel();
    JButton jButton=new JButton("确定");
    MyCommandListener listener;

    public WindowActionEvent(){
        init();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void init(){
        setLayout(new BorderLayout());
        add(jTextField,BorderLayout.NORTH);
        add(jLabel,BorderLayout.CENTER);
        add(jButton,BorderLayout.SOUTH);
        add(new JScrollPane(jLabel));
    }
    void setListener(MyCommandListener listener){
        this.listener = listener;
        listener.setJTextField(jTextField);
        listener.setJLabel(jLabel);
        jTextField.addActionListener(listener);
        jButton.addActionListener(listener);
    }


}

interface MyCommandListener extends ActionListener{
    public void setJTextField(JTextField text);
    public void setJLabel(JLabel jLabel);

}

class ReaderListen implements MyCommandListener{
    JTextField textField;
    JLabel jLabel2;

    public void setJTextField(JTextField text) {
        textField = text;
    }

    public void setJLabel(JLabel jLabel) {
        jLabel2 = jLabel;
    }


    public void actionPerformed(ActionEvent e) {
        String str = textField.getText();
        if(str.length() == 0){
            jLabel2.setText("什么都没有，请输入！");
        }else{
            jLabel2.setText(str+",长度为"+str.length());
        }
    }
}
