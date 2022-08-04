package ja_0804;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Button Calculator
public class Calculator extends Frame implements ActionListener {

	private static final long serialVersionUID = 1L;

	// 멤버 필드
	private String[] sustr = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "+/-", "." };
	private Button[] subt = new Button[sustr.length];
	private String[] funstr = { "BackSpace", "CE", "C" };
	private Button[] funbt = new Button[funstr.length];
	private String[] operstr = { "+", "-", "*", "/" };
	private Button[] operbt = new Button[operstr.length];
	private Button equbt = new Button("=");
	private Label disp = new Label("0.", Label.RIGHT);
	
	private boolean first = true; // true 처음, false 처음이 아님. -> 숫자 입력하기 위한 멤버필드
	private boolean jumcheck = false; //false면 소수점을 누르지  않음, true 소수점을 누름.  
	private char operator = '+'; //연산자
	private double result = 0;
	
	// 생성자
	public Calculator() {
		super("Calculator");
		buildGUI();
		setEvent();
	}

	// 메서드
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// 숫자 입력 로직
		for(int i = 0; i<subt.length-2 ; i++) {
			if(e.getSource()== subt[i]) {
				
				//처음으로 눌렀음.
				if(first) {
					// 0 연속으로 누르는 것 방지
					if(disp.getText().equals("0.") && subt[i].getLabel().equals("0")) return;
					disp.setText(subt[i].getLabel()+".");
					first = false; //다음 번엔 처음이 아니게 한다.
				} 
				
				//처음이 아닌경우 
				else {
					String tmp = disp.getText();
					if(jumcheck) { //"." 을 누른 적이 있다.
						disp.setText(tmp + subt[i].getLabel());
					} else { // "."을 누른적이 없다. 
						tmp = tmp.substring(0, tmp.length()-1); //마지막 점을 뻄.
						disp.setText(tmp + subt[i].getLabel() + ".");
					}
				}
				return;
			}
		} //end subt
		
		
		// 부호 처리 로직
		if(e.getSource() == subt[subt.length-2]) {
			String tmp = disp.getText();
			if(tmp.equals("0.")) return; //처음 0일때  +/- 의미 x
			if(tmp.charAt(0) == '-') {
				disp.setText(tmp.substring(1));
			} else {
				disp.setText('-' + tmp);
			}
		}
		
		// 소수점 처리  로직 
		if(e.getSource()== subt[subt.length-1]) { 
			first = false;
			jumcheck = true;
			return;
		}
		
		// 연산자 처리  로직
		for(int i = 0 ; i<operbt.length ; i++) {
			if(e.getSource() == operbt[i]) {
				calc();//계산
				operator = operbt[i].getLabel().charAt(0);
				first = true;
				jumcheck = false;
			}
		}
		
		// '=' 처리로직 
		if(e.getSource() == equbt) {
			calc();
			first = true;
			jumcheck = false;
			operator = '+';
			result = 0;
			return;
		}
		
		// "backSpace" 처리로직 
		if(e.getSource() == funbt[0]) {
			String tmp = disp.getText(); 
			if(tmp.equals("0.")) return; 
			
			//2. 5. 인 경우..
			if(tmp.length() == 2) {
				disp.setText("0.");
				first = true;
				jumcheck = false;
				return;
			}
			//-4.등등 인경우.
			if(tmp.length() == 3 && tmp.charAt(0) =='-') {
				disp.setText("0.");
				first = true;
				jumcheck = false;
				return;
			}
			
			// + 인경우 ex)2.3
			if(tmp.length() == 3 && tmp.charAt(0) =='0') {
				disp.setText("0.");
				first = true;
				jumcheck = false;
				return;
			}
			
			if(tmp.charAt(tmp.length()-1)== '.') {
				tmp = tmp.substring(0,tmp.length() -2);
				disp.setText(tmp  +".");
			} else {
				disp.setText(tmp.substring(0,tmp.length() -1));
			}
			return;
		}
		
		// "CE" 처리로직 
		if(e.getSource() == funbt[1]) {
			disp.setText("0.");
			first = true;
			jumcheck = false;
			result = 0;
			return;		
		}
		
		// "C" 처리로직 
		if(e.getSource() == funbt[2]) {
			disp.setText("0.");
			first = true;
			jumcheck = false;
			operator = '+';
			result = 0;
			return;
		}
	}
	
	public void calc() {
		double value =Double.parseDouble(disp.getText());
		switch(operator){
			case '+' : result = result + value; break;
			case '-' : result = result - value; break;
			case '*' : result = result * value; break;
			case '/' : result = result / value; break;
		}
		
		//소수점 처리
		double val = result - (int)result;
		if(val > 0) {
			disp.setText(String.valueOf(result));
		} else {
			disp.setText(String.valueOf((int)result)+".");
		}
		
	}
	
	//이벤트 연결
	public void setEvent() {
		for(int i = 0 ; i<subt.length; i++) 
			subt[i].addActionListener(this);
		
		for(int i = 0 ; i<funbt.length; i++) 
			funbt[i].addActionListener(this);
		
		for(int i = 0 ;i<operbt.length; i++) 
			operbt[i].addActionListener(this);
		
		equbt.addActionListener(this);
		
		//익명클래스로 이벤트 달기
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	// 화면  구성
	public void buildGUI() {
		setBackground(Color.cyan);
		add("North", new Label()); //여백
		add("South", new Label()); //여백
		add("West", new Label()); //여백
		add("East", new Label()); //여백
		
		//기본 BorderLayout
		
		Panel mainPanel = new Panel(new BorderLayout(3,3));
			disp.setBackground(Color.white);
			disp.setFont(new Font("Serif", Font.BOLD,15));
			mainPanel.add("North", disp); 
			
			Panel cPanel = new Panel(new GridLayout(1,2,3,3));
				Panel cleftPanel = new Panel(new GridLayout(4,3,3,3));
					for(int i = 0 ;i<subt.length;i++) {
						subt[i] = new Button(sustr[i]); //버튼 초기화
						subt[i].setFont(new Font("Serif", Font.BOLD,15));
						cleftPanel.add(subt[i]);
					}
				cPanel.add(cleftPanel);
				
				Panel crightPanel = new Panel(new GridLayout(4,1,3,3));
					Panel cr1Panel =new Panel(new GridLayout(1,3,3,3));
						for(int i = 0 ; i<funbt.length; i++) {
							funbt[i] = new Button(funstr[i]);
							funbt[i].setFont(new Font("Serif", Font.BOLD,15));
							cr1Panel.add(funbt[i]);
						}
					crightPanel.add(cr1Panel);
					
					Panel cr2Panel =new Panel(new GridLayout(1,3,3,3));
					Panel cr3Panel =new Panel(new GridLayout(1,3,3,3));
						for(int i = 0 ; i<operstr.length ;i++) {
							operbt[i] = new Button(operstr[i]);
							operbt[i].setFont(new Font("Serif", Font.BOLD,15));
							if(i<2) cr2Panel.add(operbt[i]);
							else cr3Panel.add(operbt[i]);
						}
						
					crightPanel.add(cr2Panel);
					crightPanel.add(cr3Panel);
					
					equbt.setFont(new Font("Serif", Font.BOLD,15));
					crightPanel.add(equbt);
					
				cPanel.add(crightPanel);
			mainPanel.add("Center",cPanel);
		
		add("Center", mainPanel);
		
		pack();
		
		Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension my = getSize();
		setLocation(scr.width / 2 - my.width / 2, scr.height / 2 - my.height / 2);
		
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

}