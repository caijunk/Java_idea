package 函数接口.Supplierjie;

import java.util.function.Supplier;

public class Test {
    public static int getMax(Supplier<Integer> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        int[] arr = {100,0,-50,88,99,33,-30};
        int maxvalue = getMax(()->{
            int max =arr[0];
            for (int i : arr) {
                if (i>max){
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxvalue);
    }
}
