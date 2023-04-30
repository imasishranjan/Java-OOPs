import java.util.Scanner;
class Largest1 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        int i,n,big;
        System.out.println("Enter the number of elements : ");
        n = sc.nextInt();
        for(i=0;i<n;i++) {
            System.out.println("Enter a number : ");
            a[i] = sc.nextInt();
        }
        big = a[0];
        for(i=1;i<n;i++) {
            if(a[i] > big) {
                big = a[i];
            }
        }
        System.out.println("Largest = "+big);
    }
}