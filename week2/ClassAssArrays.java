package week2.day2;

public class ClassAssArrays {
	
	public static void main(String[] args) {
		
		String names[]= {"Anu","Pooja","Keerthi","Ram","Latha"};
		int lengthOfArray=names.length;
		
		System.out.println(lengthOfArray);
		
		for(int i=0;i<lengthOfArray;i++)
		{
			System.out.println("The Names Present in an array are :" +names[i]);
		}
	}

}
