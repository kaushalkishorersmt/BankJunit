
public class BankAccount {
	int balance;
	
	public BankAccount(){
		balance=500;
	}
	
	int depositCash(int amt){
		balance+=balance;
		return 1;
	}
	int withdrawCash(int amt){
		balance-=balance;
		return 1;
	}
	
	int getBalance(){
		return balance;
	}
}
