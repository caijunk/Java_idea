package 数据结构.排序算法.插入排序;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int array[] = {3,75,12,1,-1,-5,60};
		InsertSort(array);
	}
	public static void InsertSort(int array[]){
		int insertval = 0;
		int insertIndex = 0;
		for (int i = 1; i < array.length; i++) {
			insertval = array[i];
			insertIndex = i - 1;

			while (insertIndex >= 0 && insertval < array[insertIndex]){
				array[insertIndex + 1] = array[insertIndex];
				insertIndex--;
			}
			array[insertIndex + 1] = insertval;

			System.out.println("第"+i+"轮插入");
			System.out.println(Arrays.toString(array));
		}
	}
}
