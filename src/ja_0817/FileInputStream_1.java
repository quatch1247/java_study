package ja_0817;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileInputStream_1 {

	public static void main(String[] args) throws Exception{
		
		int i = 0;
		String file;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
	
		System.out.println("읽어올 파일 이름");
		file = read.readLine();
		
		System.out.println(file + "문서 내용\r\n");
		
		FileInputStream fis = new FileInputStream(file);
		
		//FileReader fis = new FileReader(file);
		
		while((i = fis.read()) != -1) {
			System.out.println((char)i);
		}

	}

}
