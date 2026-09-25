import java.util.*;
public class RemoveDuplicatesUsingArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		 al.add(10);
		 al.add(20);
		 al.add(30);
		 al.add(20);
		 al.add(40);
		 al.add(50);
		 al.add(60);
		 al.add(50);
		 
		 ArrayList<Integer> unique = new ArrayList<>();
		 
		 for(Integer m : al)
		 {
			if(!unique.contains(m))
			{
				unique.add(m);
			}
		 }
		 
		 System.out.println(unique);
	}
}