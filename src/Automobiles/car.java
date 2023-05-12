package Automobiles;

public class car {
   public void start () {
   System.out.println("car started");
   }
   public void stop () {
   System.out.println("car stoped");
   }
   public void restart () {
   System.out.println ("car restarted"); 
 }

	public static void main(String[] args) {
    System.out.println ("car is working");	
    //classname objectname = new classname ();
          car    A         =  new car ();
      A.start ();
      A.stop ();
      A.restart ();
	}

}
