package ja_0729;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSet_1 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		// TreeSet을 내림차순 설정하는 방법.
		// TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		
		int[] score = {75, 48, 66, 83, 34, 45, 10, 23, 34, 35, 23};
		
		for(int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}
		// TreeSet에 자동적으로 정렬이 이루어져있다.
		System.out.println(set);
		
		System.out.println("65 보다 작은 값 : " + set.headSet(new Integer(65)));
		System.out.println("65 보다 큰 값 : " + set.tailSet(new Integer(65)));
		
		//HashSet과는 달리 TreeSet은 이진 탐색 트리(BinarySearchTree) 구조로 이루어져 있습니다.
		//이진 탐색 트리는 추가와 삭제에는 시간이 조금 더 걸리지만 정렬, 검색에 높은 성능을 보이는 자료구조입니다.
		//그렇기에 HashSet보다 데이터의 추가와 삭제는 시간이 더 걸리지만 검색과 정렬에는 유리합니다.
		//TreeSet은 데이터를 저장할 시 이진탐색트리(BinarySearchTree)의 형태로 데이터를 저장합니다.
		
		
		
		
		
	}
}
