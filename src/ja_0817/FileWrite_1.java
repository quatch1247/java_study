package ja_0817;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class FileWrite_1 {

	public static void main(String[] args) throws IOException {
		
		
		String file, str;
		Date date = new Date();
		str = "File Write Time\n " + date + "\n" + "ㅋㅋ \n";
		
		BufferedReader read = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("파일 이름을 입력");
		file = read.readLine();
		
		System.out.println("저장할 문자열을 입력");
		str += read.readLine();
		
		char[] ch_str = new char[str.length()];
		
		str.getChars(0, str.length(), ch_str, 0);
		
		FileWriter fww = new FileWriter(file);
		
		fww.write(ch_str);
		fww.close();
	
		System.out.println(file + "파일을 성공적으로 저장 하였습니다");
		
	}


}
