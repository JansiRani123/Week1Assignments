package week3.day1;

public class AssChangeOddIndexToUpper {

	public static void main(String[] args) {
		
		String name="jansirani";
		char[] chrArray = name.toCharArray();
		
		for(int i=0;i<chrArray.length;i++)
		{
			if((i%2!=0))
			{
				chrArray[i] = Character.toUpperCase(chrArray[i]);
			}
			System.out.println(chrArray[i]);
			
			}
		}
				
}


