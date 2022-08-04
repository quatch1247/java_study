package ja_0804;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridLayout_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[GUI - 레이아웃 (layout) 배치 수행 - GridLayout , BorderLayout , FlowLayout]");
		
		/*[설 명]
		 * 1. 자바에서는 JFrame을 사용해서 GUI 프로그램을 만들 수 있습니다
		 * 2. new GridLayout(행, 열, 가로여백, 세로여백) 표시 - 테이블 모양 형식 
		 * 3. new BorderLayout(가로여백, 세로여백) : 동, 서, 남, 북, 가운데 모양 형식
		 * 4. new FlowLayout() : 가운데 중심 배치 레이아웃 (윈도우창 크기를 벗어나면 자동 줄바꿈 실시)
		 * */
		
		//TODO 부모 프레임 생성
		JFrame frm = new JFrame("레이아웃 배치 프로그램");
 
		//TODO 부모 프레임 크기 설정 (가로, 세로)
		frm.setSize(500, 500);
 
		//TODO 부모 프레임을 화면 가운데에 배치
		frm.setLocationRelativeTo(null);
 
		//TODO 부모 프레임을 닫았을 때 메모리에서 제거되도록 설정
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
		//TODO 부모 레이아웃 설정
		frm.getContentPane().setLayout(null);		
 
		//TODO 자식 컴포넌트 생성 [일반 첨부]	
		JButton btn1 = new JButton("1");
		btn1.setBounds(0, 0, 500, 30); //setBounds(가로위치, 세로위치, 가로길이, 세로길이);
		
		//TODO 자식 컴포넌트 생성 [GridLayout 첨부]
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		btn2.setBackground(Color.BLACK);
		btn3.setBackground(Color.BLACK);
		btn4.setBackground(Color.BLACK);
		btn5.setBackground(Color.BLACK);
		JPanel grid_panel = new JPanel();
		grid_panel.setLayout(new GridLayout(2, 2, 0, 0)); //테이블 형식 - 행, 열, 가로 여백, 세로 여백
		grid_panel.add(btn2);
		grid_panel.add(btn3);
		grid_panel.add(btn4);
		grid_panel.add(btn5);
		grid_panel.setBounds(0, 30, 500, 100); //setBounds(가로위치, 세로위치, 가로길이, 세로길이);
		
		//TODO 자식 컴포넌트 생성 [BorderLayout 첨부]
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btn10 = new JButton("10");
		btn6.setBackground(Color.GRAY);
		btn7.setBackground(Color.GREEN);
		btn8.setBackground(Color.CYAN);
		btn9.setBackground(Color.MAGENTA);
		btn10.setBackground(Color.ORANGE);
		JPanel border_panel = new JPanel();
		border_panel.setLayout(new BorderLayout(0, 0)); //동, 서, 남, 북, 가운데 형식 - 가로 여백, 세로 여백
		border_panel.add(btn6,BorderLayout.NORTH);
		border_panel.add(btn7,BorderLayout.SOUTH);
		border_panel.add(btn8,BorderLayout.EAST);
		border_panel.add(btn9,BorderLayout.WEST);
		border_panel.add(btn10,BorderLayout.CENTER);
		border_panel.setBounds(0, 130, 500, 100); //setBounds(가로위치, 세로위치, 가로길이, 세로길이);
		
		//TODO 자식 컴포넌트 생성 [FlowLayout 첨부]
		JButton btn11 = new JButton("11");
		JButton btn12 = new JButton("12");
		btn11.setBackground(Color.PINK);
		btn12.setBackground(Color.RED);
		JPanel flow_panel = new JPanel();
		flow_panel.setLayout(new FlowLayout()); //가운데 중심 배치 레이아웃 (윈도우창 크기를 벗어나면 자동 줄바꿈 실시)
		flow_panel.add(btn11);
		flow_panel.add(btn12);
		flow_panel.setBounds(0, 230, 500, 100); //setBounds(가로위치, 세로위치, 가로길이, 세로길이);
 
		//TODO 부모 프레임에다가 자식 컴포넌트 추가
		frm.getContentPane().add(btn1);
		frm.getContentPane().add(grid_panel);
		frm.getContentPane().add(border_panel);
		frm.getContentPane().add(flow_panel);
		
		//TODO 부모 프레임이 보이도록 설정
		frm.setVisible(true);
		
	}//메인 종료

}//클래스 종료
