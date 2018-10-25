public class CheckingAccount implements Banking {
    private double balance;

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    //Increase @balance by @amount
    public double deposit(double amount) {
        return balance += amount;
    }

    //Decrease @balance by @amount and return @balance. If @amount is greater than @balance, return -1
    public double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough funds.");
            return -1;
        }
        return balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Checking Account Balance: " + "$" + balance;
    }
}
