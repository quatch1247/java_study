package ja_0701;

import  java.awt.*;
class Window_1 extends Frame {
	public Window_1(String str) {
		super(str);
		setBounds(300,300,300,300);
		this. setBackground(new Color (255,0,0));
		setVisible(true);
	}
	public static void main(String[] arg) {
		new Window_1("윈도우 프로그램");
	}
}