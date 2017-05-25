package win.likie.test;

import java.util.ArrayList;

/**
 * Created by Wuhuahui on 2016/12/28.
 */
public class IntAndIntegerTest {
	public static void main(String[] args) {
		IntAndIntegerTest intAndIntegerTest = new IntAndIntegerTest();
		intAndIntegerTest.test2();
	}

	public void test() {
		int i = 0;
		int j = 1;

		Integer integer = new Integer(10);
		Integer integer1 = new Integer(i);

		i = integer;
		integer = j;

		ArrayList arr = new ArrayList();

		arr.add(i);
		arr.add(integer1);
		System.out.println(arr.toString());
	}

	public void test2() {
		int i = 128;
		Integer i2 = 128;
		Integer i3 = new Integer(128);
		//Integer会自动拆箱为int，所以为true
		System.out.println(i == i2);
		System.out.println(i == i3);
		System.out.println("**************");
		Integer i5 = 127;//java在编译的时候,被翻译成-> Integer i5 = Integer.valueOf(127);
		Integer i6 = 127;
		System.out.println(i5 == i6);//true
        Integer i51 = 128;
        Integer i61 = 128;
        System.out.println(i51 == i61);//false

        Integer ii5 = new Integer(127);
		System.out.println(i5 == ii5); //false
		Integer i7 = new Integer(128);
		Integer i8 = new Integer(123);
		System.out.println(i7 == i8);  //false
	}

	public void test3() {
		ArrayList al = new ArrayList();

		int n = 40;

		Integer nI = new Integer(n);

		al.add(n);//不可以

		al.add(nI);//可以
	}
}
