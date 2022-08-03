package ja_0801;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Button_2 extends Frame{
		Label Lbl1, Lbl2, Lbl3;
		Button btn1, btn2, btn3;
		
		public Button_2(String str) {
			super(str);
			setLayout(new FlowLayout());
			Lbl1 = new Label("가위");		
			Lbl2 = new Label("바위");		
			Lbl3 = new Label("보");		
			
			btn1 = new Button("가위");		
			btn2 = new Button("바위");		
			btn3 = new Button("보");	
			
			add(Lbl1);	add(btn1);
			add(Lbl2);	add(btn2);
			add(Lbl3);	add(btn3);
			
			Lbl1.setEnabled(false);
			btn1.setEnabled(false);
			
			setSize(300, 200);
			setLocation(300, 300);
			setVisible(true);	
	}
public static void main(String[] args) {
	new Button_2("버튼과 레이블");
}

}



