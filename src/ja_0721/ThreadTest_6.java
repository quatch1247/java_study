package ja_0721;

import javax.swing.JOptionPane;

public class ThreadTest_6 {

	public static void main(String[] args) {
		
		
		String input = JOptionPane.showInputDialog("아무값이나 입력");
		System.out.println("입력하신 값 : "+ input + " 이예요~");
		
		for(int i = 10; i> 0; i--) {
			System.out.println("\t\t" + i);
			
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\t\t끝");
	}


}
