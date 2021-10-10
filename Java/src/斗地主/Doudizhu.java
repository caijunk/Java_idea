package 斗地主;

import java.util.ArrayList;
import java.util.Collections;

public class Doudizhu {
    public static void main(String[] args) {
        //1.准备牌
        ArrayList<String> poker = new ArrayList<String>();
        String[] colors = {"♣", "♥", "♠", "♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");
        //组装52张牌
        for (String number:numbers) {
            for (String color : colors) {
               poker.add(color+number);
            }
        }
        //2.洗牌
        Collections.shuffle(poker);
        //3.发牌
        ArrayList<String> palyer01 = new ArrayList<>();
        ArrayList<String> palyer02 = new ArrayList<>();
        ArrayList<String> palyer03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if(i>=51){
                dipai.add(p);
            }else if (i%3==0){
                palyer01.add(p);
            }else if (i%3==1){
                palyer02.add(p);
            }else if (i%3==2){
                palyer03.add(p);
            }
        }
        //4.看牌
        System.out.println("红"+palyer01);
        System.out.println("黄"+palyer02);
        System.out.println("蓝"+palyer03);
        System.out.println("绿"+dipai);
    }
}
