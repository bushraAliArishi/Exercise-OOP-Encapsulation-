public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0; // Default balance to 0 for accounts created with this constructor
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount credited: " + amount);
            System.out.println("Your new balance is: " + this.balance);
        } else {
            System.out.println("Cannot credit a non-positive amount.");
        }
        return this.balance;
    }

    public int debit(int amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Amount debited: " + amount);
            System.out.println("Your new balance is: " + this.balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
        return this.balance;
    }

    public int transferTo(Account toAccount, int amount) {
        if (amount > 0 && this.balance >= amount) {
            toAccount.setBalance(toAccount.getBalance() + amount);
            this.balance -= amount;
            System.out.println("Amount transferred: " + amount + " to account " + toAccount.getName());
        } else {
            System.out.println("Insufficient balance or invalid transfer amount to " + toAccount.getName());
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
