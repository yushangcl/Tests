package win.likie.test;

import java.util.*;

/**
 * Created by Wuhuahui on 2017/1/3.
 */
class person{
	int id;
	String name;

	public person(int id,String name){
		super();
		this.id=id;
		this.name=name;

	}

	public String toString(){
		return "id是："+this.id+" name是："+this.name;
	}

	/**
	 * 重写 hashCode
	 * @return
	 */
	public int hashCode(){
		return this.id;
	}

	/**
	 * 重写 equals
	 * @param object
	 * @return
	 */
	public boolean equals(Object object) {
		person p = (person) object;
		return this.id==p.id;
	}
}
public class CollectionDemo {

	public static void main(String[] args) {
		HashSet<person> hs = new HashSet<person>();
		hs.add(new person(123, "张三"));
		hs.add(new person(123, "张三"));
		hs.add(new person(456, "李四"));
		System.out.println("集合的元素" + hs);

		TreeSet treeSet = new TreeSet(); //以自然排序存储 ，不能重复
		treeSet.add("1");
		treeSet.add("3");
		treeSet.add("2");
		treeSet.add("c1");
//		treeSet.add(hs);
		treeSet.add("c2");
		treeSet.add("共");
		treeSet.add("a1");
		System.out.println("TreeSet: " + treeSet);

		/*
		迭代器
		 */
		Iterator<person> iterator = hs.iterator();
		while (iterator.hasNext()) {
			System.out.println("Iterator " + iterator.next());
		}

		for (person p : hs) {
			System.out.println("foreach: " + p);
		}

		HashMap<String, String> map = new HashMap<>();
		map.put("1", "张三");
		map.put("2", "李四");
		map.put("3", "王五");
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for (Map.Entry entry : entries) {
			System.out.println("Map.Entry: " + entry);
		}


	}

}