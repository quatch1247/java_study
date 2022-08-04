package ja_0803;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Panel_2 extends Frame{
	
	public Panel_2(String title) {
		super(title);
		//판넬 생성
		Panel panel1 = new Panel();
		
		//버튼 생성
		panel1.add(new Button("Panel 1 위의 버튼"));
		//체크박스 생성
		panel1.add(new Checkbox("홍길동"));
		//판넬 생성
		Panel panel2 = new Panel();
		//라벨 판넬에 붙이기
		panel2.add(new Label("라벨라벨"));
		//버튼 판넬에 붙이기
		panel2.add(new Button("Panel 2 위의 버튼"));
		
		//기본 레이아웃의 모양 프레임에 붙인 것!
		//North와 South 처리를 안해주면 Center에 모이게 되어 있음.
		add("North", panel1);
		add("Center", new Button("버튼"));
		add("East", new Button("버튼 East"));
		add("West", new Button("버튼 West"));
		add("South", panel2);
		
		setSize(400, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Panel_2 p_2 = new Panel_2("판넬");
	}

}
