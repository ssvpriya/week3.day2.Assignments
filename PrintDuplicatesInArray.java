package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20);
		List<Integer> B=new ArrayList<Integer>();
		Set<Integer> set=new LinkedHashSet<Integer>();
		Set<Integer> set1=new LinkedHashSet<Integer>();
		for(int numbers : arr)
		{
			if(!B.contains(numbers))
			{
				B.add(numbers);
			}
			if(!set.add(numbers))
			{
				set1.add(numbers);
			}
		}
		System.out.println("Without Duplicate numbers in Array "+B);
		System.out.println("Duplicated Numbers: "+set1);
	}
	
	
	
}
