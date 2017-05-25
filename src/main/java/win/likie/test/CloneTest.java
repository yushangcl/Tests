package win.likie.test;

/**
 * Created by huahui.wu on 2017/4/6.
 */
class CloneTest {

	public static void main(String[] args) {
		try {
			Person1 p1 = new Person1("Hao LUO", 33, new Car1("Benz", 300));
			Person1 p2 = Clone.clone(p1);   // 深度克隆
			p2.getCar().setBrand("BYD");
			// 修改克隆的Person对象p2关联的汽车对象的品牌属性
			// 原来的Person对象p1关联的汽车不会受到任何影响
			// 因为在克隆Person对象时其关联的汽车对象也被克隆了
			System.out.println(p1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}