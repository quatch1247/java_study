package ja_0729;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_3 {
	
	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		
		
		
		addPhoneNO("회사", "수선화", "010-2279-2324");
		
		
		addPhoneNO("회사", "해당화", "010-234-6564");
		addPhoneNO("친구", "해당화", "010-345-4747");
		addPhoneNO("친구", "들국화", "010-123-2222");
		addPhoneNO("친구", "해바라기", "010-3333-4444");
		addPhoneNO("친구", "들국화", "010-6634-5555");
		addPhoneNO("회사", "들국화", "010-2723-2323");
		addPhoneNO("회사", "영산강", "010-1279-2324");
		addPhoneNO("회사", "섬진강", "010-2279-2324");
		addPhoneNO("회사", "금강", "010-2279-6666");
		addPhoneNO("회사", "한강", "010-9999-7777");
		addPhoneNO("세탁", "010-2279-2324");
		
		printList();
		
	}
	
	
	// 전화 번호부 전체를 출력
	private static void printList() {
		
		Set set = phoneBook.entrySet();
		Iterator itt = set.iterator();
		
		while(itt.hasNext()) {
			
			Map.Entry e = (Entry) itt.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");
			
			while(subIt.hasNext()) {
				
				Map.Entry subE = (Entry) subIt.next();
				
				String telNo = (String) subE.getKey();
				String name = (String) subE.getValue();
				
				System.out.println(name + " " + telNo);
			}
			
			System.out.println();
					
		}
		
		
	}

	// addPhoneNO("세탁", "010-2279-2324");
	private static void addPhoneNO(String name, String tel) {
		
		addPhoneNO("기타", name, tel);
	}
	
	
	// addPhoneNO("회사", "수선화", "010-2279-2324");
	private static void addPhoneNO(String groupName, String name, String tel) {
		
		addGroup(groupName);
		
		HashMap group = (HashMap) phoneBook.get(groupName);
		group.put(tel, name);
				
	}
	
	private static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
	}

}
