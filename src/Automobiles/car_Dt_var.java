package Automobiles;

public class car_Dt_var {
	int  b = 20; //instance variable
	static int empid = 30; //static variable
   public void start(){
	   int  a = 10; //local variable
   System.out.println("car started");
   System.out.println(a+"local variable");//10
   System.out.println (b+"instance variable"); //20
   System.out.println (empid+ "static variable");//30
   }
   public void stop () {
	   System.out.println ("car stopped");
	   System.out.println (b+"instance variable"); //20
	   System.out.println (empid+ "static variable");//30
   }
   public void restart () {
	   System.out.println ("car restarted");
	   System.out.println (b+ "instance variable"); //20
	   System.out.println (empid+ "static variable");//30
   }
	public static void main(String[] args) {
	System.out.println ("car is working");
	//classname   object  =  new classname ();
	car_Dt_var   m      =  new car_Dt_var ();
	m.start();
	m.stop();
	m.restart();
	
	}

}
