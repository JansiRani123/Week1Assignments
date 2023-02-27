package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class AssUniquecharacters {

	public static void main(String[] args) {
		
		String name="JansiRani";
		String case1 = name.toLowerCase();
		char[] charArray = case1.toCharArray();
		
		Set<Character> set1=new LinkedHashSet<Character>();
		
		for(int i=0;i<charArray.length;i++)
		{
			set1.add(charArray[i]);
		}
			System.out.println(set1);
		
	}
	
		
}

