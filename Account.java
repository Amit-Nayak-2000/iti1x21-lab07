public class Account{
    double balance;

    public Account(){
        balance = 0.0;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double value){
        balance += value;
        System.out.println(balance);
    }

    public void withdraw(double value){
        if (balance < value){
	        throw new NotEnoughMoneyException(value, balance);
	    }
        balance -= value;
        System.out.println(balance);
    }

    
}