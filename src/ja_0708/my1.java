package ja_0708;

import java.util.Scanner;

public class my1 {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			int i, j;
			int num = scan.nextInt();

			for( i=1; i<=num; i++)
			{
				for( j=1; j<=i; j++)
				{
					System.out.print("*");
				}

				System.out.println();
			}
		}



}

