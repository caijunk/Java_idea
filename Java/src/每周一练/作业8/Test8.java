package 每周一练.作业8;

public class Test8 {
    public static void main(String[] args) {
        Window window = new Window();
        Targe t = new Targe(window, window.jTextField, window.jTextField2);
        Thread showtime = new Thread(t);
        showtime.start();
        time(window);
    }

    private static void time(Window window) {
        int time1 = 300;
        while (time1 > 0){
            time1--;
            try {
                Thread.sleep(1000);
                int mm = time1/60%60;
                int ss = time1%60;
                String str = "00:"+"0"+mm+":"+ss;
                window.jTextField2.setText(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
