package ja_0802;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Checkboc_1 {

	public static void main(String[] args) {
		
		Frame ff = new Frame("체크박스 테스트~~");
		
		ff.setLayout(new FlowLayout());
		
		Checkbox cbx_1 = new Checkbox("남자", false);
		Checkbox cbx_2 = new Checkbox("여자", true);
		
		ff.add(cbx_1);
		ff.add(cbx_2);
		
		ff.setSize(200, 200);
		ff.setVisible(true);

	}

}
