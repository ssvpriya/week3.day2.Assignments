package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data= Arrays.asList(3,2,11,4,6,7);
		List<Integer> reverse=new ArrayList<Integer>();
		Collections.sort(data);
		System.out.println("Sorted Array  " +data);
		Collections.reverse(data);
		System.out.println("Descending Array  "+data);
		Integer integer = data.get(1);
		System.out.println("Second Largest number "+integer);


	}

}
