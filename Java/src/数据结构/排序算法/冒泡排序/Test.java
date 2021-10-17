package 数据结构.排序算法.冒泡排序;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
//		int array[] = {3,9,-1,10,-2};
		int array[] = new int[80000];
		for (int i = 0; i < 80000; i++) {
			array[i] = (int)(Math.random()*8000000);
		}

		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = simpleDateFormat.format(date);
		System.out.println(format);

		bobbleSort(array);

		Date date1 = new Date();
		String format1 = simpleDateFormat.format(date1);
		System.out.println(format1);

	}


	public static void bobbleSort(int array[]){
		boolean flag = false;
		int temp = 0;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j+1]){
					flag = true;
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
//			System.out.println("第"+(i+1)+"次排序后的数组");
//			System.out.println(Arrays.toString(array));
			if (flag == false){
				break;
			}else{
				flag = false;
			}
		}
	}
}
