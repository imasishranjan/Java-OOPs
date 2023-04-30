import java.util.Scanner;
public class MatMultiplication
 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a [][]= new int [5][5];
        int b [][]= new int [5][5];
        int c [][]= new int [5][5];

        int r1,r2,c1,c2,i,j,k;

        System.out.println("Enter row and column of the 1st matrix :");
        r1=sc.nextInt();
        c1=sc.nextInt();

        System.out.println("Row and column of the 2nd matrix :");
        r2=sc.nextInt();
        c2=sc.nextInt();

        if (c1==r2)
        {
            System.out.println("Enter element of the 1st matrix :\n");
            for(i=0;i<r1;i++)
            for(j=0;j<c1;j++)

            a[i][j]=sc.nextInt();
            System.out.println("Enter elements of the 2nd matrix :\n");
            for(i=0;i<r2;i++)
            for(j=0;j<c2;j++)

            b[i][j]=sc.nextInt();
            for(i=0;i<r1;i++)
            for(j=0;j<c2;j++)
            {
                c[i][j]=0;
                for(k=0;k<c1;k++)
                c[i][j]=c[i][j]+a[i][k]*b[k][j];
            }
            System.out.println("Matrix Multiplication is : \n");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                System.out.print("\t"+c[i][j]);
                System.out.println("\n");

            }
        }
        else 
        System.out.println("Matrix Multiplication is not possible");
    }
    
}
