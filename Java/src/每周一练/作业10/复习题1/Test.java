package 每周一练.作业10.复习题1;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 20 ; i++) {
            System.out.println("我是主线程--"+i);
            Thread.sleep(1000);

        }

        ExThread exThread = new ExThread();
        Thread thread = new Thread(exThread);
        thread.start();

        ExThread2 exThread2 = new ExThread2();
        Thread thread2 = new Thread(exThread2);
        thread2.start();
    }

}
