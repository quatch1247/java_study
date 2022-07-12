package ja_0708;

import java.util.Random; // 자바 랜덤 함수?
import java.util.Set;
import java.util.TreeSet;

//트리셋 : hashset이랑 비슷하게 중복 데이터를 저장하지 않고 저장 순서를 유지하지 않음

public class lotto {
    public static void main(String[] args) {
    	
    	System.out.printf("\t 중복되지 않는 로또 번호 \n\n");
    	
        Random random = new Random();
        random.setSeed(System.nanoTime());

        int min = 1, max = 45;
        
        Set<Integer> result = new TreeSet<>();
        while (result.size() != 6) {
            result.add(random.nextInt(max - min + 1) + min);
        }
        for (int number : result) {
        	
            System.out.println("\t"+number+"\n");
            
        }
    }
}
