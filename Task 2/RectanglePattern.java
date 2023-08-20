import java.util.Scanner;
class RectanglePattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the breadth of Rectangle(row) : ");
        int n = sc.nextInt();
        System.out.print("Enter the length of Rectangle(column) :");
        int m = sc.nextInt();
        for(int i =0; i <n;i++)
        {
            for(int j=0 ;j<m;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}