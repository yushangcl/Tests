package win.likie.test;

/**
 * Created by huahui.wu on 2017/4/7.
 */
public class Account {
	private double balance;     // 账户余额

	/**
	 * 存款
	 * @param money 存入金额
	 */
	public void deposit(double money) {
		double newBalance = balance + money;
		try {
			Thread.sleep(10);   // 模拟此业务需要一段处理时间
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		balance = newBalance;
	}

	/**
	 * 获得账户余额
	 */
	public double getBalance() {
		return balance;
	}
}