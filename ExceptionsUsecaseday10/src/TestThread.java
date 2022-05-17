
public class TestThread  {
public static void main(String[] args) {
		

		System.out.println(" started main.....");
		
		
		Mythread t1=new Mythread("t1");
		Mythread t2=new Mythread("t2");
		//t1.setDaemon(true);
		//t2.setDaemon(true);
		t1.start();
		t2.start();
		
		System.out.println(" existing  main.....");
	}
}
