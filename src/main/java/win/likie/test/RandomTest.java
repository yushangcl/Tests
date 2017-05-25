package win.likie.test;

import java.util.Random;

/**
 * Created by Wuhuahui on 2016/12/26.
 */
public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random();
		int r = random.nextInt(10);
		System.out.println(r);
	}
}
