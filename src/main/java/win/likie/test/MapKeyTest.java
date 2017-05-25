package win.likie.test;

import java.util.*;

/**
 * HashMap按值排序
 * Created by huahui.wu on 2017/3/28.
 */
public class MapKeyTest {

	public static void main(String[] args) {

		int data[] = { 2, 5, 2, 3, 5, 2, 3, 5, 2, 3, 5, 2, 3, 5, 2,
				7, 8, 8, 7, 8, 7, 9, 0, 1 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : data) {
			if (map.containsKey(i)) {//判断HashMap里是否存在
				map.put(i, map.get(i) + 1);//已存在，值+1
			} else {
				map.put(i, 1);//不存在，新增
			}
		}
		//map按值排序
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(
				map.entrySet());
		//使用 Collections 工具类 对map按值排序
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1,
							   Map.Entry<Integer, Integer> o2) {
				return (o2.getValue() - o1.getValue());
			}
		});

		for (Map.Entry<Integer, Integer> m : list) {
			System.out.println(m.getKey() + "-" + m.getValue());
		}

	}

}