public class FirstNonRepeatingCharacter
{
    public static void main(String[] args)
    {
        String str = "SDET Automation";
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int count = 0;
            boolean alreadyChecked = false;

            if (ch >= 'a' && ch <= 'z')
            {
                for (int k = 0; k < i; k++)
                {
                    if (ch == str.charAt(k))
                    {
                        alreadyChecked = true;
                        break;
                    }
                }

                if (alreadyChecked)
                {
                    continue;
                }

                for (int j = 0; j < str.length(); j++)
                {
                    if (ch == str.charAt(j))
                    {
                        count++;
                    }
                }

                if (count == 1)
                {
                    System.out.println("The first non-repeating character is : " + ch);
                    break;
                }
            }
        }
    }
}
