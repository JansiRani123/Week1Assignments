package week3.day2;

public class AssAutomation extends AssMultipleLanguage{

	public static void main(String[] args) {
 
		AssAutomation aut=new AssAutomation();
		aut.javaLang();
		aut.python();
		aut.ruby();
		aut.selenium();
		
		
	
}
	public void javaLang() {
		System.out.println("I am learning java now");
		
	}

	public void selenium() {
		System.out.println("I am learning selenium now");
		
	}

	@Override
	public void ruby() {
		System.out.println("most of them doees not go for ruby");
		
	}	

	
}
