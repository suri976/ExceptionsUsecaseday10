package ai.jobiak.services;
import ai.jobiak.services.TransferException;
import ai.jobiak.services.DepositException;
import ai.jobiak.services.WithdrawException;
public class BankofMiami {

	public static void main(String[] args) {
		
		Account ac1=new Account("106G","Daniel johnson",30000);
		Account ac2=new Account("206N","Chris Morgan",10200);
		Account ac3=new Account("106G","Harish jackson",23400);
		// TODO Auto-generated method stub
		AccountService service=ac1;
		double res = 0;
		System.out.println("Account state before deposit");
		System.out.println(ac1.getFullname()+" "+ac1.getBalance());
		
		System.out.println("Account state after deposit");
		System.out.println(ac1.getFullname()+" "+ac1.getBalance());
		
		try {
		 res=service.deposit(4000);
		}
		catch( DepositException d)
		{
			System.err.println(d);
		}
		
		//System.out.println(res);
		
		service =ac2;
	}
	

}
