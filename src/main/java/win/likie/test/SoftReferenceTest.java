package win.likie.test;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * 引用
 * Created by huahui.wu on 2017/4/13.
 */
public class SoftReferenceTest {
	public static void main(String[] args) {

		//强引用
		String str = new String();

		//软引用
		String str1 = new String();

		SoftReference<String> softStr = new SoftReference<String>(str1); //将强引用转换成软引用

		if (softStr.get() != null) {
			str1 = softStr.get(); // 还没有被回收器回收，直接获取
		} else {
			str1 = new String(); // 由于内存吃紧，所以对软引用的对象回收了
			softStr = new SoftReference<String>(str1); // 重新构建
		}

		//弱引用

		String str2 = new String();

		WeakReference<String> weakStr = new WeakReference<String>(str2);

		str2 = null;


	}
}
