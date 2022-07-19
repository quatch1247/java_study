package ja_0719;

interface Car{
	void run();
}

interface Ship{
	void navigate();
}

interface Mole{
	void dig();
}

interface Wigs extends Car, Ship, Mole
{
	void floating();
}


class EagelFive implements Wigs
{

	@Override
	public void run() {
		System.out.println("황야를 달린다");
		
	}

	@Override
	public void navigate() {
		System.out.println("바다를 질주한다");
		
	}

	@Override
	public void floating() {
		System.out.println("습지를 날라다닌다");
		
	}

	@Override
	public void dig() {
		System.out.println("땅굴을 판다");
	}
}
public class WigsTest {
	public static void main(String[] args) {
		
		EagelFive obj = new EagelFive();
		
		obj.floating();
		obj.run();
		obj.navigate();
		obj.dig();
		
		

	}

}
