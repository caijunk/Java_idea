package 数据结构.递归.迷宫问题;

public class test {
	public static void main(String[] args) {
//		创建一个二维数组，当做地图
		int[][] map =  new int[8][7];
//		先让上下面都为1
		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
//		先让左右面都为1
		for (int i = 0; i < 8; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
//		设置障碍
		map[3][1] = 1;
		map[3][2] = 1;
//		输出刚开始的地图
		System.out.println("开始地图的情况");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println("");
		}
//		使用递归给小球找路
		setWay(map,1,1);
//		输出走后的地图
		System.out.println("走后地图的情况");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}

	//使用递归回溯来给小球找路
//说明
//1.map 表示地图
//2.i，j 表示从地图的哪个位置开始触发
//3.如果小球能到达 map[6][5] 位置，则说明通路找到了
//4.约定：当 map[i][j] 为 0 时表示该点没有走过，为 1 表示墙，为 2 表示通路可以走，为 3 表示该点已经走过，但是走不通
//5.在走迷宫时，需要确定一个策略：下 -> 右 -> 上 -> 左，如果该店走不通，再回溯
	/**
	 *
	 * @param map 表示地图
	 * @param i 从哪一行开始找
	 * @param j 从哪一列开始找
	 * @return 如果找到通路，就返回 true，否则返回 false
	 */
	public static boolean setWay(int[][] map,int i,int j){
		if (map[6][5] == 2){
			return true;
		}else {
			if (map[i][j] == 0){
				map[i][j] = 2;
				if (setWay(map,i+1,j)){//向下走
					return true;
				}else if (setWay(map, i, j+1)){//向右走
					return true;
				}else if (setWay(map, i-1, j)){//向上走
					return true;
				}else if (setWay(map, i, j-1)){//向左走
					return true;
				}else{
//					表示该点是走不通的
					map[i][j] = 3;
					return false;
				}
			}else {
//				如果map[i][j] != 0,则可能是1 2 3
				return false;
			}
		}
	}
}
