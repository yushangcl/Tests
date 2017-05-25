package win.likie.test;

/**
 * Created by Wuhuahui on 2017/1/5.
 */
public class LongTest {
	public static void main(String[] args) {
		test1(); //Long 类型 比较 超出 -128 ~ 127
		test2(); //Long 类型 比较 在 -128 ~ 127 之间 相等 存在LongCache
	}

	public static void test1() {
		Long num1 = 128L;
		Long num2 = 128L;
		System.out.println(num1 == num2);
	}

	public static void test2() {
		Long num1 = 1L;
		Long num2 = 1L;
		System.out.println(num1 == num2);
	}
}
