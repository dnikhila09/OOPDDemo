public class Ptrn {

 

    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<(i*2);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=5;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=9;k>(i*2);k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

 


    }

 

}