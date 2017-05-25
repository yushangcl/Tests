package win.likie.test;

import java.util.Calendar;

/**
 * Created by huahui.wu on 2017/4/6.
 */
public class TimeTest {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		int a = -1;
		assert(a > 0); // throws an AssertionError if a <= 0
		Long time = Calendar.getInstance().getTimeInMillis();
		System.out.println(time);
	}
}
