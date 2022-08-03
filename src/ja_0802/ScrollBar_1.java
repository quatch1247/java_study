package ja_0802;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;

public class ScrollBar_1 extends Frame {

 public ScrollBar_1(String title) {
	 super(title);
	 
	 Scrollbar srb1 = new Scrollbar(Scrollbar.VERTICAL, 10, 100, 0, 255);
	 Scrollbar srb2 = new Scrollbar(Scrollbar.HORIZONTAL, 100, 50, 0, 255);
	 
	 add("West", srb1);
	 add("Center", new Label("스크롤바 테스트"));
	 add("South", srb2);
	 
	 setSize(200, 200);
	 setVisible(true);
 }
 
 public static void main(String[] args) {
	new ScrollBar_1("ScrollBar Test~~");
}

}
