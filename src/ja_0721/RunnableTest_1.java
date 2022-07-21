package ja_0721;

class Runnable_1 implements Runnable
{

	@Override
	public void run() {
			
		for (int i = 0; i < 5; i++) {
				
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				System.out.println(" " + i + "번"+ i + "*"+ i + "="+ (i * i));
			}
		}
}

public class RunnableTest_1 {

	public static void main(String[] args) {
		
		Runnable_1 obj = new Runnable_1();
		Thread thread = new Thread(obj);
		
		thread.start();

	}

}
