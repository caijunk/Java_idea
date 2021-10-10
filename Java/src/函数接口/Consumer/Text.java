package 函数接口.Consumer;

import java.util.function.Consumer;

public class Text {
    public static void Cosumer(String[] arr, Consumer<String> con1,Consumer<String> con2){
        for (String str : arr) {
            con1.andThen(con2).accept(str);
        }
    }


    public static void main(String[] args) {
        String[] arr = {"数学，第一节","英语，第二节","语文课，第三节"};
        Cosumer(arr,(str)->{
                    String[] split = str.split("，");
                    System.out.print("课程："+split[0]+"。");
                },
                (str)->{
                    String[] split = str.split("，");
                    System.out.println("时间："+split[1]);
                });
    }
}

