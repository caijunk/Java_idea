package 数据结构与算法.递归.八皇后;

public class test {
	static int max = 8;
	static int[] ints = new int[8];
	static int count = 0;

	public static void main(String[] args) {
	put(0);
		System.out.println("解决方法有"+count);
	}

	public static void out(){
		count++;
		for (int i = 0; i < max; i++) {
			System.out.print(ints[i]);
		}
		System.out.println();
	}

	public static boolean judge(int n){
		for (int i = 0; i < n; i++) {
//			1.array[i] == array[n] 表示判断 第n个皇后是否和前面的n-1个皇后在同一列
//			2.Math.abs(n-i) == Math.abs(array[n] - array[i]) 表示判断第n个皇后是否和第i皇后在同一斜线
//			3.没有必要判断是否在同一行，因为n每次都在增加
			if (ints[i] == ints[n] || Math.abs(n-i) == Math.abs(ints[n] - ints[i])){
				return false;
			}
		}
		return true;
	}

	public static void put(int n){
//		n == max，说明已经放到最后一个皇后了
		if (n == max){
			out();
			return;
		}
//		依次放入皇后，并判断是否冲突
		for (int i = 0; i < max; i++) {
//			先把当前的皇后放到该行的第一列
			ints[n] = i;
//			判断当放置第n个皇后到i列时，是否冲突
			if (judge(n)){
				put(n+1);
			}
//			如果冲突，就继续执行array[n] = i ；即将第n个皇后，放置到本行的下一列
		}
	}
}
