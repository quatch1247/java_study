package ja_0727;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_2 {

	public static void main(String[] args) {
	
	int i;
	
	Date date = new Date();
	
	Vector<Comparable> vv = new Vector<Comparable>(3, 5);
	
	vv.addElement("Java");
	vv.add(new Double(56.7));
	vv.addElement(date);
	
	System.out.println("====== 3개의 객체 추가 ======");
	System.out.println("size 11 : " + vv.size()+", " + "capacity : " + vv.capacity());
	System.out.println("=========================");
	
	for (int j = 0; j < 10; j++) {
		
		vv.add(new Integer(j+1));
		
	}
	vv.add("korea");
	
	System.out.println();
	System.out.println("====== 3개의 객체 추가 ======");
	System.out.println("size 22 : " + vv.size() + ", " +"capacity : " + vv.capacity());
	System.out.println();
	System.out.println("====== Vector 내용 출력 ======");
	
	Enumeration enu = vv.elements();
	while(enu.hasMoreElements()) {
		System.out.println(enu.nextElement() + " ");
	}
	System.out.println("====== 객체 포함 확인 ======");
	if(vv.contains("Javar")) {
		System.out.println("Java 문자열 포함됨");
	}else
		System.out.println("Java 문자열 포함 안안안안됨");
	
	//date 객체 삭제
	
	System.out.println("56.7 객체 위치 : " +vv.indexOf(new Double(56.7)));
	System.out.println("\n 입력시간 : " +vv.get(vv.indexOf(date)));
	
	for (int j = 0; j < vv.size(); j++) {
		
		vv.removeElementAt(j);
		
	}
	
	vv.setElementAt("seoul", 2); // 3번째 위치한 korea 문자열 추가
	
	enu = vv.elements();
	
	while(enu.hasMoreElements()) {
		System.out.println(enu.nextElement() + " ");
	}
	System.out.println("\n size : " + vv.size()+",capacity : " + vv.capacity());
	
	vv.trimToSize();//공백제거
	System.out.println("\n size : " + vv.size()+",capacity : " + vv.capacity());
	
	vv.setSize(3);//크기를 2로 조정
	
	enu = vv.elements();
	
	while(enu.hasMoreElements()) {
		System.out.println(enu.nextElement() + " ");
	}
	
	vv.removeAllElements();//a모든 객체 제거
	System.out.println("\n size : " + vv.size()+",capacity : " + vv.capacity());
	
	
	
	
	
	}

}
