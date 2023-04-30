import java.util.Scanner;
class MatAdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int[][] a = new int[5][5];
        int[][] b = new int[5][5];
        int[][] c = new int[5][5];
        int r1,c1,r2,c2,i,j;
        System.out.println("Enter the number of the row of the 1st matrix:");
        r1 = sc.nextInt();
        System.out.println("Enter the number of the column of the 1st matrix:");
        c1 = sc.nextInt();
        System.out.println("Enter the number of the row of the 2nd matrix:");
        r2 = sc.nextInt();
        System.out.println("Enter the number of the column of the 2nd matrix:");
        c2 = sc.nextInt();
            if(r1==r2 && c1==c2) {
            System.out.println("Enter the number of the elements of 1st matrix:");
            for(i=0;i<r1;i++)
            for(j=0;j<c1;j++)
            a[i][j]=sc.nextInt();
            System.out.println("Enter the number of the elements of 2nd matrix:");
            for(i=0;i<r2;i++)
            for(j=0;j<c2;j++)
            b[i][j]=sc.nextInt();
            for(i=0;i<r1;i++)
            for(j=0;j<c1;j++)
            c[i][j] = a[i][j]+b[i][j];
            System.out.println("Addition is :");
            for(i=0;i<r1;i++) {
                for(j=0;j<c1;j++) {
                    System.out.print(c[i][j]+"\t");
                }
                 System.out.println();
           
            }
        } else 
            System.out.println("Addition not possible");
        
        } 
        
    }