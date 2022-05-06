package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A=Arrays.asList(3,2,11,4,6,7);
		List<Integer> B=Arrays.asList(1,2,8,4,9,7);
		List<Integer> C=new ArrayList<Integer>();
		for(int numbers : A)
		{
			for(int numbers1: B)
			{
				if(numbers == numbers1)
				//System.out.println(numbers);
				C.add(numbers);
			}
		}
	    
		System.out.println(C);

	}

}
