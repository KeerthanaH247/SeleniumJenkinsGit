package ProgramsForPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccuranceUsingHashMap {
	
	public static void characterCount(String inputString)
	{
		LinkedHashMap<Character,Integer> charCountMap=new LinkedHashMap<>();
		char[] strArray=inputString.toLowerCase().toCharArray();
		for(char c: strArray)
		{
				charCountMap.put(c, charCountMap.getOrDefault(c,0)+1);
			
			}
			for(Map.Entry<Character,Integer> entry:charCountMap.entrySet())
			{
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	
	
	public static void main(String[] args) {
		String str="Keerthana";
		
		characterCount(str);
	}

}
