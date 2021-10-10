package 计时器;

public class MyThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i>=0){
            i++;
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
       Thread thread = new MyThread();
       thread.start();
    }
}

