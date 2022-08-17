package ja_0817;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader_4 {

	public static void main(String[] args) {


		Path path = Paths.get("C:\\Users\\ASUS\\Desktop\\kh\\0701.txt");
		
		Charset cs = StandardCharsets.US_ASCII;
		
		List<String> list = new ArrayList<>();
		
		try {
			list = Files.readAllLines(path, cs);
		}catch(IOException e) {
			e.printStackTrace();
		}
		for(String readLine : list) {
			System.out.println(readLine);
		}

	}

}
