package win.likie.test;

import java.util.HashMap;

/**
 * Created by huahui.wu on 2017/3/28.
 */
public class TestLock {

	private HashMap map = new HashMap();

	public TestLock() {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 50000; i++) {
					map.put(new Integer(i), i);
				}
				System.out.println("t1 over");
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 50000; i++) {
					map.put(new Integer(i), i);
				}

				System.out.println("t2 over");
			}
		};

		t2.start();
		t1.start();


	}

	public static void main(String[] args) {
		new TestLock();
	}
}