package week3.day2.Assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String result="";
		String[] split = text.split(" ");
		Set<String> set=new LinkedHashSet<String>(Arrays.asList(split));
		for(String words:set)
		{
			result = result + words + " ";
		}
		System.out.println("Remaoval of duplicates : " +result);

	}

}
