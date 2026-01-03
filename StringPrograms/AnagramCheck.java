import java.util.Arrays;

public class AnagramCheck
{
    public static void main(String[] args)
    {
        String s1 = "Dormitory";
        String s2 = "Dirty room";

        s1 = s1.toLowerCase().replace(" ", "");
        s2 = s2.toLowerCase().replace(" ", "");

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if (Arrays.equals(c1, c2))
        {
            System.out.println("The given two strings are anagrams of each other");
        }
        else
        {
            System.out.println("The given two strings are not anagrams");
        }
    }
}
