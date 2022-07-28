package ja_0728;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_3 {

	public static void main(String[] args) {
	
	ArrayList<String> numbers = new ArrayList<>();
	
	numbers.add("10");
	numbers.add("20");
	numbers.add("30");
	numbers.add("40");
	System.out.println("add(값)");
	System.out.println(numbers);
	//arrylist 값 출력
	
	numbers.add(1, "50");
	System.out.println("\nadd(인덱스, 값)");
	System.out.println(numbers);
	//2번째에 50 집어넣기
	
	numbers.remove(2);
	System.out.println("\nremove(인덱스)");
	System.out.println(numbers);
	
	System.out.println("\nget(인덱스)");
	System.out.println(numbers.get(2));
	
	System.out.println("\nsize()");
	System.out.println(numbers.size());
	
	System.out.println("\nindexOf()");
	System.out.println(numbers.indexOf("45"));
	
	Iterator<String> it = numbers.iterator();
	
	System.out.println("\niterator");
	while(it.hasNext()) {
		String value = (String)it.next();
		if(value.equals("30")) {
			it.remove();
	//30 발견하면 지워버리기	
		}
		System.out.println(value);
	}
	System.out.println(numbers);
	
	System.out.println("\nfor each");
	for(String value : numbers) {
		System.out.println(value);
	}
	//foreach 이게 향상된 for문 근데 결과는 같음 ㅋㅋ
	
	System.out.println("\nfor");
	for(int i = 0; i< numbers.size(); i++) {
		System.out.println(numbers.get(i));
	}
	
	}

}
