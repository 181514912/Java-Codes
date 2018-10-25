public class CreditAccount implements Banking {
    private double balance = 0;
    private double interest;
    private double creditLine;
    private double available;

    public CreditAccount(double interest, double creditLine) {
        this.interest = interest;
        this.creditLine = creditLine;
        available = creditLine;
    }

    public double deposit(double amount) {
        balance -= amount;
        available += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > available) {
            System.out.println("Not enough funds.");
            return -1;
        }

        balance += amount;
        available -= amount;

        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Credit Account Balance: " + "$" + balance + " Interest Rate: " + interest + "%" + " Credit Line: " + "$" + creditLine + " Available to Spend: " + "$" + available;
    }
}
