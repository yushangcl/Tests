package win.likie.test;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Wuhuahui on 2016/12/28.
 */
public class InnerMethod {
	public static String str1 = "a";

	public String str2 = "b";

	//静态内部类
	public static class Inner {
		public static String str3 = "c";

		public void test1() {
			System.out.println(str1);
		}
	}

	//普通内部类
	public class Inner2 {
		public void test3() {
			Inner2 in = new Inner2();//内部类实例化内部类
			System.out.println(str2);
		}
	}

	public void test2() {
		System.out.println();
		Inner2 inner2 = new Inner2(); //在外部类方法中创建内部类实例
		inner2.test3();
	}

	//方法
	public Object test3() {
		final int i = 0;
		//局部内部类
		class Inner3 {
			String y = "10";
			public String toString() {
				return (i + y);// 可以访问 final修饰的变量
			}
		}
		return  new Inner3();
	}

	//匿名你内部类
	Object obj = new Inner() {
		//类体
	};



	public static void main(String[] args) {
		InnerMethod innerMethod = new InnerMethod();
		InnerMethod.Inner2 inner2 = innerMethod.new Inner2();//通过外部类实例化 普通内部类
		inner2.test3();

		InnerMethod.Inner inner = new InnerMethod.Inner();  //不需要通过外部类实例化  静态内部类

		Object object = new InnerMethod().test3();// 创建一个InnerMethod对象object，并调用它的 test3() 方法返回一个Inner3对象 ，并调用他的toString
		System.out.println(object.toString());



	}




}
