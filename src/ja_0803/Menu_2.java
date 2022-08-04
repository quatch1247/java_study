package ja_0803;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Menu_2 extends Frame{
	
	public Menu_2(String title) {
		super(title);
		
		MenuBar mb = new MenuBar();
		Menu file = new Menu("파일");
		Menu dogu = new Menu("도구");
		
		CheckboxMenuItem file_new = new CheckboxMenuItem("새화일", true);
		// 클릭하면 Check 처리됨 ! 
		CheckboxMenuItem file_open = new CheckboxMenuItem("불러오기");
		// 구분선 처리 ! '_'(underbar)만 가능하다.
		MenuItem file_separator = new MenuItem("-");
		
		MenuItem file_close = new MenuItem("파일닫기");
		
		
		
		CheckboxMenuItem dogu_new = new CheckboxMenuItem("기본설정", true);
		
		CheckboxMenuItem dogu_open = new CheckboxMenuItem("정렬");
		
		MenuItem dogu_separator = new MenuItem("-");
		
		file.add(file_new);
		file.add(file_open);
		file.add(file_separator);
		file.add(file_close);
		
		
		dogu.add(dogu_new);
		dogu.add(dogu_open);
		dogu.add(dogu_separator);
		
		
		Menu edit = new Menu("편집");
		MenuItem edit_cut = new MenuItem("오려두기");
		MenuItem edit_paste = new MenuItem("붙이기");
		
		
		edit.add(edit_cut);
		edit.add(edit_paste);
		
		Menu gi = new Menu("기록");
		MenuItem gi_cut = new MenuItem("UTF-8");
		MenuItem gi_paste = new MenuItem("Euc_KR");
		
		
		gi.add(gi_cut);
		gi.add(gi_paste);
		
		
		// edit을 file에 담기
		file.add(edit);
		
		dogu.add(gi);
		
		// 메뉴바에 담기
		mb.add(file);
		mb.add(dogu);
		
		setMenuBar(mb);
		setSize(300, 300);
		setVisible(true);
		
		
	
	
	
	
	}
	
	public static void main(String[] args) {
		new Menu_2("메뉴");
	}

}
