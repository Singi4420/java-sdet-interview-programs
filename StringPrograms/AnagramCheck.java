import java.util.Arrays;
public class AnagramCheck
{
	public static void main(String[] args)
	{
		String s1 = "Dormitory";
		String s2 = "Dirty room";
		
		
		
		s1 = s1.replace(" ", "").toLowerCase();
		s2 = s2.replace(" ", "").toLowerCase();
		if(s1.length()!=s2.length())
		{ 
			System.out.println("the Given String are not anagram");
            return;
		}
		
		else 
		{
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1,c2))
		{
			System.out.println("The Given Strings are Anagram");
		}
		else
		{
			System.out.println("the Given String are not Anagram");
		}
		
		}

	}
}
