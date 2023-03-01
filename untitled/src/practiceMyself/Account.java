package practiceMyself;

public class Account {
    private String id;
    private String name;
    int balance = 0;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public int credit(int amount){
        this.balance += amount;
        return getBalance();
    }

    public int debit(int amount){
        if(amount <= getBalance()){
            this.balance -= amount;
        }else{
             System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int TransferTo(Account another, int amount){ // another is the account that is being transfered to //Account another is the object that is being transfered to. The type is Account and the name is another
        if(amount <= getBalance()){
            this.balance -= amount;
            another.balance += amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return balance;

    }

    public String toString(){
        return "Account[id = " + getID() + " name = " + getName() + " balance = " + getBalance() + "]";
    }
}
