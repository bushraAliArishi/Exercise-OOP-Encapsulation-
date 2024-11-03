import java.util.InputMismatchException;

public class Account {
    private String id, name;
    private int balance=0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account() {
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
    public int credit(int amount){
        try {
            this.balance=this.balance+amount;
             System.out.println("Amount credited: " + amount);
             System.out.println("your new balance is :"+this.balance);  }
        catch (InputMismatchException misMa){

            System.out.println(misMa.getMessage());
        }


    return this.balance;
    }
    public int debit(int amount) {
        if (this.balance>=amount){
            this.balance=this.balance-amount;
            System.out.println("Amount debited: " + amount);
            System.out.println("your new balance is :"+this.balance);
        }else System.out.println("you cant make a debited to");

        return balance;}

        public int transferTo(Account toAccount, int amount){
            if (this.balance>=amount){
                toAccount.setBalance(toAccount.getBalance()+amount);
                this.balance=this.balance-amount;
                System.out.println("Amount transferred: " + amount + " to account " + toAccount.getName());
            }else System.out.println("you cant make a transfer to "+toAccount.getName());
            return balance;
        }



        public String toString () {
            return "Account{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", balance=" + balance +
                    '}';
        }
    }