package win.likie.test;

/**
 * 匿名内部类测试
 * 二、注意事项
 * 1、使用匿名内部类时，我们必须是继承一个类或者实现一个接口，但是两者不可兼得，同时也只能继承一个类或者实现一个接口。
 * 2、匿名内部类中是不能定义构造函数的。
 * 3、匿名内部类中不能存在任何的静态成员变量和静态方法。
 * 4、匿名内部类为局部内部类，所以局部内部类的所有限制同样对匿名内部类生效。
 * 5、匿名内部类不能是抽象的，它必须要实现继承的类或者实现的接口的所有抽象方法。
 * Created by Wuhuahui on 2016/12/28.
 */
public class AnonymousTest {
	static int i = 0;
	public void test(Bird bird){
		System.out.println(bird.getName() + "能够飞 " + bird.fly() + "米");
	}

	public static void main(String[] args) {
		 final int y = 10; //必须是  final才能被匿名内部类使用
		AnonymousTest anonymousTest = new AnonymousTest();
		//匿名内部类
		anonymousTest.test(new Bird(){//Bird 父类
			public int fly() {
				return y;
			}
		});
	}

	public void display(final String name, final String age){//匿名内部类 形参 必须是final修饰的
		class InnerClass{
			void display(){
				System.out.println(name + age);
			}
		}
	}
}
