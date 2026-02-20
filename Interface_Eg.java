package Abstraction;
interface Interface_Eg2 {
	String name = "Hello";
	void run();
	}

interface Interface_Eg1 {
	String name1 = "How are you";
	void show();
}

public class Interface_Eg implements Interface_Eg2, Interface_Eg1 {
	public void run ()
	{
		System.out.println(name);
	}
	
	public void show ()
	{
		System.out.println(name1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Interface_Eg obj=new Interface_Eg();
obj.run();
obj.show();
	}

}



