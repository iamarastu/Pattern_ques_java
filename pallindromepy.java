class pallindromepy
{
    public static void main()
    {
        int i=0,j=0,n=5;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=(n-i);j++)
            System.out.print(" ");
            for(j=i;j>=1;j--)
            System.out.print(j);
           for(j=2;j<=i;j++)
            System.out.print(j);
            System.out.println();
        }
    }
}