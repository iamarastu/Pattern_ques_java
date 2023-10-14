public class diamond {
    public static void main(String args[])
    {
        int i=0,j=0,n=4;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=(n-i);j++)
            System.out.print(" ");
            for(j=1;j<=i;j++)
            System.out.print("*");
             for(j=1;j<i;j++)
            System.out.print("*");
            System.out.println();
        }
        //second half
         for(i=n;i>=1;i--)
        {
            for(j=1;j<=(n-i);j++)
            System.out.print(" ");
            for(j=1;j<=i;j++)
            System.out.print("*");
             for(j=1;j<i;j++)
            System.out.print("*");
            System.out.println();
        }

    }
}
