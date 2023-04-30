import java.util.Scanner;
class Transpose {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int row,col,i,j;
        System.out.println("Enter number of rows : ");
        row = sc.nextInt();
        System.out.println("Enter number of col : ");
        col = sc.nextInt();
        int [][] a = new int [row][col];
        System.out.println("Enter the elements of the matrix :: ");
        for(i=0;i<row;i++) {
            for(j=0;j<col;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose Matrix is :: ");
        for(j=0;j<col;j++) {
            for(i=0;i<row;i++) {
                System.out.print((a[i][j])+"  ");
                
            }
            System.out.println();
        }
    }
}