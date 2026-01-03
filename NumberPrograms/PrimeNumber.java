public class PrimeNumber{

	public static void main(String[] args){
	
		int num = 34;
		Boolean isPrime = true;
		
		
		if(num<=1){
		
			isPrime = false;
		
		}
		else{
		
		
			for(int i=2; i<=Math.sqrt(num); i++){
			
			
			if(num%2==0){
			
			isPrime = false;
			
			
			
			
			
			}
			
			
			
			
			
			
			
			}
		
		
		
		
		}
		
		if(isPrime){
		
			System.out.println("The Given number " + num + " is a prime number");
		}
		else{
			System.out.println("The Given number " + num + " is not a prime number");	
		
		}
	
	
	
	
	
	
	
	
	}












}