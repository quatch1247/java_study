package ja_0803;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Panel_4 extends Frame{
	
	public Panel_4(String title) {
		super(title);
		
		Panel panel1 = new Panel();
		//4행 2열의 격자무늬
		panel1.setLayout(new GridLayout(4, 2));
		
		panel1.setBackground(new Color(204, 204, 255));
		panel1.add(new Label(""));
		panel1.add(new Checkbox("리눅스"));
		panel1.add(new Label(""));
		panel1.add(new Checkbox("윈도우10"));
		panel1.add(new Label(""));
		panel1.add(new Checkbox("리눅스"));
		panel1.add(new Label(""));
		panel1.add(new Checkbox("윈도우10"));
		
		Panel panel2 = new Panel();
		
		Label lbl = new Label("환경설정");
		lbl.setForeground(new Color(255, 0, 0));
		
		panel2.setBackground(new Color(255, 204, 255));
		//panel2.add(new Label("환경설정", Label.Center)).setForeground(new Color(200, 100, 50));
		panel2.add(lbl);
		panel2.add(new Button("불러오기"));
		panel2.add(new Button("저장"));
		panel2.add(new Button("다른이름으로 저장"));
		
		add("North", panel1);
		add("Center", panel2);
		
		setSize(450, 180);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Panel_4("panel_4~~~~");
	}

}
