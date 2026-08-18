// Abstract class
abstract class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accNum, double initialBalance) {
        this.accountNumber = accNum;
        this.balance = initialBalance;
    }

    // Abstract method (no body)
    abstract void calculateInterest();

    // Regular method
    void displayBalance() {
        System.out.println("Account No: " + accountNumber + " | Balance: $" + balance);
    }
}

// Concrete subclass
class SavingsAccount extends BankAccount {
    SavingsAccount(String accNum, double initialBalance) {
        super(accNum, initialBalance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.04; // 4% interest
        System.out.println("Savings Account Interest: $" + interest);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        System.out.println("--- Abstract Class Demo ---");
        BankAccount acc = new SavingsAccount("SA-10293", 5000.00);
        acc.displayBalance();
        acc.calculateInterest();
    }
}