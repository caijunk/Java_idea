package 每周一练.作业10.复习题2;

public class GzBank {
    int savedMoney;
    double year;
    double interestRate;

    public GzBank(int savedMoney, double year, double interestRate) {
        this.savedMoney = savedMoney;
        this.year = year;
        this.interestRate = interestRate*0.9;
    }
    public double getInterest() {
        return (savedMoney*year*interestRate);
    }
}
