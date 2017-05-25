package win.likie.test;

/**
 * Created by Wuhuahui on 2016/12/28.
 */
abstract class Bird {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int fly();
}