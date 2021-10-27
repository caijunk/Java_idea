package 数据结构与算法.单向环形链表.约瑟夫;

public class Josephu {
    public static void main(String[] args) {
        SeqList seqList = new SeqList();
        seqList.addStu(107);
        seqList.countStu(38,3,107);
    }
}

//  创建一个环形单向链表
class SeqList{
//  创建第一个节点
    private Stu first = null;
//    创建增添节点的方法
    public void addStu(int nums){
//        如果节点小于1，则是空链表，没意义
        if (nums < 1){
            System.out.println("数据错误");
            return;
        }
//      辅助指针
        Stu curStu = null;
//        用循环加入节点
        for (int i = 1;i <= nums; i++){
            Stu stu = new Stu(i);
//            如果是第一个节点，要自己连自己，形成一个环
            if (i == 1){
                first = stu;
                first.next = first;
                curStu = first;
            }else{
                curStu.next = stu;//把新的节点赋值给curstu（其实就是first）的下一个
                stu.next =first;//再令first等于stu的下一个（形成一个环）
                curStu =stu;//在把把辅助节点curstu移动到stu上
            }
        }
    }
    //编历链表
    public void showStu(){
//        如果链表为空则无需遍历
        if (first == null){
            System.out.println("链表为空");
            return;
        }
//        创建一个辅助节点位于第一个位置
        Stu curStu = first;
//        使用循环遍历
        while (true) {
            System.out.printf("小孩的编号%d \n" ,curStu.no);
//            遍历完结束
            if (curStu.next == first){
                break;
            }
//            把curstu往下移，实现遍历
            curStu = curStu.next;

        }
    }

    //实现约瑟夫环的计算方法
    public void countStu(int start,int distance,int nums){
//        判断数据是否有误，首位节点不能为空，start不能小于1并且不能大于nums
        if (first == null || start < 1 || start >nums  ){
            System.out.println("有误");
            return;
        }
//        创建一个辅助节点，事先应该指向该链表的最后一个位置
        Stu helper = first;
//        判断helper指向了最后一个节点
        while (true){
            if (helper.next == first){
                break;
            }
            helper = helper.next;
        }
//        开始计算之前，先让first和helper移动（开始位置 -1）次
        for (int j = 0; j < start - 1; j++) {
            first = first.next;
            helper = helper.next;
        }

            while (true){
//                判断最后一个节点
                if (helper == first){
                    break;
                }
//                当开始出圈时，让first和helper移动（报的数 -1）次
                for (int j = 0; j < distance - 1 ; j++) {
                    first = first.next;
                    helper = helper.next;
                }
                System.out.printf("学生%d出去\n" , first.no );
                first = first.next;//删除的就是first所指的节点
                helper.next = first;
            }
        System.out.printf("最后的幸存者%d \n",first.no);
    }
}

//创建一个学生类，表示一个节点
class Stu{
    int no;//编号
    Stu next;//指向下一个节点
    public Stu(int no){
        this.no = no;
    }
}