package 每周一练.作业10.复习题1;

public class ExThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("我是线程2--"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
