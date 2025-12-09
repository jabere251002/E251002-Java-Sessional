class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    static String bankName = "Sonali Bank";

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void displayAccountInfo() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 =
                new BankAccount(251021, "Adnan Ajmain", 2000);
        BankAccount account2 =
                new BankAccount(251002, "Al Jaber", 1000);
        BankAccount account3 =
                new BankAccount(251010, "Abdullah Al Mamun", 500);

        account1.displayAccountInfo();
        System.out.println();
        account2.displayAccountInfo();
        System.out.println();
        account3.displayAccountInfo();
        System.out.println();

        BankAccount.showBankName();
    }
}
