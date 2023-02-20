package week3.day1;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str="Jansi Rani";
		char[] array = str.toCharArray();
		System.out.println(array);
		 for(int i=str.length()-1;i>=0;i--)
		 {
			 System.out.print(array[i]);
		 
		 }
	}

}
