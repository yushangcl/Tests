package win.likie.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by huahui.wu on 2017/3/30.
 */
public class ReflectTest {
	public static void main(String[] args) throws Exception {

		Class<People> peopleClass = People.class; //根据类名获取Class对象

		try {
			Class<?> peopleClass1 = Class.forName("top.annwz.test.People"); //根据类的完整路径名获取Class对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		People people = new People("name", 1);
		Class<? extends People> peopleClass2 = people.getClass();// 通过对象本身获取其Class对象：

		//根据获取到的Class 创建新的People对象
		Constructor<People> constructor = peopleClass.getConstructor(String.class, int.class);
		//设置 constructor 的 Accessible属性为ture以取消Java的访问检查
		constructor.setAccessible(true);
		People people1 = constructor.newInstance("name1", 12);
		//
		people1.speak();

		//获取所有的方法包括 private
		Method[] methods = peopleClass2.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		//获取public方法
		Method[] methods1 = peopleClass2.getMethods();
		for (Method method : methods1) {
			System.out.println(method.getName());
		}

		//获取所有的属性
		Field[] fields = peopleClass2.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}

		Field[] fields1 = peopleClass2.getFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}

		Field field2 = peopleClass2.getField("name");
		System.out.println(field2);

		//获取父类
		Class<?> superClass = peopleClass2.getSuperclass();

		//获取所有接口
		StudentNew student = new StudentNew("", 12);
		Class<?>[] interfaces = student.getClass().getInterfaces();



	}

}
