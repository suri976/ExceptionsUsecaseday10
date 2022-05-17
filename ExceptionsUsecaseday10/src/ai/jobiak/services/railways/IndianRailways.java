package ai.jobiak.services.railways;



public class IndianRailways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RAccount ac1=new RAccount("423409","Chris Morgan","VIjayawada","Hyderabad",1200);
		RAccount ac2=new RAccount("84234","Daniel johnson","VIjayawada","guntur",1200);
		RAccount ac3=new RAccount("56234","Harish jackson","ranchi","delhi",1200);
		
		RAccountService service=ac1;
		double res = 0;
		//System.out.println(ac1.price+" "+ac1.getAccNo());
		try {
			
		 res=service.age(1);
		}
		catch( AgeException d)
		{
			System.err.println(d);
		}
		//System.out.println(res);
		
		boolean x=false;
		//System.out.println(ac2.price+" "+ac2.getAccNo());
		
		try {
			
			 x=service.status(false);
			}
			catch( StatusException d)
			{
				System.err.println(d);
			}
		
		RAccountService service1=ac3;
			//System.out.println(res);
		try {
			
			 res=service1.getTickets(res);
			}
			catch( TicketException d)
			{
				System.err.println(d);
			}
		
		
		
		
	}

}
