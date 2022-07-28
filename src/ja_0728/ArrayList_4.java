package ja_0728;

import java.util.ArrayList;
import java.util.Iterator;


//어제 vector_3에서 만든거 arraylist로 변환하기
public class ArrayList_4 {

	public static void main(String[] args) {
		   int kor, eng, math, total;
	        double avg;
	        
	        String[] 이름 = {"송민우", "채희준", "김선주", "김영재", "이은지", "이진호",
	                         "박주혁", "권재욱", "김종렬", "김원득"};
	        
	        int[] 국어 = {77, 45, 67, 89, 33, 90, 54, 69, 78, 99};
	        int[] 영어 = {37, 45, 67, 89, 93, 90, 54, 69, 30, 99};
	        int[] 수학 = {34, 55, 67, 45, 23, 79, 67, 54, 43, 23};
	        
	        
	       // Vector vv = new Vector();
	        ArrayList vv = new ArrayList();
	        
	        for(int i = 0; i<10; i++){
	            vv.add((String)이름[i]);
	            vv.add(국어[i]);
	            vv.add(new Integer(영어[i]));
	            vv.add(new Integer(수학[i]));
	        }
	        
	        System.out.println("--------------학생 성적 조회 프로그램 ---------------");
	        System.out.println("\n이름\t국어\t영어\t수학\t총점\t평균 ");
	        
	        
	        Iterator itt = vv.iterator();
	        
	        while(itt.hasNext()) {
	        	
	        	System.out.println("\n" + itt.next());
	        	kor = ((Integer)itt.next()).intValue();
	        	eng = ((Integer)itt.next()).intValue();
	        	math = ((Integer)itt.next()).intValue();
	       
//	        Enumeration enu = vv.elements();
//	        
//	        while(enu.hasMoreElements()){
//	 
//	            System.out.print("\n" + enu.nextElement());
//	            
//	            kor = ((Integer) enu.nextElement()).intValue();
//	            eng = ((Integer) enu.nextElement()).intValue();
//	            math= ((Integer) enu.nextElement()).intValue();
	            
	            total = kor + eng + math;
	            
	            avg = total / 3.0;
	            
	            System.out.print("\t" + kor + "\t" + eng + " \t" + math );
	            System.out.print("\t" + total );
	            System.out.printf("\t%5.2f" ,avg);
	        }
	    } 


	}

