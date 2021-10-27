package 数据结构与算法.排序算法;

public class test {
	public static void main(String[] args) {

	}
	public void selectSort(int array[]){
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int index = i;
			for (int j = 1+i; j < array.length; j++) {
				if (min > array[j]){
					min = array[j];
					index = j;
				}
			}
			if(index != i){
				array[index] = array[i];
				array[i] = min;
			}
		}
	}

	public void quickSort(int array[],int left,int right){
		if (left>right){
			return;
		}
		int privot = array[left];
		int l = left;
		int r = right;
		int temp = 0;
		while (l != r){
			while (array[r] > privot && l < r){
				r--;
			}
			while(array[l] < privot && l < r){
				l++;
			}
			if (l<r){
				temp = array[l];
				array[l] = array[r];
				array[r] = temp;
			}
		}
		quickSort(array, left, l-1);
		quickSort(array, l+1, right);
	}

	public void bobbleSort(int array[]){
		boolean flag = false;
		int temp = 0;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[i] > array[j+1]){
					flag = true;
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			if (flag == false){
				break;
			}else{
				flag = false;
			}
		}
	}

}
