package ProgramsForPractice;

import java.util.HashSet;

public class PairSum {

	public static void findPairs(int[] arr, int target)
	{
		HashSet<Integer> seen=new HashSet<>();
		for(int num:arr)
		{
			int complement=target-num;
			if(seen.contains(complement))
			{
				System.out.println("(" + complement + "," + num + ")");
			}
			seen.add(num);
		}
	}
	public static void main(String[] args)
	{
		int[] arr= { 2,4,5,3,4,8,-1};
		int target =7;
		findPairs(arr,target);
	}
}


/* Iteration-1
 * num=2, complement =7-2=5, seen doesn't contain 5, add 2 to seen--> {2}
 * num=4, complement =7-4=3, seen doesn't contain 3, add 4 to seen--> {2,4} 
 * num=5, complement =7-5=2, seen contain 2, print (2,5) , add 2 to seen--> {2,4,5} 
 * num=3, complement =7-3=4, seen contain 4, print (4,3) , add 3 to seen--> {2,3,4,5} 
 * num=4, complement =7-4=3, seen contain 3, print (3,4) , add 3 to seen--> {2,3,4,5} 
 * num=4, complement =7-4=3, seen doesn't contain 3, add 4 to seen--> {2,4} 
 */
