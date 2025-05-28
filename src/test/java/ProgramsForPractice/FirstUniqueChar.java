package ProgramsForPractice;

public class FirstUniqueChar {
	public static char findFirstNonRepetedChar(String str)
	{
		int[] count = new int[256];
		for(char ch: str.toCharArray())
		{
			count[ch]++;
		}
	for(char ch:str.toCharArray())
	{
		if(count[ch]==1)
		{
			return ch;
		}
	}
	return 0;
	}
	public static void main(String[] args) {
		String input= "aabbcddeff";
		char result= findFirstNonRepetedChar(input);
		if(result!=0)
		{
			System.out.println("First non-repetated character: "+ result);
		}
		else
		{
			System.out.println("No unique character found");
		}
	}

}
