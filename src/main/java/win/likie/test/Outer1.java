package win.likie.test;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by huahui.wu on 2017/3/29.
 */
public class Outer1 {
	private  int own = 1;
	public void outerMethod() {
		System.out.println("In Outer class");
		final int i = 0; //必须使用final修饰
		//局部内部类
		class Inner {
			public void innerMethod() {
				System.out.println("The var own in Outer is " + own + i);
			}
		}
		Inner inner = new Inner();
		inner.innerMethod();
	}
	public static void main(String[] args) {
		Outer1 outer1 = new Outer1();
		outer1.outerMethod();
	}
}
