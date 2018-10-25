public class BankDriver {
    public static void main(String[] args) {
        Banking[] myAccounts = new Banking[3];
        myAccounts[0] = new CheckingAccount(200.00);
        myAccounts[1] = new SavingsAccount(500.00, 0.5);
        myAccounts[2] = new CreditAccount(13.1, 1000.0);

        System.out.println("INITIAL ACCOUNTS");
        for (Banking account : myAccounts) {
            System.out.println(account);
        }
        System.out.println();

        myAccounts[0].withdraw(75.75);
        myAccounts[1].deposit(100.00);
        myAccounts[2].withdraw(350.25);

        System.out.println("TRANSACTIONS ROUND 1");
        for (Banking account : myAccounts) {
            System.out.println(account);
        }
        System.out.println();

        myAccounts[0].deposit(50.00);
        myAccounts[1].withdraw(500.00);
        myAccounts[2].deposit(30.00);

        System.out.println("TRANSACTIONS ROUND 2");
        for (Banking account : myAccounts) {
            System.out.println(account);
        }
        System.out.println();
    }
}