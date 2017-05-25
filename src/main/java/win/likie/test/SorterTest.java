package win.likie.test;

import java.util.Arrays;
import java.util.Random;

/**
 * 排序
 * Created by huahui.wu on 2017/4/10.
 */
public class SorterTest {
	public int[] getArr(int length) {
		Random random = new Random();
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = random.nextInt(100);
		}
		System.out.println("原始数组：" + Arrays.toString(arr));
		return arr;
	}

	/**
	 * 冒泡排序算法
	 */
	public void bubbleSorter() {
		int[] arr = getArr(10);
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("冒泡排序：" + Arrays.toString(arr));

	}

	/**
	 * 选择排序
	 */
	public void selectSort() {
		int[] arr = getArr(10);
		for (int i = 0; i < arr.length - 1; i++) {
			int k = i;
			for (int j = k + 1; j < arr.length; j++) {// 选最小的记录
				if (arr[j] < arr[k]) {
					k = j; //记下目前找到的最小值所在的位置
				}
			}
			//在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
			if (i != k) {  //交换a[i]和a[k]
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
		System.out.println("选择排序：" + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		SorterTest sorterTest = new SorterTest();
		sorterTest.bubbleSorter();
		sorterTest.selectSort();
	}
}
