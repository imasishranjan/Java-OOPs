import java.util.Scanner;
public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the frist number:");
            int start = sc.nextInt();
            System.out.println("Enter the second number:");
            int end = sc.nextInt();
            System.out.println("List of Prime numbers are as follows......");

            for(int i=start; i<=end; i++) {
                if(isPrime(i)) {
                    System.out.print(" "+i);
                }
            }

    }
    public static boolean isPrime(int n) {
        if(n<=1) {
            return false;
        } else {
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n%i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}