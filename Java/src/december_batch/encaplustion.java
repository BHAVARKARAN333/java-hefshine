package december_batch;

class BankAccount {

    private int balance = 100;

    public void setBalance(int amount) {
    	   balance = balance + amount;
    }

    public int getBalance() {
        return balance;
    }
}

public class encaplustion {

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.setBalance(1000);
        b.setBalance(500);

        System.out.println(b.getBalance());
    }
}
