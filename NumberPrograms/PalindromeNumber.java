public class PalindromeNumber{


	public static void main(String[] args){
	
	
	int num = 121;
	int rev_num = 0;
	
	int org_num = num;
	
	while(num>0){
	
	
	int temp = num%10;
	rev_num = rev_num *10 + temp;
	num = num /10;
	
	
	
	}
	
	if(org_num == rev_num){
	
		System.out.println("The Given number is a palindrome number");
	
	}
	else{
	
		System.out.println("The Given number is not a palindrome number");
	
	}
	
	
	
	
	
	
	
	
	}












}