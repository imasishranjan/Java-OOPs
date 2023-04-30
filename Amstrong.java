import java.util.Scanner;
import java.lang.Math;
public class Amstrong {
    static boolean isAmstrong(int n) {
        int temp, lastdigits, sum = 0;
        temp = n;
        while (n>0){
            lastdigits = n%10;
            sum+=(lastdigits*lastdigits*lastdigits);
            n = n/10;
        }
        if(temp == sum){
           return true;
        } else {
           return false;
        }
        }
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check Armstrong.....");
        int n = sc.nextInt();
        if(isAmstrong(n)){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not Armstrong");
        }
    }
    }
    