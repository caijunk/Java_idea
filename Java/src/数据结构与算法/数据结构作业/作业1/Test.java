package 数据结构与算法.数据结构作业.作业1;

public class Test {
    public static void main(String[] args) {
    SeqList seqList = new SeqList();
        System.out.println("替换之前：");
        for (int i: seqList.valus) {
            System.out.print(i+" ");
        }

        System.out.println("");
        seqList.repaceFirst(70,10);

        System.out.println("");
        seqList.reoaceLast(70,50);

        System.out.println("");
        System.out.println("所查询的元素和元素的位置");
        int reselt = seqList.searchLast(70);
        System.out.println(seqList.valus[reselt-1]);
        System.out.println(reselt);
    }
}



class SeqList{
    Integer[] valus ={70,70,80,70,60};
//    替换首关键字
    public void repaceFirst(int key,int x){
        boolean flag = false;
        for (int i = 0; i < valus.length; i++) {
            if (valus[i] == key){
                valus[i] = x;
                flag = true;
                break;
            }
        }
        while (flag){
            System.out.println("替换成功");
            for (int i:valus) {
                System.out.print(i+" ");
            }
            break;
        }
    }

//    替换最后关键字
    public void reoaceLast(int key,int x){
        boolean flag = false;
        for (int i = valus.length-1; i >= 0 ; i--){
            if (valus[i] == key){
                valus[i] = x;
                flag = true;
                break;
            }
        }
        while (flag){
            System.out.println("替换成功");
            for (int i:valus) {
                System.out.print(i+" ");
            }
            break;
        }
    }
//    查找最后出现的关键字
    public int searchLast(int key){
        int num = 0;
        for (int i = valus.length-1; i >= 0; i--) {
            if (valus[i] == key){
                num = i;
                break;
            }
        }
        return num+1;
    }
}
