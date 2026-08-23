import java.util.*;
public class averageOfMarks {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the marks of 3 Subject:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        double average=(a+b+c)/3.0;
        System.out.println("The average of the three subjects is: " + average);
    }
}