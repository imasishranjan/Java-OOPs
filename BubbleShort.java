import java.util.Scanner;
class BubbleShort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int [10];
		int n,i,j,t;
		System.out.println("Enter numbers of element: ");
		n = sc.nextInt();
		System.out.println("Enter array elements");
		for(i=0;i<n;i++)
		a[i] = sc.nextInt();
		for(i=1;i<=n-1;i++)
		for(j=0;j<=n-i-1;j++)
		if(a[j]>a[j+1])
			{
				t = a[j];
				a[j] = a[j+1];
				a[j+1] = t;
			}
		System.out.println("The shorted arry elements......");
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
}