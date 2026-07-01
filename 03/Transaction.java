import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Transaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        String accountHolderName = sc.nextLine();
        double balance = sc.nextDouble();
        BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println(account.getBalance());
        sc.close();
    }
}