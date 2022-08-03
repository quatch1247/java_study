package ja_0802;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Frame_5 {

	public static void main(String[] args) {
	
	
		Frame ff = new Frame("중앙 배열");
		
		ff.setSize(400,300);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		//구현된 Toolkit 객체를 얻는다.
		
		Dimension screenSize = tk.getScreenSize();
		//화면의 크기를 구한다.
		//화면 크기의 절반값에서 Frame 크기의 절반 값을 뺀 위치로 하면
		//Frame이 화면 가운데 위치하게 된다.
		
		ff.setLocation(screenSize.width / 4*3 - 200, screenSize.height / 4*3 - 150);
		ff.setVisible(true);

	}

}
