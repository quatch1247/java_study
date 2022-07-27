package ja_0727;

import java.awt.List;
import java.util.ArrayList;

public class ArrayList_2 {

	public static void main(String[] args) {
		
		final int LIMIT = 10;
		
		String source ="123456789asdfghjk!@#$%^&*()zzz";
		
		int length = source.length();
		ArrayList list =new ArrayList(length / LIMIT + 10); //  크기를 약간 여유있게
		
		for (int i = 0; i < length; i+= LIMIT) {
			
			if(i + LIMIT < length) {
				
				list.add(source.substring(i, i + LIMIT));
				
			}else
				list.add(source.substring(i));
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}

	}

}
