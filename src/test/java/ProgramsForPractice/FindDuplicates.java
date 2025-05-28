package ProgramsForPractice;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] arr= {4,2,7,2,4,9};
		boolean[] visited = new boolean[arr.length];
		System.out.println("Duplicates are: ");
		for(int i=0; i<arr.length;i++)
		{
			if(visited[i]) 
				continue;
			boolean isDuplicate=false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					visited[j]=true;
					isDuplicate=true;
				}
			}
			if(isDuplicate)
			{
				System.out.println(arr[i]+" ");
			}
			}
		}

			

	}


