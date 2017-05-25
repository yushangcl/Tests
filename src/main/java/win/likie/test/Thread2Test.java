package win.likie.test;

import java.lang.*;
import java.lang.Thread;

/**
 * Created by huahui.wu on 2017/3/29.
 */
public class Thread2Test  {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0 ; i < 100; i ++) {
					System.out.println("new Runnable" + i);
				}
			}
		});
		thread.start();
		Runnable runnable = new RunnableTest();
		Thread thread1 = new Thread(runnable);
		thread1.start();
//		thread.wait();
	}
}
class RunnableTest implements Runnable{
	@Override
	public void run() {

		for (int i = 0 ; i < 100; i ++) {
			System.out.println("imp Runnable" + i);
		}
		
	}
}
