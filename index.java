import java.util.Scanner;
class variabledemo
{
    public static void main(String str[])
     {
         System.out.println("Enter the first number");
         Scanner scan=new Scanner(System.in);
         float n1=scan.nextFloat();
         
         
         System.out.println("Enter the second number");
         float n2=scan.nextFloat();
         
         float sum=n1+n2;
         System.out.println("The sum of two numbers is"+sum);
     }
}
