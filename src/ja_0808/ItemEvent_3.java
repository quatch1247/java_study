package ja_0808;

import java.awt.*;
import java.awt.event.*;

public class ItemEvent_3 extends Frame implements ItemListener{
	
	Label lb1;
	Label lb2;
	Checkbox cb1;
	Checkbox cb2;
	TextArea ta1;
	
	ItemEvent_3(){
		
		// Checkbox ItemEvent
		
		lb1 = new Label("");
		lb1.setAlignment(lb1.CENTER);
		lb1.setSize(300,100);
		
		cb1 = new Checkbox("체크 1");
		cb1.setBounds(100,100,80,50);
		cb2 = new Checkbox("체크 2");
		cb2.setBounds(100,150,80,50);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		
		// KeyListener
		
		lb2 = new Label("");
		lb2.setBounds(100, 200, 150, 50);
	
		
		add(lb1);
		add(cb1);
		add(cb2);
		add(lb2);
		setTitle("Item Listener Interface");
		setSize(500,700);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ItemEvent_3();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == cb1)
			lb1.setText("체크박스 1 : "
					+ (e.getStateChange()==1?"체크완료" : "체크취소"));
		if(e.getSource() == cb2)
			lb1.setText("체크박스 2 : "
					+ (e.getStateChange()==1?"체크완료" : "체크취소"));
	}

}