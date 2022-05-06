package week3.day2.Assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(1,2,3,4,7,6,8);
		Collections.sort(arr);
		System.out.println(arr);
		int x=arr.size();
		int index=1;
		System.out.println("Size of Array : "+x);
//		for(int i=1;i<=x;i++)
//		{
//			if(arr.get(i-1)!=i)
//			{
//               System.out.println(arr.get(i-1));
//               break;
//			}
//		}
		for(int numbers : arr)
		{
			if(numbers!=index++)
			{
				System.out.println(numbers);
                break;
			}
		}

	}

}
