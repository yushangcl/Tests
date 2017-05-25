package win.likie.test;

abstract class BirdTest {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int fly();
}

/**
 * 匿名内部类
 */
public class Outer2 {

	public void test(Bird bird){
		System.out.println(bird.getName() + "能够飞 " + bird.fly() + "米");
	}

	public static void main(String[] args) {
		Outer2 test = new Outer2();
		test.test(new Bird() {

			public int fly() {
				return 10000;
			}

			public String getName() {
				return "大雁";
			}
		});

		BirdTest birdTest = new BirdTest() {
			@Override
			public int fly() {
				return 0;
			}
		};

		Runnable thread = new Runnable(){

			@Override
			public void run() {

			}
		};
	}
}