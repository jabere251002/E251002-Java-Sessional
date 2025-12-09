// Interface defining ATM operations
interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    void checkBalance();
}

// DBBL class implements ATMService
class DBBL implements ATMService {
    private double balance = 1000; // initial balance

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdraw Successful! New Balance: " + balance);
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful! New Balance: " + balance);
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main class for Programiz
public class Main {
    public static void main(String[] args) {
        DBBL atm = new DBBL();

        System.out.println("=== ATM Operations ===");
        atm.checkBalance();   // show initial balance
        atm.deposit(500);     // deposit money
        atm.withdraw(300);    // withdraw money
        atm.checkBalance();   // show final balance
    }
}
