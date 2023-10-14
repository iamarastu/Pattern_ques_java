public class numberpy {
    public static void main(String args[])
    {
        int i=0,j=0,n=5;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=(n-i);j++)
            System.out.print(" ");
            for(j=1;j<=i;j++)
            System.out.print(i+" ");
            System.out.println();
        }
    }
}
