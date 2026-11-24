import java.util.Scanner;
public class matrix{
     public static void main(String[]args){
        int order = Integer.parseInt(args[0]);
        int a[][] = new int[order][order];
        int b[][] = new int[order][order];
        int c[][] = new int[order][order];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements for matrix a");
        for(int i=0;i<order;i++)
        {
            for(int j=0;j<order;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements for matrix b");
        for(int i=0;i<order;i++)
        {
            for(int j=0;j<order;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }System.out.println("The elements for matrix a");
        for(int i=0;i<order;i++)
        {
            for(int j=0;j<order;j++)
            {
                System.out.println(a[i][j]+"");
            }
            System.out.println();
        }
        System.out.println("The elements for matrix b");
        for(int i=0;i<order;i++)
        {
            for(int j=0;j<order;j++)
            {
                System.out.println(b[i][j]+"");
            }
            System.out.println();
        }
        System.out.println("The sum of two matrices is");
        for(int i=0;i<order;i++)
        {
            for(int j=0;j<order;j++)
            {
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j]+"");
            }
            System.out.println();
        }
        sc.close();
    }
}