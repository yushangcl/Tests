package win.likie.test;

/**
 * 静态内部类
 * Created by huahui.wu on 2017/3/29.
 */
public class Outer3 {
	private int own = 1;
	public void outerMethod() { }
	public static void main(String[] args) { }

	private static class Inner {
		public void innerMethod() { }
	}
}