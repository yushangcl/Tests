package win.likie.test;

/**
 * Created by huahui.wu on 2017/3/29.
 */
public class ThreadTest{
	public static void main(String[] args) {
		System.out.println("Thread Test ben!");
		Thread thread = new Thread();
		thread.start();
		System.out.println("Thread Test end!");
	}
}

//class Thread extends java.lang.Thread {
//	public Thread(Son son) {
//
//	}

//	@Override
//	public void run() {
//		System.out.println("Thread Test start!");
//	}
//}
