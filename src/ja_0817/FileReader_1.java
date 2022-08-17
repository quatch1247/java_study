package ja_0817;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader_1 {

	public static void main(String[] args) throws IOException {

		int i = 0;
		String file;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("읽어올 파일 이름을 입력하세요");
		file = read.readLine();
		
		System.out.println(file + "문서 내용***********");
		
		FileReader frr = new FileReader(file);
		
		while ((i = frr.read())!= -1) {
		 System.out.println((char)i);
		}
		frr.close();
	}

}
