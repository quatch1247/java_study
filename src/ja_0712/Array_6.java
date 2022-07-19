package ja_0712;

public class Array_6 {

	public static void main(String[] args) {


	
		   int[][] score = new int[][] {
               {100,100,100,100},
               {20,20,20,20},
               {30,30,30,30},
               {40,40,40,40},
               {50,50,50,50}
           };

           
//과목별 총점
           int korTotal = 0;
           int engTotal = 0;
           int mathTotal = 0;
           int scienceTotal = 0;
           int totalSum = 0;
           double avg = 0.0;

System.out.println("번호\t국어\t영어\t수학\t과학\t총점\t평균");
System.out.println("--------------------------------------------");

for (int i = 0; i < score.length; i++) {
	
int sum = 0;//개인별 총점
double average = 0.0; //개인별 평균

korTotal += score[i][0]; //국어 점수 누적
engTotal += score[i][1];//영어 점수 누적
mathTotal += score[i][2];//수학 점수 누적
scienceTotal += score[i][3];//수학 점수 누적


//번호를 3개 자리를 차지하며 출력시키는 부분
System.out.printf("%3d", (i+1)); //번호 출력

for (int j = 0; j < score[i].length; j++) {
sum += score[i][j];
System.out.printf("\t%d", score[i][j]);//tap만큼 띄우기

}

totalSum += sum;//총합
average = (double)sum/score[i].length;//개인별 평균
avg += average;//전체 평균
System.out.printf("\t%d \t%.2f\n", sum, average);


}

	avg /= (double)score.length;
	System.out.println("------------------------------------------------");
	System.out.printf("총점\t%d\t%d\t%d\t%d\t%d\t%.2f", korTotal, engTotal, mathTotal, scienceTotal, totalSum, avg);

}
		        
		        
		    
}


