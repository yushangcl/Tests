package win.likie.test;

/**
 * Created by Wuhuahui on 2016/12/27.
 */
public class Person {
	String name;
	Integer age;

	static  {
		System.out.println("static_person");
	}
	{
		System.out.println("public_student");
	}

	public Person(){
		this.name = "Person";
		this.age = 22;
		System.out.println(name);
	}

	public void say() {
		System.out.println(name + ": hello");
	}
}
