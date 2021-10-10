package 每周一练.作业10.复习题2;

public class BankDemo{
    public static void main(String[] args) {
        ConBank conBank = new ConBank(10000,5.5,0.035);
        GzBank gzBank = new GzBank(10000,5.5,0.045);
        System.out.println("广州银行的利息："+gzBank.getInterest());
        System.out.println("建设银行的利息："+conBank.getInterest2());
    }

}
