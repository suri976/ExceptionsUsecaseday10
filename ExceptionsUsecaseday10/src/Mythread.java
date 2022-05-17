
public class Mythread extends Thread {

	String name;
	 Mythread(String name)
	 {
		 this.name=name;
	 }
	 public void run()
	 {
		 for(int i=0;i<21;i++)
		 {
			 System.out.println(this.name+"#entered run()"+i);
		 }
	 }

}
