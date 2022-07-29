package ja_0728;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayList_5 {

	public static void main(String[] args) {
		
		ArrayList<Student_3> list = new ArrayList<>();
		
		list.add(new Student_3("수선화", 1, 1));
		list.add(new Student_3("백합", 1, 1));
		list.add(new Student_3("장미", 1, 1));
		list.add(new Student_3("코스모스", 1, 1));
		
		Iterator<Student_3> itt = list.iterator();
		
		while(itt.hasNext()) {
			Student_3 ss = itt.next();
			
			System.out.println(ss.name + "\t" + ss.ban + "\t" + ss.noo + "\n");
		}
		
		System.out.println();
		System.out.println();
		
		for(Student_3 stu : list) {
			System.out.println(stu.name);
		}
	}
}

class Student_3{
	String name = "";
	int ban;
	int noo;
	
	public Student_3(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.noo = no;
	}
}
