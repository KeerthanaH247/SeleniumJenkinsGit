package ProgramsForPractice;

public class RotateArray {
	public static void rotate(int[] arr, int start, int end)
	{
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int k=2;
		int n=arr.length;
		k=k%n;
		rotate(arr,0,n-1);
		rotate(arr,0,k-1);
		rotate(arr,k,n-1);
		System.out.println("Rotated Array:");
		for(int i: arr)
		{
			System.out.println(i+" ");
		}
	}

}
