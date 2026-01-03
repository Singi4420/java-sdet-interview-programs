public class SumOftheDigits{



	public static void main(String[] args){
	
	int num = 73303;
	
	int sum = 0;
	
	
	while(num>0){
	
	int temp = num%10;
	sum = sum + temp;
	num = num/10;
	
	
	
	}
	System.out.println("The sum of the digits of the number is " + sum);
	
	






	}





}