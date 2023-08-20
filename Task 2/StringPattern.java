import java.util.Scanner;
class StringPattern
  {
    public static void main(String args[])
    {
      int count =0;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of rows : ");
      int rows = sc.nextInt();
      for(int i =1;i <2*rows;i=i+2)
        {
          for(int j =0;j<i;j++)
            {
              System.out.printf("%c ",'A'+count);
              if(j < i/2)
                  count++;
              else
                  count--;    
            }
          count =0;  
          System.out.println();
        }
    }
  }