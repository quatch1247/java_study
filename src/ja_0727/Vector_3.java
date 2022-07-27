package ja_0727;


	import java.util.Enumeration;
	import java.util.Vector;
	 
	public class Vector_3 {
	    public static void main(String[] args) {
	        
	        int kor, eng, math, total;
	        double avg;
	        
	        String[] 이름 = {"송민우", "채희준", "김선주", "김영재", "이은지", "이진호",
	                         "박주혁", "권재욱", "김종렬", "김원득"};
	        
	        int[] 국어 = {77, 45, 67, 89, 33, 90, 54, 69, 78, 99};
	        int[] 영어 = {37, 45, 67, 89, 93, 90, 54, 69, 30, 99};
	        int[] 수학 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	        
	        Vector vv = new Vector();
	        
	        for(int i = 0; i<10; i++){
	            
	            vv.addElement(이름[i]);
	            vv.add(국어[i]);
	            vv.add(영어[i]);
	            vv.addElement(수학[i]);
	        }
	        
	        System.out.println("--------------학생 성적 조회 프로그램 ---------------");
	        System.out.println("\n이름\t 국어\t 영어\t 수학\t 총점\t 평균 ");
	        
	        Enumeration enu = vv.elements();
	        
	        while(enu.hasMoreElements()){
	 
	            System.out.print("\n" + enu.nextElement());
	            
	            kor = ((Integer) enu.nextElement()).intValue();
	            eng = ((Integer) enu.nextElement()).intValue();
	            math= ((Integer) enu.nextElement()).intValue();
	            
	            total = kor + eng + math;
	            
	            avg = total / 3.0;
	            
	            System.out.print("\t" + kor + "\t" + eng + " \t" + math );
	            System.out.print("\t" + total );
	            System.out.printf("\t%5.2f" ,avg);
	        }
	    } 
	}
	 
	 
	/*
	--------------학생 성적 조회 프로그램 ---------------
	이름     국어     영어     수학     총점     평균 
	송민우    77    37     0    114    38.00
	채희준    45    45     0    90    30.00
	김선주    67    67     0    134    44.67
	김영재    89    89     0    178    59.33
	이은지    33    93     0    126    42.00
	이진호    90    90     0    180    60.00
	박주혁    54    54     0    108    36.00
	권재욱    69    69     0    138    46.00
	김종렬    78    30     0    108    36.00
	김원득    99    99     0    198    66.00
	*/


