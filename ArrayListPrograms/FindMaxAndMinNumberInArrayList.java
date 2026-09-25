import java.util.*;
public class FindMaxAndMinNumberInArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 list.add(40);
		 list.add(50);
		 list.add(60);
		 list.add(80);
		 list.add(80);
		 
		 int max = list.get(0);
		 int min = list.get(0);
		 
		 for(int m : list)
		 {
			if(m > max)
			{
				max = m;
			}
			if(m< min)
			{
				min = m;
			}
			
		 }
		 
		 System.out.println("The Maximum Number in the ArrayList is :" + max);
		 System.out.println("The Minimum Number in the ArrayList is :" + min);
		 
	}
}