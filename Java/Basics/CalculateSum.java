import java.util.*;
public class CalculateSum
{
    public static void main(String arge[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        int sum=calculateSum(a, b);
        System.out.println("The sum is: " + sum);
    }
    public static int calculateSum(int a, int b)
    { 
        return a+b;
    }
}
