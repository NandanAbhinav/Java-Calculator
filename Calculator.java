import java.io.*;
import java.util.*;
class Calculator
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      while(true)
        {
          System.out.println("\t===== Simple Calculator =====");
          System.out.println("");
          System.out.println("1. Addition [+]");
          System.out.println("2. Subtraction [-]");
          System.out.println("3. Multiplication [x]");
          System.out.println("4. Division [/]");
          System.out.println("5. Modulus [%]");
          System.put.println("6. Exit");
          System.out.println("Enter your choice of operation:");
          int ch=sc.nextInt();
          System.out.println("");
         System.out.println("Enter no. 1:");
          double no1=sc.nextDouble();
          System.out.println("Enter no. 2:");
          double no2=sc.nextDouble();
          System.out.println("");
          double result=0.0;
          switch(ch)
            {
              case 1:
                result = no1+no2;
                break;
              case 2:
                result = no1-no2;
                break;
              case 3:
                result = no1*no2;
                break;
              case 4:
                if(no2==0)
                {
                  System.out.println("Cannot devide by 0");
                  continue;
                }
                result = no1/no2;
                break; 
              case 5:
                result = no1%no2;
                break;
              case 6:
                System.out.println("Exiting...");
                return;
              default:
                System.out.println("Invalid choice");
                continue;
            }
          System.out.println("Result = "+result);
          }
        }
    }
  }
