import java.util.Scanner;
class BinaryConversion
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("*** Binary Conversion ***");
    System.out.print("Emter a Decimal Number:");
    int num = sc.nextInt();
    int temp = num;
    String bin ="";
    int i =0;
    while(temp!=0)
    {
      int r =temp%2;
      bin = r + bin;
      temp =temp/2;
    }
    System.out.print("Binary number of "+num+" is "+bin);

  }
}
