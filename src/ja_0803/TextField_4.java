package ja_0803;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextField_4 extends Frame{
	
	public TextField_4(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		TextArea txt1 = new TextArea("간단한 메모를 입력");
		TextArea txt2 = new TextArea(10, 20);
		TextArea txt3 = new TextArea("문자열,문자열,,,", 5, 30);
		
		add(txt1);
		add(txt2);
		add(txt3);
		
		setSize(500, 500);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new TextField_4("집에가고싶당");
	}

}
