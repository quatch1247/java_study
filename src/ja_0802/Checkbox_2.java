package ja_0802;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
public class Checkbox_2 {
	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel;
 
	public Checkbox_2() {
		prepareGUI();
	}
 
	public static void main(String[] args) {
		Checkbox_2 awtControlDemo = new Checkbox_2();
		awtControlDemo.showCheckbox();
	}
 
	private void prepareGUI() {
		// Frame 에 대한 셋팅
		mainFrame = new Frame("AWT");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
 
		// 상단에 있는 라벨
		headerLabel = new Label();
		headerLabel.setAlignment(Label.CENTER);
		headerLabel.setText("좋아하는 꽃이름");
 
		// 하단 상태값 라벨
		statusLabel = new Label();
		statusLabel.setText("체크박스 상태");
		statusLabel.setAlignment(Label.CENTER);
		statusLabel.setSize(350, 100);
 
		controlPanel = new Panel();
		controlPanel.setLayout(new FlowLayout());
 
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}
 
	private void showCheckbox() {
 
		CheckboxGroup chkGroup = new CheckboxGroup();
		
		Checkbox chk1 = new Checkbox("장미", chkGroup, true);
		Checkbox chk2 = new Checkbox("백합", chkGroup, false);
		Checkbox chk3 = new Checkbox("코스모스", chkGroup, false);
 
		chk1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				statusLabel.setText("장미 체크박스 : " + "체크완료");
			}
		});
 
		chk2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				statusLabel.setText("백합 체크박스: " + "체크완료");
			}
		});
 
		chk3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				statusLabel.setText("코스모스 체크박스: " + "체크완료");
			}
		});
 
		controlPanel.add(chk1);
		controlPanel.add(chk2);
		controlPanel.add(chk3);
 
		mainFrame.setVisible(true);
	}
}