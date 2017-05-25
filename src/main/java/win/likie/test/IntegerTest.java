package win.likie.test;


/**
 * Created by huahui.wu on 2017/3/31.
 */
public class IntegerTest {

	public static void main(String[] args) {
//		IntegerTest.test();
//		IntegerTest.test2();
//		IntegerTest.test3();
//		IntegerTest.test5();
		IntegerTest.test6();
	}


	public static void test() {
		Integer a = new Integer(3);
		Integer b = 3;                  // 将3自动装箱成Integer类型
		int c = 3;
		System.out.println("a == b:" + (a == b));     // false 两个引用没有引用同一对象
		System.out.println("a.equals(b):" + a.equals(b));     // true 比较的是值
		System.out.println("a == c:" +(a == c));     // true a自动拆箱成int类型 再和c比较
	}

	public static void  test2() {
		//IntegerCache 整型字面量的值在-128到127之间，那么不会new新的Integer对象，而是直接引用常量池中的Integer对象
		Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;

		System.out.println(f1 == f2); // true
		System.out.println(f3 == f4); // false
	}

	public static void  test3() {
		String str1 = new String("123");
		String str2 = "123";
		String str3 = "123";

		System.out.println(str1 == str2); //false
		System.out.println(str2 == str3); //true  常量池
		System.out.println(str1.equals(str2)); //true

	}

	public static void test4() {
		final StringBuffer stringBuffer = new StringBuffer("123");
		final StringBuffer stringBuffer1 = new StringBuffer("123");
//		stringBuffer = stringBuffer1; //final只对引用的"值"(即内存地址)有效，它迫使引用只能指向初始指向的那个对象，改变它的指向会导致编译期错误。
		stringBuffer.append("456"); //至于它所指向的对象 的变化，final是不负责的。
	}

	public static void test5() {
		String a =  "b" ;
		String b =  "b" ;

		System.out.println( a == b);

		String c = "d" ;
		String d = new String( "d" ).intern() ;
		System.out.println( c == d);

	}

	public static void test6() {
		//-----------------------------------------
		String s1 = new StringBuilder("ja")
				.append("va").toString();
		System.out.println(s1.intern() == s1);

		String s2 = new StringBuilder("go")
				.append("od").toString();
		System.out.println(s2.intern() == s2);

		String s3 = new StringBuilder("go")
				.append("od").toString();
		System.out.println(s3.intern() == s3);
		//----------------------------------------

	}

	public static void test7() {
		StringBuffer stringBuffer = new StringBuffer(""); //线程安全的
		StringBuilder stringBuilder = new StringBuilder(""); //
	}
}