public class DuplicateElementsInArray{

	public static void main(String[] args)
	 {
	 
		String a[] = {"JAVA", "C", "C++", "JAVA", "Python", "Ruby", "Python"};
		int n = a.length;
		Boolean isDuplicate = false;
		
		
		
		for(int i=0; i<n; i++)
		 {
		 
			for(int j=i+1; j<n; j++)
			 {
			 
				if(a[i]==a[j])
				 
				 {
				 
					
					System.out.println( "The Duplicate elements  are " + a[i]);
					isDuplicate = true;
				 
				 
				 }
			 
			 
			 
			 
			 }
		 
		 
		 }
		  if(isDuplicate==false)
			{
				System.out.println("There is no duplicate elements in the array");
			}
 
	 
	 }


}