package 数据结构与算法.查找算法.线性查找;

public class test {
	public static void main(String[] args) {
		int [] array = {12,5,4,1,30,45,123,542,1,12};
		search(array,1);
	}
	public static void search(int[] array,int p){
		for (int i = 0; i < array.length; i++) {
			if (array[i] == p){
				System.out.println(i);
			}
		}
	}
}
