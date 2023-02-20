package week3.day1;

public class Students {
	
	public void studentInfo(int id) 
	{
		System.out.println("My Id is :"+id);
	}
	public void studentInfo(int id,String name ) 
	{
		System.out.println("My Id is :"+id+" and name is "+name);
	}
	public void studentInfo(int id,String name,String email) 
	{
		System.out.println("My Id is :"+id+" and name is "+name + " email "+email);
	}
	public void studentInfo(int id,int depId,String name,String email) 
	{
		System.out.println("My Id is :"+id+",deptID is depID "+depId+" and name is "+name+",email : "+email);
	}
	
	public static void main(String[] args) 
	{
		Students sd=new Students();
		sd.studentInfo(01153);
		sd.studentInfo(01153,"Rani");
		sd.studentInfo(01153, "Rani", "abc@gmail.com");
		sd.studentInfo(00153, 6789, "Rani", "abc@gmail.com");
		
	}
	
	

}
