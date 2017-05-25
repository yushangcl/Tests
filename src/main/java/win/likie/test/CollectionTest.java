package win.likie.test;

import java.util.*;

/**
 * Created by Wuhuahui on 2016/12/29.
 */
public class CollectionTest {

	public static void main(String[] args) {
		collectionsTest(listTest());
	}

	public static List listTest() {
		List arrayList = new ArrayList();
		arrayList.add(11);
		arrayList.add(2);
		arrayList.add(31);

		List linkedList = new LinkedList();

		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);

		arrayList.addAll(linkedList);

		boolean b = arrayList.containsAll(linkedList);//判断  一个集合是否包含于另一个集合

		int i = arrayList.indexOf("4");//返回 第一次出现字符串的位置
		System.out.println(b+" "+i);

		return arrayList;

	}

	public static void collectionsTest(List list) {
		Collections.sort(list); //排序
		System.out.println(list);

		Collections.reverse(list); // 反转
		System.out.println(list);

		Collections.shuffle(list);  //随机排序
		System.out.println(list);


	}
}
