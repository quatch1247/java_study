package ja_0727;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list_1 = new ArrayList<Integer>(10);
		
		list_1.add(5);
		list_1.add(new Integer(4));
		list_1.add(new Integer(3));
		list_1.add(new Integer(2));
		list_1.add(new Integer(1));
		list_1.add(new Integer(0));
		list_1.add(new Integer(1));
		list_1.add(new Integer(3));
		
		ArrayList<Comparable> list_2 = new ArrayList<Comparable>(list_1.subList(1,4));
		
		print(list_1, list_2);
		
		Collections.sort(list_1);
		Collections.sort(list_2);;
		print(list_1, list_2);
		
		System.out.println("List_1.containsAll(list_2) : " + list_1.contains(list_2));
		
		list_2.add("B");
		list_2.add("C");
		list_2.add("A");
		
		System.out.println("List_1.containsAll(list_2) : " + list_1.contains(list_2));
		
		print(list_1, list_2);
		
		list_2.set(3, "Queen"); // 3번 인덱스값 변경
		print(list_1, list_2);
		
		//리스트1에서 리스트2와 겹치는 부분만 남기고 나머지 삭제
		System.out.println(("list_1.retainAll(list_2) : " + list_1.retainAll(list_2)));
		print(list_1, list_2);
		
		//리스트2에서 리스트1에 포함된 객체들을 삭제
		
		for (int i = list_2.size()-1; i>=0; i--) {
			if(list_1.contains(list_2.get(i))) {
				list_2.remove(i);
			}
			
		}
		
		print(list_1, list_2);
		
		
	}
	
	private static void print(ArrayList<Integer> list_1, ArrayList<Comparable> list_2) {
		System.out.println("list_1 : " + list_1);
		System.out.println("list_2 : " + list_2);
		System.out.println();
		
	}

}


