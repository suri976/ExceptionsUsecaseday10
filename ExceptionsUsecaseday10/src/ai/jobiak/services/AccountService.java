package ai.jobiak.services;
import ai.jobiak.services.TransferException;
import ai.jobiak.services.DepositException;
import ai.jobiak.services.WithdrawException;
public interface AccountService {
	
	double withdraw(double amount) throws WithdrawException;
	double transfer(Account account,double amount) throws TransferException;
	double getBalance(String accNo);
	double deposit(double amount) throws DepositException;

}
