public class DuplicateElementsInArray
{
    public static void main(String[] args)
    {
        String[] a = {"JAVA", "C", "C++", "JAVA", "Python", "Ruby", "Python", "JAVA"};

        System.out.println("Duplicate elements in the array:");

        for (int i = 0; i < a.length; i++)
        {
            boolean isDuplicate = false;

            // Check if this element already appeared before index i
            for (int k = 0; k < i; k++)
            {
                if (a[i].equals(a[k]))
                {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate)
                continue;

            // Compare with remaining elements
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i].equals(a[j]))
                {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}
