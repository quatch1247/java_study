package ja_0803;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class Canvas_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("CanvasTest~~~");
		
		ff.setSize(300, 300);
		ff.setLayout(null);
		
		Canvas cc11 = new Canvas();
		
		cc11.setBackground(Color.pink);
		cc11.setBounds(100, 100, 150, 100);
		
		Canvas cc22 = new Canvas();
		
		cc22.setBackground(Color.blue);
		cc22.setBounds(100, 210, 150, 100);
		
		ff.add(cc11);
		ff.add(cc22);
		
		ff.setVisible(true);
		
	}

}
