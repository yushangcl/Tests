package win.likie.test;

import com.sun.prism.shader.Solid_TextureYV12_Loader;

/**
 * Created by Wuhuahui on 2017/1/16.
 */
public class StaticTest {

	static {
		System.out.println("static block");
	}

	{
		System.out.println("no static block");
	}

	public StaticTest() {
		Persion2 p = new Persion2();
		System.out.println("static build's block");
	}


	public static void main(String[] args) {
		StaticTest staticTest = new StaticTest();
	}


}
class Persion2 {
	public Persion2() {
		System.out.println("build's block");
	}

}
