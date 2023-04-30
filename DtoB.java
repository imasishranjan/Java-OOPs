import java.util.Scanner;
import java.lang.Math;
class DtoB
{
	public static void main(String args[])
	{
		int n,r,i=0,k;
		double s=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Decimal Number : ");
		n = sc.nextInt();
		k = n;
		while(n!=0)
		{
			r = n%2;
			n = n/2;
			s = s+r*Math.pow(10,i);
			i++;
		}
	System.out.println("Binary Equvalent of Decimal Number is : "+s);
	}
}