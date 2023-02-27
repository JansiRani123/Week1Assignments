package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListLargestNumber {
	
public static void main(String[] args) {
	
	int[] num= {23,45,67,34,99,88,97};
	
	Set<Integer> num1=new TreeSet<Integer>();

	
	for(int i=0;i<num.length;i++)
	{
		boolean add = num1.add(num[i]);
		List<Integer> list1=new ArrayList<Integer>(num1);
		
	}
	System.out.println(num1);
	System.out.println("Second Largest number in an array is : "+num[num.length-1]);
	
}
}
