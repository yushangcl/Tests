package win.likie.test;

import java.util.regex.Pattern;

/**
 * Created by Wuhuahui on 2017/1/4.
 */
public class RegularTest {

	public static void main(String[] args) {
		String reg = "/(\\w)*(\\w)\\2{2}(\\w)*/g";
		System.out.println(Pattern.matches(reg, "1"));
	}
}
