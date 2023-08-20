import java.util.Scanner;
class Mul
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println(" ___Multiplication of two numbers___ \n");
    System.out.println("Enter first number ");
    int m = sc.nextInt();
    System.out.println("Enter second number ");
    int n = sc.nextInt();
    int mul = 0;
    for(int i = 1;i <= m;i++)
    {
        for(int j =1;j <= n;j++)
        {
            mul++;
        }
    }
    System.out.println("Mulplication of "+m+"x"+n+" = "+mul);
  }
}
