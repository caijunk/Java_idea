package 等待唤醒机制;
//包子铺线程和包子线程关系（互斥）必须使用同步锁
public class BaoZiPu extends Thread {
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true){
            synchronized (bz){
                if(bz.flag==true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(count%2==0){
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                }else{
                    bz.pi = "冰皮";
                    bz.xian = "牛肉大葱馅";
                }
                count++;
                System.out.println("包子铺正在生产；"+bz.pi+bz.xian+"包子");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
                System.out.println("包子铺已经生产好了"+bz.pi+bz.xian+"包子，吃货可以开始吃了");

            }
        }
    }
}
