package CUI练习;

import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
public class Teacher implements ActionListener{
	int numberOne,numberTwo;
	String operator="";
	boolean isRight;
	Random random;
	int maxInteger;
	JTextField textOne,textTwo,textResult;
	JLabel operatorLabel,message;
	Teacher(){
		random=new Random();
	}
	public void setMaxInteger(int n) {
		maxInteger=n;
	}
	public void actionPerformed(ActionEvent e) {
		String str=e.getActionCommand();
		if(str.equals("getProblem")) {
			numberOne=random.nextInt(maxInteger)+1;
			numberTwo=random.nextInt(maxInteger)+1;
			double d=Math.random();
			if(d>=0.5){
				operator="+";
			}
			else{
				operator="-";
			}
			textOne.setText(""+numberOne);
			textTwo.setText(""+numberTwo);
			operatorLabel.setText(operator);
			message.setText(null);
		}
		if (str.equals("xiao")){
			numberOne =random.nextInt(maxInteger)+1;
			numberTwo =random.nextInt(maxInteger)+1;
			double d=Math.random();
			if(d>0&&d<=0.25){
				operator="+";
			}
			if (d>0.25&&d<=0.5){
				operator="-";
			}
			if (d>0.5&&d<=0.75){
				operator="*";
			}
			if (d>0.75&&d<=1){
				operator="/";
			}
			textOne.setText(""+numberOne);
			textTwo.setText(""+numberTwo);
			operatorLabel.setText(operator);
			message.setText(null);
		}
		 if(str.equals("answer")) {
			String answer=textResult.getText();
			try {int result=Integer.parseInt(answer);
			if(operator.equals("+")) {
				if(result==numberOne+numberTwo)
					message.setText("计算正确");
				else
					message.setText("计算错误");
			}
			if(operator.equals("*")) {
				if(result==numberOne*numberTwo)
					message.setText("计算正确");
				else
					message.setText("计算错误");
			}
			if(operator.equals("/")) {
				if(result==numberOne/numberTwo)
					message.setText("计算正确");
				else
					message.setText("计算错误");
			}
			if(operator.equals("-")){
				if(result==numberOne-numberTwo)
					message.setText("计算正确");
				else
					message.setText("计算错误");
			}
			}
			catch(NumberFormatException ex) {
				message.setText("请输入数字字符");
			}
			}
	}
	public void setJTextField(JTextField...t) {
		textOne=t[0];
		textTwo=t[1];
		textResult=t[2];
	}
	public void setJLabel(JLabel...label) {
		operatorLabel=label[0];
		message=label[1];
	}
}
