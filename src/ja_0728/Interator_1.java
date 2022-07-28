package ja_0728;

import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

//벡터 어레이 차이
//벡터는 동기화 처리가 되어 있고 어레이는 동기화 처리 X 

public class Interator_1 {

	public static void main(String[] args) {
		
		//Vector list = new Vector();
		
		List list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add(8);
		list.add(9);
		list.add(new Date());
		list.add(45.899);
		
		Iterator itt = list.iterator();
		
//		Enumeration enu = list.elements();
		
		while(itt.hasNext()) {
			Object obj = itt.next();
			System.out.println(obj);
		}
//		
//		while(enu.hasMoreElements()) {
//			Object obj = enu.nextElement();
//			System.out.println(obj);
//		}
		

	}

}
