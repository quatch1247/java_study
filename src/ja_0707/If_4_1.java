package ja_0707;

import java.util.Scanner;

public class If_4_1

{

	public static void main(String[] args) 

	{


		System.out.println("알파벳 하나 입력해봐");

		Scanner sc = new Scanner(System.in);

 

		String alphbet = sc.nextLine();

 

		if(alphbet.equals("A") || alphbet.equals("a"))

		{

			System.out.println("America");

			System.out.println("Australia");

		}

		else

		{

			System.out.println("다른거입력해봐");

		}

 

		

 

 

	}

}