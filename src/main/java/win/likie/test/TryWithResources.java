package win.likie.test;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by huahui.wu on 2017/3/9.
 */
public class TryWithResources {
	/**
	 * try-with-resources
	 *
	 * @param path
	 * @return
	 * @throws Exception
	 */
	static String readFirstLineFromFile(String path) throws Exception {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			return bufferedReader.readLine();
		}
	}

	/**
	 * 编译后结果
	 */
	static String readFirstLineFromFileClass(String path)
			throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		Throwable localThrowable2 = null;
		try {
			return bufferedReader.readLine();
		} catch (Throwable localThrowable3) {
			localThrowable2 = localThrowable3;
			throw localThrowable3;
		} finally {
			if (bufferedReader != null) {
				if (localThrowable2 != null) {
					try {
						bufferedReader.close();
					} catch (Throwable x2) {
						localThrowable2.addSuppressed(x2);
					}
				} else {
					bufferedReader.close();
				}
			}
		}
	}

	public static void main(String[] args) {
		try {
			String line = readFirstLineFromFile("D://1.txt");
			System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

