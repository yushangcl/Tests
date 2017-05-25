package win.likie.test;

import java.util.Random;

/**
 * Created by huahui.wu on 2017/3/6.
 */

public class Application {
	public static void main(String[] args) {
		int[] arr = new int[20];

		//生成随机数
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			arr[i] = random.nextInt(100);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
			if (i == arr.length - 1) {
				System.out.println("");
			}
		}

		// 冒泡排序方法
		for (int i = 0; i < arr.length - 1; i++) {
			for (int x = 0; x < arr.length - 1 - i; x++) {
				if (arr[x] > arr[x + 1]) {
					// 数值交换
					int a = arr[x];
					arr[x] = arr[x + 1];
					arr[x + 1] = a;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
			if (i == arr.length - 1) {
				System.out.println("");
			}
		}
	}
}
