package ai.jobiak.services.railways;



public class RAccount implements RAccountService {
	String accNo;
	String fullname;
	String source;
	String destination;
	double price;
	public RAccount() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public RAccount(String accNo, String fullname, String source, String destination,double price) {
		super();
		this.accNo = accNo;
		this.fullname = fullname;
		this.source = source;
		this.price=price;
		this.destination = destination;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		
		this.price = price;
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
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return this.destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public double getTickets( double ticket) throws TicketException
	{
		if(ticket==0)
		{
			throw new  TicketException("No tickets are Available "+this.accNo+" "+ this.fullname);
		}
		else
		{
			System.out.println(ticket+"tickets are Available  "+this.accNo+" "+ this.fullname);
		}
		return ticket;
	}
	public boolean status(boolean st) throws StatusException 
	{
	
		if(st==false)
		{
			throw new  StatusException("Your ticket is not Booked "+this.accNo+" "+ this.fullname);
		}
		else
		{
			System.out.println("You ticket is Booked "+this.accNo+" "+ this.fullname);
		}
		
		
		
		return st;
	}
	
	public double age( double ag) throws AgeException
	{
		
		if(ag<5 || ag>50)
		{
			throw new  AgeException("Age should be in the 5-50  "+this.accNo+" "+ this.fullname);
		}
		else
		{
			System.out.println("You can proceed your transaction");
		}
		
		return ag;
	}
	
	 
	 

}
