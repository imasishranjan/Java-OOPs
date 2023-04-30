import java.util.Scanner;
public class Sum {
    public static int add(int x,int y) {
        return (x+y);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = add(n1,n2);
        System.out.println("Addition of two numbers is: "+sum);
    }
}