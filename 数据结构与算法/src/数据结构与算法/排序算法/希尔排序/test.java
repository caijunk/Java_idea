package 数据结构与算法.排序算法.希尔排序;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
	public static void main(String[] args) {
		int array[] = new int[80000];
		for (int i = 0; i < 80000; i++) {
			array[i] = (int)(Math.random()*80000000);
		}

		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = simpleDateFormat.format(date);
		System.out.println(format);

		shellSort(array);

		Date date1 = new Date();
		String format1 = simpleDateFormat.format(date1);
		System.out.println(format1);
	}
//移位法
	public static void shellSort(int array[]){
	for (int gap = array.length/2;gap > 0; gap/=2){
		for (int i = gap; i <array.length ; i++) {
			int j = i;
			int temp = array[i];
			if (array[j] < array[j-gap]){
				while(j - gap >= 0 && temp < array[j-gap]){
					array[j] = array[j-gap];
					j -= gap;
				}
				array[j] = temp;
			}
		}
	}
	}
}
