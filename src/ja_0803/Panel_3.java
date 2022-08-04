package ja_0803;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Panel_3 extends Frame{
	
	Panel n, w, e, c, s;
	
	public Panel_3(String title) {
		super(title);
		
		n = new Panel();
		w = new Panel();
		e = new Panel();
		s = new Panel();
		c = new Panel();
		
		n.setBackground(new Color(255, 0, 0));
		w.setBackground(new Color(0, 255, 0));
		e.setBackground(new Color(0, 0, 255));
		s.setBackground(new Color(115, 155, 0));
		c.setBackground(new Color(152, 66, 24));
		
		n.add(new Button("패널 1"));
		w.add(new Button("패널 2"));
		e.add(new Button("패널 3"));
		s.add(new Button("패널 4"));
		c.add(new Button("패널 5"));
		
		add("North", n);
		add("West", w);
		add("East", e);
		add("Center", c);
		add("South", s);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Panel_3 p_3 = new Panel_3("Panel Test~~~");
	}

}
