package ai.jobiak.services;

public class Account implements AccountService{

	String accNo;
	String fullname;
	 double balance;
	public Account() {
		
		// TODO Auto-generated constructor stub
	}
	public Account(String accNo, String fullname, double balance) {
		super();
		this.accNo = accNo;
		this.fullname = fullname;
		this.balance = balance;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	 
	public double withdraw(double amount) throws WithdrawException
	{
		if(this.balance-amount<0)
		{
			throw new  WithdrawException("Insufficient funds"+this.accNo);
		}
		else
		{
			this.balance-=amount;
		}
		return this.balance;
		
	}
	public double transfer(Account account,double amount) throws TransferException{
		return this.balance;
	}
	public double getBalance(String accNo) {
		return this.balance;
		
	}
	public double deposit(double amount) throws DepositException{
		if(amount==50000)
		{
			throw new  DepositException("Entered negative amount "+this.accNo+" "+this.balance);
		}
		else
		{
			this.balance+=balance;
			
		}
		return this.balance;
	}
	 
	 

}
