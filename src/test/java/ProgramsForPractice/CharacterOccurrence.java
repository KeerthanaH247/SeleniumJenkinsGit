package ProgramsForPractice;

import java.util.Scanner;

public  class CharacterOccurrence {
	public static void m1(String s) {
     char[] ch = s.toCharArray();
     boolean[] b = new boolean[s.length()];

     System.out.println("Character Occurrences:");
     for (int i = 0; i < ch.length; i++) {
         if (b[i]) continue;     // Skip already counted characters
         int c = 1;
         for (int j = i + 1; j < ch.length; j++) {
             if (ch[i] == ch[j]) {
                 c++;
                 b[j] = true;     // Mark character as counted
             }
         }
         System.out.println(ch[i] + " : " + c);
     	      
	         }
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a string");
	
	m1(s.nextLine());
}}