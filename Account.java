package OOP;

public class Account {
    private double balance;

    //Default constructor(no argument)
    public Account() {
        this.balance = 0.0;
    }

    //constructor with initial balance(with argument)
    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
            this.balance = 0.0;
        }
    }

    //Method to deposit the amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited:" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw:" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient Balance.");
        } else {
            System.out.println("Withdraw amount must be positive.");
        }
    }

    //method to display
    public void displayBalance() {
        System.out.println("Current Balance" + balance);
    }

    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account(200);
        acc1.deposit(1000);
        acc1.withdraw(200);
        acc1.displayBalance();
        acc2.deposit(300);
        acc2.withdraw(600);
        acc2.displayBalance();
    }
}
