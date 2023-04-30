import java.util.Scanner;
import java.lang.Math;
class QuadEqu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,d,p,q,x1,x2;
        System.out.println("Enter the value of a : ");
        a = sc.nextDouble();
        System.out.println("Enter the value of b : ");
        b = sc.nextDouble();
        System.out.println("Enter the value of c : ");
        c = sc.nextDouble();
        d = (b * b) - (4 * a * c);
        p = -b/(2*a);
        q = Math.sqrt(Math.abs(d))/(2*a);
        if(a == 0) {
            System.out.println("Root = "+(-c/b));
        } else {
            if (d>0) {
                x1 = p+q;
                x2 = p-q;
                System.out.println("Roots are real and disting ");
                System.out.println("Frist Root = " +x1);
                System.out.println("Second Root = "+x2);
            }
            else if(d == 0) {
                   System.out.println("Roots are Complex ");
                   System.out.println("1st Root = "+p);
                   System.out.println("2nd Root = "+p);
            }
            else {
                   System.out.println("Roots are Complex");
                   System.out.println("1st Root = "+p+"+i"+q);
                   System.out.println("2nd Root = "+p+"-i"+q);
                }
            }
        }
    }