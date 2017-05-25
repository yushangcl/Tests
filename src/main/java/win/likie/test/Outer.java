package top.annwz.test;

/**
 * Created by huahui.wu on 2017/3/29.
 */
public class Outer {

	private int own = 1;
	public void outerMethod() {
		System.out.println("In Outer class");
		Inner inner = new Inner();
		inner.innerMethod();
	}
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outerMethod();
	}

	//普通内部类
	private class Inner {
		public void innerMethod() {
			System.out.println("The var own in Outer is " + Outer.this.own);
		}
	}
}