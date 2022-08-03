package ja_0729;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
//import java.util.Scanner;

public class HashMap_1 {
	public static void main(String[] args) throws Exception {
		
		HashMap<String, String> map = new HashMap();
		
		map.put("이건","전민우");
//		map.put(1111, 2314124);
//		map.put(4567, 1234);
//		map.put(7890, 23423);
		
//		// key 값은 중복되지 않는다. 앞에 있는 것은 의미가 없어지고 마지막에 있는것만 유용하다.
//		map.put(7890, 2324);
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				
//		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요!");
			System.out.print("id : ");
			String id = input.readLine();
			
			if(!map.containsKey(id)) {
				System.out.println(" 입력하신 " + id + " 는 존재하지 않습니다. 다시 입력해 주세요");
				continue;
				
			}else {
				System.out.println("password : ");
				String password = input.readLine().trim();
				
				System.out.println();
				
				if(!map.get(id).equals(password)) {
					// id 값에 상응되는 value 값을 보여준다.
					System.out.println("아이디는 "+map.get(id));
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요!");
				}else {
					System.out.println("축하합니다 로그인 하였습니다.");
					break;
				}
			}
		}
	}
}


