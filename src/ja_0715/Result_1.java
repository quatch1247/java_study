package ja_0715;

class Grade
{
	int kor = 60; //객체 속성 변수 = 멤버 변수 = 필드
	int eng = 65; //객체 속성 변수 = 멤버 변수 = 필드
	int math = 77; //객체 속성 변수 = 멤버 변수 = 필드
	
}

public class Result_1 {

	public static void main(String[] args) {

		int total, a, b, c, d; // 지역변수는 초기화가 안되기 때문에 시켜줘야함
		double avg;
		
		Grade grade1 = new Grade();
		Grade grade2 = new Grade();


		a=grade1.kor + grade1.eng + grade1.math;
		b=grade2.kor + grade2.eng + grade2.math;
		
		System.out.println("과목 총점 : a : " + a);
		System.out.println("과목 총점 : b : " + b);
		System.out.println();
		
		grade1.kor = 900;
		grade2.eng = 300;
		
		a=grade1.kor + grade1.eng + grade1.math;
		b=grade2.kor + grade2.eng + grade2.math;
		
		System.out.println("과목 총점 : aa : " + a);
		System.out.println("과목 총점 : bb : " + b);
		System.out.println();
		
		total = grade1.kor + grade2.eng + grade2.math;
		avg = total / 3.0;
		
		System.out.println("과목 총점 : total : " + total);
		System.out.println("과목 총점 : avg : " + avg);
		
		
		
		
		
	}

}
