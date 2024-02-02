package task10;

public class Account  {
    private double balance;

    public Account() {
        this.balance = 0.0;  
    }

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Updated balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public static void main(String[] args) {
        
        Account account1 = new Account();  
        Account account2 = new Account(1000.0); 

        System.out.println("Initial Balance for Account 1: " + account1.balance);
        account1.deposit(500.0);
        account1.withdraw(200.0);

        System.out.println("\nInitial Balance for Account 2: " + account2.balance);
        account2.withdraw(1200.0);
        account2.deposit(300.0);
	}

}


