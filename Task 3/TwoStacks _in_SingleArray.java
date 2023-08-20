import java.util.Scanner;
class Stack
{
  int top1 =-1;
  int top2,size;
  int[] arr;
  Stack(int s)
  {
    top2 = size =s;
    arr = new int[s];
  } 
  void push1(int data)
  {
    if(top1 <top2-1)
    {
      top1++;
      arr[top1] =data;
    }
    else
    {
      System.out.println("Array is Full");
    }
  }
  void push2(int data)
  {
    if(top1 <top2-1)
    {
      top2--;
      arr[top2] =data;
    }
    else
    {
      System.out.println("Array is Full");
    }
  }
  void pop1()
  {
    if(top1 >=0)
    {
      int ele =arr[top1];
      top1--;
      System.out.println(ele+" is being popped from stack1");
    }
    else
    {
      System.out.println("Stack1 is Empty");
    }
  }
  void pop2()
  {
    if(top2 <size)
    {
      int ele = arr[top2];
      top2++;
      System.out.println(ele+" is being popped from stack2");
    }
    else
    {
      System.out.println("Stack2 is Empty");
    }
  }
  void displayOfStack1
  {
    if(top1 ==-1)
    {
      System.out.println("Stack1 is empty");
    }
    else
    {
      for(int i =top1;i >=0;i--)
        {
          System.out.print(array[i]);
        }
      System.out.println();
    }
  }
  void displayOfStack2
  {
    if(top2 ==size)
    {
      System.out.println("Stack2 is empty");
    }
    else
    {
      for(int i =top2;i<size;i++)
        {
           System.out.print(array[i]);
        }
      System.out.println();
    }
  }
  public static void main(String args[])
{
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the array size : ");
    int size = sc.nextInt();
    Stack ob = new Stack(size);
    while
      {
        System.out.println(" ***  menu *** \n");
        System.out.println("1.push into stack1 \n2.push into stack2 \n3.pop from stack1 \n4.pop from stack2 \n5.display stack1 \n6.display stack2 \n7.exit ");
        int ch = sc.nextInt();
        switch(ch)
          {
            case 1:
              System.out.print("Enter a number");
              a = sc.nextInt();
              ob.push1(a);
              break;
            case 2:
              System.out.print("Enter a number");
              a = sc.nextInt();
              ob.push2(a);
              break;
            case 3:
              ob.pop1();
              break; 
            case 4:
              ob.pop2();
              break;
            case 5:
              ob.displayOfStack1();
              break;
            case 6:
              ob.displayOfStack2();
              break;
            case 7:
              System.exit(1);
              break;
            default:
              System.out.println("Invalid choice !");
              break;
          }
    }
}
}

              
    
      
