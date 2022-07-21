package ja_0721;

public class RunnableTest_4 implements Runnable {

	private int[] temp;
	
	public RunnableTest_4() {
		
		temp = new int[10];
		
		
		for (int i = 0; i < temp.length; i++) {
			//150 ~ 200사이의 난수 발생
			temp[i] = (int)(Math.random()*(200-150+1)+150);
		}
	}

	public static void main(String[] args) {
		
		RunnableTest_4 obj_1 = new RunnableTest_4();
		Thread thread_1 = new Thread(obj_1);
		Thread thread_2 = new Thread(new RunnableTest_4());
		
		thread_1.start();
		thread_2.start();
	}
	
	@Override
	public void run() {
		
		for(int start : temp)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("쓰레드 이름 : " + Thread.currentThread().getName());
			System.out.println("temp[] value : " + start);
		}
	}
}
