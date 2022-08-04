package ja_0803;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class BorderLayout_1 extends Frame {
	
	/*
	 *    .BorderLayout
	 *    
	 *    : 보더 레이아웃은 동, 서, 남, 북, 중앙으로 화면을 분할합니다.
	 *    중앙에는 중요한 컴포넌트를 두고, 그 주변에 보조 컴포넌트를 배치할 때 사용합니다.
	 *    Frame 컨테이너의 기본 레이아웃 입니다.
	 * 
	 * 
	 */
	
	 BorderLayout bb1 = new BorderLayout();
	
	public BorderLayout_1(String title) {
		super(title);
		setLayout(bb1);
		
		add("North", new Button("북쪽")).setBackground(Color.DARK_GRAY);
		add("West", new Button("서쪽")).setBackground(Color.cyan);
		add("East", new Button("동쪽")).setBackground(Color.blue);
		add("Center", new Button("중앙")).setBackground(Color.red);
		add("South", new Button("남쪽")).setBackground(Color.orange);
		
		setSize(300, 300);
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new BorderLayout_1("Borderlayout Test");
	}

}
