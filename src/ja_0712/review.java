package ja_0712;

public class review {

	public static void main(String[] args) {
		int[][]score = new int [][] {
		{10,20,30,40},
		{50,60,70,80},
		{90,11,22,33},
		{66,44,33,77},
		};
		
		
		//과목별 총점
		
		int kor = 0;
		int eng = 0;
		int chi = 0;
		int fre = 0;
		int sum =0;
		double avg = 0;
		
		System.out.println("번호\t국어\t영어\t중국어\t프랑스어\t합계\t평균\t");
		System.out.println("--------------------------------------------------------");
		
		for (int i = 0; i < score.length; i++) {
			int per_sum = 0; //개인 총점
			double per_avg = 0.0; // 개인 평균


		kor += score[i][0];
		eng += score[i][1];
		chi += score[i][2];
		fre += score[i][3];
		
		
			
		}

	}

}
