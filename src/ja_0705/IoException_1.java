package ja_0705;

class  IOException_1
{
	public static void main(String[] args) throws Exception
	{
		int data =0;

		System.out.println("글자를 입력 하세요...");
		data = System.in.read();

		System.out.println(data);
		System.out.println((char)data);
		System.out.println((char)97);

		/*
		자바의 기본 입력

		: 자바에서는 표준 입력 장치인 키보드에 대하여 
			System 클래스에 in 이라는 객체를 마련해 두었다.
			System.in 객체로 read()메소드를 호출하여 키보드에서 
			데이터를 입력 받을 수 있다


			public abstract int read() throws IOException

			read()메소드는 키보드에서 한 바이트를 읽는다. 더 이상 읽을 값이 없을 경우
			-1을 리턴한다.

			입출력과 관련된 모든 클래스의 메소드는 입출력을 수행하는 동안 
			장치 이상 등으로 인한 여러가지 예외를 발생시킨다.
			그렇기 때문에 입출력과 관련된 메소드를 사용할 때에는 반드시 예외처리를 해야한다.
			
			*/

		System.out.println("Hello World!");
	}
}
