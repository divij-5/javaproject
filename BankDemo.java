class BankDemo {
    String name;
    double balance;


    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Divi", 1000);

        acc.deposit(500);
        acc.withdraw(300);
        acc.display();
    }
}