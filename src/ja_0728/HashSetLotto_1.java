package ja_0728;

import java.util.HashSet;

public class HashSetLotto_1 {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>();		
		while (set.size() < 6) {			
			set.add((int) (Math.random() * 45) + 1);		
			}		
		System.out.println("로또 번호");
		System.out.println(set);	
		}
	

	}


