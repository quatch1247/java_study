package ja_0801;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

class JFrameWindowClosingEventHandler extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		JFrame frame = (JFrame)e.getWindow();
		frame.dispose();
		System.out.println("windowClosing()");
	}
}

class JFrameWindow extends JFrame {
	JFrameWindow(String title) {
		super(title);
		this.setSize(300, 200);
		this.setVisible(true);
		this.addWindowListener(new JFrameWindowClosingEventHandler());
	}
}

public class Frame_2 {
	public static void main(String[] args) {
		JFrameWindow frameWindow = new JFrameWindow("Window");
	}
}


