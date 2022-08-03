package ja_0802;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class List_1 {
	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel, buttonPanel;

	public List_1() {
		prepareGUI();
	}

	public static void main(String[] args) {
		List_1 awtlistcontrol = new List_1();
		awtlistcontrol.showList();
	}

	private void prepareGUI() {
		// Frame 에 대한 셋팅
		mainFrame = new Frame("배고파아아앙");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(4, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});

		// 상단에 있는 라벨
		headerLabel = new Label();
		headerLabel.setAlignment(Label.CENTER);
		headerLabel.setText("리스트");

		// 하단 상태값 라벨
		statusLabel = new Label();
		statusLabel.setText("라벨 상태값");
		statusLabel.setAlignment(Label.CENTER);
		statusLabel.setSize(350, 100);

		controlPanel = new Panel();
		controlPanel.setLayout(new FlowLayout());
		
		buttonPanel = new Panel();
		buttonPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(buttonPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}

	private void showList() {

		final List fruitList = new List(4, false);
		fruitList.add("386DX");
		fruitList.add("486DX");
		fruitList.add("486DX66");
		fruitList.add("펜티엄");

		final List vegetableList = new List(4, true);
		
		vegetableList.add("펜티엄4");
		vegetableList.add("에슬론xp3");
		vegetableList.add("인텔듀얼");
		vegetableList.add("수박");

		Button showButton = new Button("선택한값보기");
		Button deleteButton = new Button("선택한삭제");
		
		showButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "1번 : " + 
						fruitList.getItem(
								fruitList.getSelectedIndex());
				
				data += ",    2번 : ";
				for (String vegetable : vegetableList.getSelectedItems()) {
					data += vegetable + " ";
				}
				statusLabel.setText(data);
			}
		});
		
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 단일 리스트 삭제 
				fruitList.remove(fruitList.getSelectedIndex());
				
				// 멀티 선택 리스트 삭제 
				int delCount = 0;
				for (int pos : vegetableList.getSelectedIndexes()) {
					vegetableList.remove(pos - delCount);
					delCount++;
				}
			}
		});

		controlPanel.add(fruitList);
		controlPanel.add(vegetableList);
		buttonPanel.add(showButton);
		buttonPanel.add(deleteButton);

		mainFrame.setVisible(true);
	}
}