import java.util.Scanner;

public class Factorial
{
    public static int FactorialCa(int n)
    {
        int f = 1;
        for(int i = 1; i< n; i++)
        {
            f = f * i;
        }
        return f;
    }
    public static void main (String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter The Number : ");
     int n = sc.nextInt();
     int result = FactorialCa(n);
     System.out.println("Final Result : "+ result);
    }
}