package org.system;

public class Desktop extends Computer{

	public void systemName()
	{
		
		System.out.println("The System name is : System Name DESKTOP-SR87D7N\r\n");
	}
	public static void main(String[] args) {
		
		Desktop dt=new Desktop();
		dt.systemName();
		dt.computerModel();
			
	}
}
