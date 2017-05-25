package win.likie.test;

/**
 * Created by Wuhuahui on 2016/12/27.
 */
public class Student extends Person{

	static  {
		System.out.println("static_student");
	}
	{
		System.out.println("public_student");
	}

	public void test() {
		System.out.println(super.name);
	}

	public Student() {
		this.name = "Student";
		this.age = 10;
		System.out.println(name);
	}

	public static void main(String[] args) {
		Person student = new Student();
		System.out.println("name:" + student.name);
		student.say();
		Student student1 = new Student();
		student1.say();
		student1.test();
	}
}
