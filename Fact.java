import java.util.Scanner;
class Fact
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i,p = 1;
		System.out.println("Enter the value of n: ");
		n = sc.nextInt();
		for(i = 1; i <=n; i++)
			p = p * i;
		System.out.println("Factorial = "+p);
	}
}