package win.likie.test;

import java.util.*;

/**
 * Created by Wuhuahui on 2016/12/28.
 */
public class IteratorTest {
	/**
	 * (1) 使用方法iterator()要求容器返回一个Iterator。第一次调用Iterator的next()方法时，它返回序列的第一个元素。
	 *     注意：iterator()方法是java.lang.Iterable接口,被Collection继承。
	 * (2) 使用next()获得序列中的下一个元素。
	 * (3) 使用hasNext()检查序列中是否还有元素。
	 * (4) 使用remove()将迭代器新返回的元素删除。
	 *
	 */
	public static void iterator() {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("c");
		list.add("c++");
		list.add("php");
		list.add("python");

		Iterator iterator = list.iterator(); //迭代器 使用方法
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	public static void main(String[] args) {
		iterator();
	}
}
