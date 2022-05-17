package ai.jobiak.services.railways;



public interface RAccountService {
	
	
	
	double getTickets( double x)  throws TicketException;
	boolean status(boolean sta) throws StatusException ;
	double age( double ag) throws AgeException;
	
	

}
