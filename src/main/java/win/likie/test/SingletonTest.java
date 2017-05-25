package win.likie.test;

/**
 * 单例模式
 *
 * Created by huahui.wu on 2017/4/10.
 */
public class SingletonTest {
}

/**
 * 懒汉模式
 */
class Singleton1{
	// 定义私有构造方法（防止通过 new SingletonTest()去实例化）
	private Singleton1() {}

	private static Singleton1 singleton1 = null;

	public static Singleton1 getInstance() {
		if (singleton1 == null ) {
			singleton1 = new Singleton1();

		}
		return singleton1;

	}
}


/**
 * 线程安全 但是效率不高
 */
class Singleton1Thread{
	private Singleton1Thread(){}

	private static Singleton1Thread instance = null;

	// 定义一个静态的方法（调用时再初始化Singleton1Thread，使用synchronized 避免多线程访问时，可能造成重的复初始化问题）
	public synchronized static Singleton1Thread getInstance() {
		//
		if (instance == null) {
			instance = new Singleton1Thread();
		}
		return instance;
	}
}

/**
 * 线程安全
 */
class Singleton2Thread{
	private Singleton2Thread(){}

	private static Singleton2Thread instance = null;

	public static Singleton2Thread getInstance() {
		// 对象实例化时与否判断（不使用同步代码块，instance不等于null时，直接返回对象，提高运行效率）
		if (instance == null) {
			//同步代码块（对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建）
			synchronized (SingletonTest.class) {
				//未初始化，则初始instance变量
				if (instance == null) {
					instance = new Singleton2Thread();
				}
			}
		}
		return instance;
	}
}


/**
 * 饿汉模式
 */
class Singleton2{
	private Singleton2(){}

	private static Singleton2 instance = new Singleton2();

	public static Singleton2 getInstance() {
		return instance;
	}
}

/**
 * 用final 关键字修饰
 * 注解：定义一个私有的内部类，在第一次用这个嵌套类时，会创建一个实例。而类型为SingletonHolder的类，只有在Singleton.getInstance()中调用，由于私有的属性，他人无法使用SingleHolder，不调用Singleton.getInstance()就不会创建实例。
 * 优点：达到了lazy loading的效果，即按需创建实例。
 */
class Singleton3{
	private Singleton3(){}

	private static final Singleton3 instance = new Singleton3();

	public static Singleton3 getInstance() {
		return instance;
	}
}






