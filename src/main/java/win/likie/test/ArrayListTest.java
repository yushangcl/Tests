package win.likie.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by huahui.wu on 2017/4/17.
 */
public class ArrayListTest {
	public void test() {
		String[] str = new String[10];
		str[0] = "10";

		List<String> list = Arrays.asList(str);

		// Exception in thread "main" java.lang.UnsupportedOperationException
		// Arrays.asList()会返回一个ArrayList对象，ArrayList类是Arrays的一个私有静态类，
		// 而不是java.util.ArrayList类，java.util.Arrays.ArrayList类有set()、get()、contains()方法，
		// 但是没有增加元素的方法，所以它的大小是固定的
		list.add("45");

		// ArrayList的构造方法可以接受一个集合类型，刚好它也是java.util.Arrays.ArrayList的超类。
		ArrayList<String> arrayList = (ArrayList<String>) Arrays.asList(str);


		System.out.println(list.toString());

	}

	public void test1() {
		String[] str = new String[10];
		str[0] = "10";
		String targetValue = "10";

		// 判断是否包含此值
		boolean isHas = Arrays.asList(str).contains(targetValue);
		System.out.println(isHas);

		// 可以用循环来判断
		for (String s : str) {
			if (s.equals(targetValue)) {
//				return true;
			}
		}
//		return false;

	}

	public void test2() {
		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");

		//在一个循环中删除一个列表中的元素
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			if (str.equals("a")) {
				iterator.remove();
			}
		}

		for (String str : arrayList) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		ArrayListTest arrayListTest = new ArrayListTest();
		arrayListTest.test2();
	}
}
