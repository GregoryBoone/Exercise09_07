import java.util.Date;

public class Account {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }



    public Date getDateCreated() {
        return dateCreated;
    }

    private int id = 0;
    private double balance = 0, annualInterestRate = 0;
    private Date dateCreated = new Date();

    Account(){

    }

    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 100 / 12.0;
    }

    public double getMonthlyInterest(){
        return this.balance * (getMonthlyInterestRate());
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }
}
