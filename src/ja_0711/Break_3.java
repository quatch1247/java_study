package ja_0711;

public class Break_3 {

	public static void main(String[] args) {


		next : {
			for(int i =1; i<10; i++)
			{
				for(int j =1; j<10; j++)
				{
					for(int k =1; k<10; k++)
					{
						System.out.println(i+"*"+j+"*"+k+"="+(i*j*k));
					}
					break next;
				}
				
			}
		}
	}

}
