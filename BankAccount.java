public class BankAccount {
    private String holderName; 
    private double balance;
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public BankAccount(String holderName, double initial, double interestRate) {
        this.holderName = holderName;
        this.balance = initial;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds to withdraw $" + amount);
        }
    }

    public void monthlyFee() {
        this.withdraw(10);
    }

    public void annualInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
    }

    public String toString() {
        if (balance >= 0) {
            return holderName + ", $" + String.format("%.2f", balance);
        } else {
            return holderName + ", -$" + String.format("%.2f", -balance);
        }
    }

    public void transfer(BankAccount other, double amount) {
        if (balance >= amount + 0.5) {
            this.withdraw(amount + 0.5);
            other.deposit(amount);
            System.out.println("$" + amount + " transferred to " + other.holderName + " with a $0.5 fee.");
        } else {
            System.out.println("Insufficient funds to transfer $" + amount + " to " + other.holderName);
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Benson", 1000.0, 5.0);
        BankAccount account2 = new BankAccount("Mathew", 500.0, 5.0);

        System.out.println(account1.toString());
        System.out.println(account2.toString());

        account1.deposit(100.0);
        account2.withdraw(50.0);

        System.out.println(account1.toString());
        System.out.println(account2.toString());

        account1.transfer(account2, 200.0);

        System.out.println(account1.toString());
        System.out.println(account2.toString());

        account1.monthlyFee();
        account2.annualInterest();

        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
