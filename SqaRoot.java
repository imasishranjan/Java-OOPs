import java.util.Scanner;
import java.lang.Math;
class SqaRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float x,y;
		System.out.println("Enter n: ");
		x = sc.nextFloat();
		y = (float)Math.sqrt(x);
		System.out.println("Squre Root = "+y);
	}
}