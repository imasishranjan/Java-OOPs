import java.util.Scanner;
class LeapYear 
    {
  	public static void main(String args[])
        {
	  Scanner x = new Scanner(System.in);
	  int r1,r2,r3;
	  int year = x.nextInt();
	  r1 = year % 400;
	  r2 = year % 100;
	  r3 = year % 4;
	  if((r1 == 0) || (r2 != 0 & r3 == 0)) 
	  	System.out.println(year+"is leap year");
	  else
		System.out.println(year+"is not leap year");
	}
   }