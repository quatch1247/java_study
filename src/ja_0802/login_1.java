package ja_0802;

import java.awt.Frame;
import java.awt.Label;

public class login_1 {

	public static void main(String[] args) {
	
		Frame ff = new Frame("login");
		
		ff.setSize(300, 200);
		ff.setLayout(null);
		
		Label id = new Label("ID : ");
		id.setBounds(100, 100, 30, 18); //setLocation() + setSize()
		
		Label pwd = new Label("Password : ");
		pwd.setBounds(100, 120, 100, 18);
		
		ff.add(id);
		ff.add(pwd);
		
		ff.setVisible(true);
		

	}

}
