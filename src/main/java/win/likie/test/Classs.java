package win.likie.test;

/** 反射
 * Created by Wuhuahui on 2017/1/3.
 */
class Candy {
	static {
		System.out.println("Loading Candy");
	}
}
class Gum {
	static {
		System.out.println("Loading Gum");
	}
}
class Cookie {
	static {
		System.out.println("Loading Cookie");
	}
}
public class Classs {
	public static void test1() {
		System.out.println("inside main");
		Candy candy = new Candy();
		Candy candy1 = new Candy();
		System.out.println("After creating Candy");
		try {
			Class.forName("top.annwz.test.Gum");//需要全路径
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(
				"After Class.forName(\"Gum\")");
		Cookie cookie = new Cookie();
		System.out.println("After creating Cookie");
		Class[] classes = Classs.class.getInterfaces();

	}

	public static void test2() {
		Class<?> people = People.class;

	}

	public static void main(String[] args) {
		Classs.test2();
	}
}