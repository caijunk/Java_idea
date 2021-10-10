package 每周一练.作业10.复习题2;

public class ConBank {
    int savedMoney;
    double year;
    double interestRate;

    public ConBank(int savedMoney, double year, double interestRate) {
        this.savedMoney = savedMoney;
        this.year = year;
        this.interestRate = interestRate*0.8;
    }

    public double getInterest2() {
        return (savedMoney*year*interestRate);
    }
}
