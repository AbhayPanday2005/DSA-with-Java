import java.util.Scanner;

public class Check_numberis_Primeornot 
{
    public static boolean isPrime(int n)
    {
        boolean isPrime = true;
        for(int i = 2; i<=n;i++)
        {
            if (n%i ==0) 
            {
                isPrime = false;
            }
            return isPrime;
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Number : ");
        int n = sc.nextInt();

        if (isPrime(n)) 
        {
           System.out.println(n+" : is a Prime Number : "); 
        }
        else
        {
            System.out.println(n + " : is a Not - Prime Number ");
        }
    }
}
