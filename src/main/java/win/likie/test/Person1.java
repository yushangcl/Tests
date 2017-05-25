package win.likie.test;

import java.io.Serializable;

/**
 * Created by huahui.wu on 2017/4/6.
 */
class Person1 implements Serializable {
	private static final long serialVersionUID = -9102017020286042305L;

	private String name;    // 姓名
	private int age;        // 年龄
	private Car1 car;        // 座驾

	public Person1(String name, int age, Car1 car) {
		this.name = name;
		this.age = age;
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car1 getCar() {
		return car;
	}

	public void setCar(Car1 car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}

}