package ja_0817;

import java.io.File;

public class Dir {
	public static void main(String[] args) {
		
		File dir = new File("image");
		
		String[] strs = dir.list();
		
		for(int i = 0; i < strs.length; i++) {
			int str2 = strs[i].lastIndexOf(".");
			
			String str3 = strs[i].substring(str2 + 1);
			
			if(str3.equals("gif")) {
				System.out.println(strs[i]);
			}
		}
		
		for(int i = 0; i < strs.length; i++) {
			System.out.println("현재 디렉토리 화일 : " + strs[i]);
		}
	}
}