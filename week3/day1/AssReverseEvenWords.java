package week3.day1;

public class AssReverseEvenWords {

	public static void main(String[] args) {
		
		String name="JansiRani";
		char[] charArray = name.toCharArray();
		for(int i=charArray.length-1;i>=0;i--)
		{
			if(i%2==0)
			{
				System.out.println("we printed name in reverse order only in even index :"+i +":"+ charArray[i]);
			}
		}
	}
}
