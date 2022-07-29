package ja_0728;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendar_1 {

	public static void main(String[] args) {
	
		String[] dayOfWeek = {"","일","월","화","수","목","금","토"};  // 요일은 1(일요일)부터 시작

		String[] ampm = {"오전", "오후"};

		// Calendar는 추상 클래스라서 new를 사용할 수 없으므로 getInstance() 메소드 이용

		//
		Calendar cal = Calendar.getInstance();  

             // GregorianCalenda는 Calendar를 상속 구현한 그레고리력 클래스

		Calendar gcal = new GregorianCalendar();



		System.out.print(cal.get(Calendar.YEAR)+"년 ");

		System.out.print(cal.get(Calendar.MONTH)+1+"월 ");   // 월은 0부터 시작하고 0은 1월 의미

		System.out.print(cal.get(Calendar.DATE)+"일 ");		

		System.out.println(dayOfWeek[cal.get(Calendar.DAY_OF_WEEK)]+"요일 ");

		

		System.out.print(gcal.get(Calendar.YEAR)+"년 ");

		System.out.print(gcal.get(Calendar.MONTH)+1+"월 ");

		System.out.print(gcal.get(Calendar.DATE)+"일 ");

		System.out.println(dayOfWeek[gcal.get(Calendar.DAY_OF_WEEK)]+"요일 ");



		System.out.print(ampm[cal.get(Calendar.AM_PM)]+" ");	  // 0:오전, 1:오후	

		System.out.print(cal.get(Calendar.HOUR)+":");

		System.out.print(cal.get(Calendar.MINUTE)+":");

		System.out.println(cal.get(Calendar.SECOND));



		System.out.println("타임존: "+cal.get(Calendar.ZONE_OFFSET)/3600000);  // 9	
         // 우리나라 표준시는 UTC + 9	
		
		System.out.println();
		
		int y = 2000;


	    if (((GregorianCalendar) gcal).isLeapYear(y))
	      System.out.println("윤년입니다.");
	    else
	      System.out.println("평년입니다.");


	  }

	}
	

