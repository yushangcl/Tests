package win.likie.test;

/**
 * Created by Wuhuahui on 2017/1/4.
 */
public class StringTest {
	public static void main(String[] args) {
//		String str1 = "123";
//		System.out.println(System.identityHashCode(str1));
//		str1 = "456";
//		System.out.println(System.identityHashCode(str1));
		replaceTest();
	}

	public static void replaceTest() {

			String s = "hello world";
			String s1 = s.replace("l", "d");
			System.out.println(s1);

			String s2 = "a78e5opx587";
			String s3 = s2.replaceAll("[0-9]", "");//用空串替换原串里所有的0-9的数字
			System.out.println(s3);
	}
}
