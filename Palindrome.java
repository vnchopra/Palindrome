
public class Palindrome 
{
	
	private boolean checkPalindrome(String s)
	{
		int n = s.length();
		
		for (int i = 0; i < (n/2); i++)
		{
			if(s.charAt(i) != s.charAt(n-i-1))
			{
				System.out.println("FALSE");
				return false;
			}
		}
		System.out.println("TRUE");
		return true;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String thestring = "dog";
		thestring.toLowerCase();
		
		Palindrome p = new Palindrome();
		p.checkPalindrome(thestring);
		
	}

}
