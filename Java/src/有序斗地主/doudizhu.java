package 有序斗地主;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class doudizhu {
    public static void main(String[] args) {
        //1.准备牌
        //存储索引和组装好的牌
        HashMap<Integer,String> poker = new HashMap<>();
        //存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //存储花色和牌的序号
        List<String> colors = List.of("♣", "♥", "♠", "♦");
        List<String> numbers = List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");
        //把大王和小王存储到集合中 定义一个牌的索引
        int index = 0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        //循环遍历两个集合 组合52张牌
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }

        }
        //2.洗牌
        Collections.shuffle(pokerIndex);
        //3.发牌
        //定义4个集合存储玩家牌的索引和底牌的索引
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        //遍存储牌的索引的List集合获取每一个牌的索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            if (i>=51){
                dipai.add(in);
            }else if (i%3==0){
                player01.add(in);
            }else if (i%3==1){
                player02.add(in);
            }else if (i%3==2){
                player03.add(in);
            }
        }
        //4.排序
        //使用Collections中的方法
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(dipai);
        //5.看牌
       lookPoker("小红",poker,player01);
       lookPoker("小蓝",poker,player02);
       lookPoker("小绿",poker,player03);
       lookPoker("小紫",poker,dipai);
    }
    //5.看牌的方法
    public static void lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        System.out.print(name + ":");
        for (Integer key:list) {
            String value = poker.get(key);
            System.out.print(value+" ");
        }
        System.out.println( );
    }

}
