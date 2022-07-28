package ja_0728;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_2 {

	public static void main(String[] args) {
		
		HashSet<String> setA = new HashSet<String>();
		HashSet<String> setB = new HashSet<String>();
		HashSet<String> setHab = new HashSet<String>();
		HashSet<String> setKyo = new HashSet<String>();
		HashSet<String> setCha = new HashSet<String>();
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A = " + setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B = " + setB);
		
        // 교집합 구하기
		Iterator<String> it = setB.iterator();
		while(it.hasNext()) {
			String temp = (String) it.next();
			if(setA.contains(temp)) { // 중복이 있는지 확인하기(생략가능)
				setKyo.add(temp);
			}
		}
		
        // 차집합 구하기
		it = setA.iterator();
		while(it.hasNext()) {
			String temp = (String)it.next();
			if(!setB.contains(temp)) { // 집합의 원소가 없을 경우 
				setCha.add(temp);
			}
		}
		
        // 합집합 구하기
		it = setA.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		
		it = setB.iterator();
		while(it.hasNext()) { // 중복값은 입력이 안될 것이기 때문에 괜찮음
			setHab.add(it.next());
		}
		
		System.out.println("A ∩ B = " + setKyo);
		System.out.println("A ∪  B = " + setHab);
		System.out.println("A - B = " + setCha);
		
	}
	}
	
