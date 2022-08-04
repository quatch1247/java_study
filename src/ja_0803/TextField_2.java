package ja_0803;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class TextField_2 extends Frame{
	
	
	public TextField_2(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		//텍스트를 쓸 수 있는 공간 생성
		TextArea txt1 = new TextArea(10, 30);
		
		TextField txt2 = new TextField("안녕하세요", 20);
		
		txt1.setText("문자열 입력~~");
		txt1.setBackground(Color.yellow);
		txt1.setFont(new Font("궁서체", Font.ITALIC | Font.BOLD, 17));
		txt1.setForeground(Color.blue);
		
		txt2.setEchoChar('#');
		txt2.setForeground(Color.green);
		
		add(txt1);
		add(txt2);
		
		setSize(300, 330);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TextField_2("t2");
	}
	

}
