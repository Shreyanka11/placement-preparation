import java.util.*;
public class LinearSearch
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int size = sc.nextInt();
      int [] arr = new int[size];
      System.out.println("Enter the elements of the array: ");
      for(int i=0;i<size;i++)
      {
          arr[i] = sc.nextInt();
      }
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        boolean found = false;
        int index = -1;
        for(int i=0;i<size;i++)
        {
        if(arr[i]==key)
        {
           found = true;
           index = i;
           break;
         }
        }
         if(found)
         {
          System.out.println("Element found at index: " + index);
        }
        else 
        {
            System.out.println("Element not found");
        }
    }
}
