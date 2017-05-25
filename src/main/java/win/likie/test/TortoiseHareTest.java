package win.likie.test;


/**
 * Created by Wuhuahui on 2017/1/14.
 */
public class TortoiseHareTest implements Runnable{
	public static void main(String[] args) {
//		Tortoise tortoise = new Tortoise(10);
//		Hare hare = new Hare(10);
//		Thread tortoisethread  = new Thread(tortoise);
//		Thread harethread = new Thread(hare);
//		tortoisethread.start();
//		harethread.start();
		new Thread(new TortoiseHareTest()).start();
		System.out.println("main thread run");

	}

	@Override
	public void run() {

		System.out.println("sub thread run");
	}

	void test() {
		final Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("sub thread run");
			}
		});
		thread.start();
	}
}




