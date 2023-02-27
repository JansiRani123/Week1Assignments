package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AssSortingUsingCollection {

	public static void main(String[] args) {
		
		String[] names= {"HCL","Wipro","AspireSystems","CTS"};
		
		int lengthofArray = names.length;
		
		//Using Arrays
		System.out.println(lengthofArray);
		Arrays.sort(names);
		
		for(int i=lengthofArray-1;i>=0;i--)
		{
		    System.out.println(names[i]);
		}
		
		//Using List
		
		List<String> list1=new ArrayList<String>();
		for(int i=0;i<lengthofArray;i++)
		{
			list1.add(names[i]);
			Collections.sort(list1);
		}
		System.out.println("Using List Concept :");
		System.out.println(list1);
			
		}
		
	}

