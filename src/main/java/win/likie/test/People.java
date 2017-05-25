package win.likie.test;

/**
 * Created by huahui.wu on 2017/3/30.
 */
public class People {
	private String name;
	private int age;

	public People() {

	}

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println(getName() + " " + getAge());
	}
}