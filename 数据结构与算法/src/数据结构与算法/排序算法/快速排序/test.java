package 数据结构与算法.排序算法.快速排序;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		int array[] = {5,5,-5,20,30,-50,2,3,7,2,-5,2};
		quickSore(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}
	public static void quickSore(int array[],int left,int right){
		if (left > right){
			return;
		}
		int privot = array[left];
		int l = left;
		int r = right;
		int temp = 0;
		while (l != r){

			while (array[r] >= privot && l < r){
			r--;
			}

			while (array[l] <= privot && l < r ){
				l++;
			}

			if (l < r){
				temp = array[l];
				array[l] = array[r];
				array[r] = temp;
			}
		}

		array[left] = array[l];
		array[l] = privot;

		quickSore(array,left,l-1);
		quickSore(array,l+1,right);

	}
}
