package ja_0803;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PopupMenu_1 extends Frame implements MouseListener{
	
	PopupMenu popup;
	TextArea txt;
	
	public PopupMenu_1(String title) {
		super(title);
		
		popup = new PopupMenu("나의 팝업 메뉴");
		txt = new TextArea("전민우 ~~ 전민우");
		
		MenuItem cut = new MenuItem("오려두기");
		MenuItem paste = new MenuItem("붙이기");
		MenuItem copy = new MenuItem("복사하기");
		
		popup.add(cut);
		popup.add(paste);
		popup.add(copy);
		
		txt.addMouseListener(this);
		txt.add(popup);
		
		add(txt);
		setSize(300, 300);
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new PopupMenu_1("popup menu Test");
	}
	
	
	
	// mouseEvent, Listenner 에는 5개의 메소드가 존재한다.
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		popup.show(txt, e.getX(), e.getY());
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}
