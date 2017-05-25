package win.likie.test;

/**
 * Created by huahui.wu on 2017/3/30.
 */
public class StudentNew extends People {
	private int grade;

	public StudentNew() {

	}

	public StudentNew(String name, int age) {
		super(name, age);
	}

	public StudentNew(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	private void learn(String course) {
		System.out.println(super.getName() + " learn " + course);
	}
}