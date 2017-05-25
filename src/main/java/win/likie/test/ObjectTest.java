package win.likie.test;

/**
 * Created by Wuhuahui on 2016/12/26.
 */
public class ObjectTest {


	public static void main(String[] args) {
//		test5();
	}

	public void test1() {
		Number n1 = new Number();
		Number n2 = new Number();

		System.out.println("n1: " + n1.i +" n2: "+ n2.i);

		n1 = n2;
		System.out.println("n1: " + n1.i +" n2: "+ n2.i);

		n1.i=0;
		System.out.println("n1: " + n1.i +" n2: "+ n2.i);
	}

	public static void test2() {
		Number n1 = new Number();
		Number n2 = new Number();

		n1.i = 100;
		n2.i = 100;
		System.out.println(n1.equals(n2));
		System.out.println(n1 == n2);
	}

	public static void test3() {
		int x = 0;
		int y = 1;
		int z = 2;
		String str = "-1";
		System.out.println(x + y + z); //3
		System.out.println(str + x + y + z); //-1012
		System.out.println(x + y + z + str); //3-1
	}

	public static void test4() {
		boolean x = true;
		boolean y = false;
		while (x = y) {
		}
	}

	public static void test5() {
		for(int i = 0, j = 1; i < 10 && j != 11; i++, j++) {
			System.out.println("i:" + i + " j:" + j);
		}
	}

	public ObjectTest() {
	}

}

class Number {
	int i = 10;
}
