package ja_0729;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_1 {
	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap();

		map.put("1234", "korea");
		map.put("1234", "asdf");
		map.put("1234", "asdf");
		map.put("1234", "seoul");
		// key 값은 중복되지 않는다. 앞에 있는 것은 의미가 없어지고 마지막에 있는것만 유용하다.
		map.put("1234", "king");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("id와 password를 입력해주세요!");
			System.out.print("id : ");
			String id = sc.next();

			if (!map.containsKey(id)) {
				System.out.println(" 입력하신 " + id + " 는 존재하지 않습니다. 다시 입력해 주세요");
				continue;
				
			} else {
				System.out.println("password : ");
				String password = sc.next();
				System.out.println();

				if (!map.get(id).equals(password)) {
					System.out.println(map.get(id));
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요!");
				} else {
					System.out.println("축하합니다 로그인 하였습니다.");
					break;
				}
			}
		}

	}

}