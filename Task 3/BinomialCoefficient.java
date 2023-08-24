import java.util.Scanner;
class BinomialCoefficient
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Binomial Coefficient");
        System.out.print("Enter the n:");
        int n = sc.nextInt();
        System.out.print("Enter the r:");
        int r = sc.nextInt(); 
        BinomialCoefficient ob = new BinomialCoefficient();
        System.out.printf("value of (%d,%d) is %d \n",n,r,ob.bCoeff(n,r));
    }

    int bCoeff(int n,int r)
    {
        if(r>n)
            return 0;
        else if( r==0 || r==n) 
            return 1;
        else
            return  bCoeff(n-1,r-1)+bCoeff(n-1,r);
    }
}