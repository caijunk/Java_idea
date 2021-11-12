package 数据结构与算法.排序算法.选择排序;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {

		int array[] = new int[80000];
		for (int i = 0; i < 80000; i++) {
			array[i] = (int)(Math.random()*8000000);
		}

		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = simpleDateFormat.format(date);
		System.out.println(format);

		selectSort(array);

		Date date1 = new Date();
		String format1 = simpleDateFormat.format(date1);
		System.out.println(format1);

	}
	public static void selectSort(int array[]){
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;
			int min = array[i];
			for (int j = 1 + i; j <array.length ; j++) {
				if (min > array[j]){
					min = array[j];
					minIndex = j;
				}
			}
			if (minIndex != i){
				array[minIndex] = array[i];
				array[i] = min;
			}
//			System.out.println((i+1)+"轮排序后：");
//			System.out.println(Arrays.toString(array));
		}
	}
}
