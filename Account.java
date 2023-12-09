public class Account {
    private double balance;
    private double interestRate;
    public Account(double initialBalance) {
        this.balance = Math.max(initialBalance, 0); 
        this.interestRate = 0.02; 
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("$" + amount + " withdrawn successfully.");
            } else {
                System.out.println("Insufficient funds. $5 penalty charged.");
                balance -= 5; // Charge a $5 penalty
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void computeInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of $" + interest + " applied. Current balance: $" + balance);
    }

    public static void main(String[] args) {
        Account myAccount = new Account(1000);

        myAccount.deposit(500);
        myAccount.withdraw(300);
        myAccount.computeInterest();
        double currentBalance = myAccount.getBalance();
        System.out.println("Current balance: $" + currentBalance);
    }
} 