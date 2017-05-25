package win.likie.test;

/**
 * 继承
 * Created by huahui.wu on 2017/4/13.
 */
class ExtendsTest2 {

	protected int method1(int a, int b) {
		System.out.println("ExtendTest2:");
		return 0;
	}
}

/**
 * 子类继承父类，重写父类方法
 * 1、方法名相同
 * 2、参数相同
 * 3、修饰符要作用范围要大于等于父类方法
 */
class B3 extends ExtendsTest2 {
	public int method1(int a, int b) {
		System.out.println("B3");
		return 1;
	}
}

public class ExtendsTest1 {
	public static void main(String[] args) {
		ExtendsTest2 b3 = new B3();
		b3.method1(1, 2);
	}
}


