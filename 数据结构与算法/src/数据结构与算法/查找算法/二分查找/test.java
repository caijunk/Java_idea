package 数据结构与算法.查找算法.二分查找;

import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		int[] array ={2,5,8,7,9,50,60,100,100,100};
		ArrayList<Integer> list = binarySearch(array, 0, array.length, 100);
		for (int a:list) {
			System.out.println(a);
		}
	}
	public static ArrayList<Integer> binarySearch(int[] array,int left,int right,int findval){
		ArrayList<Integer> list = new ArrayList<>();
		if (left > right){
			return new ArrayList<>();
		}
		int mid =(left + right) / 2;
		int midval = array[mid];
		if (findval > midval){
			return binarySearch(array,mid+1,right,findval);
		}else if (findval < midval){
			return binarySearch(array,left,mid-1,findval);
		}else{

			int temp = mid-1;
			while (true){
				if (temp < 0 || array[temp] != findval){
					break;
				}
				list.add(temp);
				temp -= 1;
			}

			list.add(mid);

			temp = mid +1;
			while (true){
				if (temp > array.length-1 || array[temp] != findval){
					break;
				}
				list.add(temp);
				temp += 1;
			}
		}
		return list;
	}
}
