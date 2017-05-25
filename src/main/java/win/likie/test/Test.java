package win.likie.test;

import java.util.*;

/**
 * Created by Wuhuahui on 2016/12/26.
 */
public class Test {

	private final static Double  PI = 3.14;
	public static void main(String[] args) {
//		equivalence();
//		StaticTest s1 = new StaticTest();
//		System.out.println(s1.i);
//		StaticTest s2 = new StaticTest();
//		System.out.println(s2.i);
//		Math.abs(12.01);
//
//		System.out.print("fafa");
//
//		Test.autoAdd();
//		autoAdd();
//
//		Collection collection = new HashSet();
//		System.out.printf("跑了 %d 步\n", 25);
//		String[] arr = {"12"};
//		int i = Integer.parseInt(arr[0]);
//		System.out.println(i);


//		List<String> a = new ArrayList<String>();
//		a.add("1");
//		a.add("2");
//		for (String temp : a) {
//			if("2".equals(temp)){
//				a.remove(temp);
//			}
//		}
//		System.out.println(a.toString());

//		for (int i = 0 ; i < forever ; i++, i--); print("I love you");
//		Test.mapTest();


//		System.out.println(System.getProperty("os.name"));
//		System.out.println(System.getProperty("os.name"));
//		System.out.println(System.getProperty("os.name"));
//		System.out.println(System.getProperty("os.name"));
		test3();

	}


	public static void autoAdd() {
		int i = 1;
		int j = 1;
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++j);
	}

	public static  void equivalence(){
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println(i1 == i2);
		System.out.println(i1 != i2);
		System.out.println(i1.equals(i2));


	}

	public static  void booleanTest() {
		Boolean x = true;
		Boolean y = true;
		while (x = y) {
			System.out.println("true");
		}
		Map map = new HashMap();
		map.get("");
		StringBuffer buffer = new StringBuffer(); //线程安全的
		StringBuilder builder = new StringBuilder(); //线程不安全的
		Vector<String> vector = new Vector<>();

	}

	public static  void mapTest() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "value1");
		map.put("2", "value2");
		map.put("3", "value3");

		System.out.println("通过Map.keySet遍历key和value：");
		for (String key : map.keySet()) {
			System.out.println("key:" + key + " value:" + map.get(key));
		}

		System.out.println("通过Map.entrySet使用iterator遍历key和value：");
		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			String value = entry.getValue();
			String key = entry.getKey();
			System.out.println("key:" + key + " value:" + value);
		}
		HashSet<String> set = new HashSet<>();

	}

	public static void test() {
		int i= 1, j= 0;
		switch (i) {
			case 2:
				j+=6;
			case 4:
				j+=1;
			default:
				j+=2;
			case 0:
				j+=4;

		}
		System.out.println(j);
	}

	public static void test2() {
		List testList = new ArrayList<>();
		testList.add("1");
		testList.add("1");
		testList.add("1");
		testList.add("1");

		testList.subList(1, 3).clear();
		System.out.println(testList);

	}

	public static void test3() {
		String str0 = null;
		String str1 = "Tomcat";
		String str2 = "Tom" + "cat";
		String str3 = new String("Tomcat");

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str3.intern());
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str0);
		System.out.println(str0.equals(str1));

	}

}

//class StaticTest {
//	static int i = 47;
//}
