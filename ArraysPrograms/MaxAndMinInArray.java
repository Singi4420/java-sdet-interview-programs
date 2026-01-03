public class MaxAndMinInArray{

	public static void main(String[] args){
	
	int [] arr = {10,70,40,80,20};
	
	int max = arr[0];
	int min = arr[0];
	
	for(int m:arr)
	{
	
		if(m>max)
		{
			max = m;
		
		}
		
		if(m<min)
		{
			min = m;
		}
		
	
	}
	
		System.out.println("The maximum value in array is " + max);
		System.out.println("The minimum value in array is " + min);
	
	
	
	
	
	
	
	
	}













}