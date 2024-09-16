import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class BankAccount {
    public static Scanner sc = new Scanner(System.in);

    private String accName = "No account name initialized";
    private String accNum = "No account number initialized";
    private double balance = 0;

    public BankAccount() {
        this.accName = "No account name initialized";
        this.accNum = "No account number initialized";
        this.balance = 0;
    }

    public String getAccName() {
        return accName;
    }

    public String getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int genAccNum() {
        Random rand = new Random();
        int num = rand.nextInt(2000000);
        return num;
    }

    public double Deposit() {
        System.out.print("How much would you like to add? > ");
        double amount = sc.nextDouble();
        return balance + amount;
    }

    public double Withdraw() {
        double amount = 0;

        do {
            System.out.println("How much would you like to withdraw? > ");
            amount = sc.nextDouble();

            if(amount > balance) {
                System.out.println("Insufficient balance");
            }
        } while(amount < balance);

        return balance - amount;
    }

    @Override
    public String toString(){
        return "Account Name: " + accName + "\nAccount Number: " + accNum + "\nBalance: " + balance + "kr";
    }
}
