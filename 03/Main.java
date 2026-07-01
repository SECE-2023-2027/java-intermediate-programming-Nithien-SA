import java.util.Scanner;

public class Main {
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