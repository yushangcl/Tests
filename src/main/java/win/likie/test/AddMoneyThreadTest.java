package win.likie.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by huahui.wu on 2017/4/7.
 */
public class AddMoneyThreadTest {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++){
			AddMoneyThreadTest.test();
		}
	}

	public static void test() {
		Account account = new Account();
		ExecutorService service = Executors.newFixedThreadPool(100);

		for(int i = 1; i <= 100; i++) {
			service.execute(new AddMoneyThread(account, 1));
		}

		service.shutdown();

		while(!service.isTerminated()) {}

		System.out.println("账户余额: " + account.getBalance());
	}
}