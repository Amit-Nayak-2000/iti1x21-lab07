public class Account{
    double balance;

    public Account(){
        balance = 0.0;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println(balance);
    }

    public void withdraw(double amount){
        if (balance < amount){
	        throw new NotEnoughMoneyException(amount, balance);
	    }
        balance -= amount;
        System.out.println(balance);
    }

    
}