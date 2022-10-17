package BasicNumericPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=1298;
		palindromeNumber(n);
	}
	public static void palindromeNumber(int n)
	{
		int rem,rev=0;
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("It is a palindrome NUmber");
		}else
		{
			System.out.println("It is not a palindroome Number");
		}
	}

}

