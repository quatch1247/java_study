package ja_0817;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileReader_3 {

	public static void main(String[] args) {
		try {
			//파일 객체 생성
			File file = new File("C:\\Users\\ASUS\\Desktop\\kh\\0701.txt");
			
			//스캐너로 파일 읽기
			Scanner scan = new Scanner(file);
			
			while(scan.hasNextLine()) {
				//System.out.println(scan.next());
				System.out.println(scan.next());
			}
		}catch(FileNotFoundException e) {
	}catch(NoSuchElementException e) {
	}

}
}
