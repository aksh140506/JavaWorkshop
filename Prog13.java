import java.util.Scanner;
public class Prog13 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        int sum = 0;
        while(n>0)
        {
            int z = n%10;
            sum = sum + z;
            n = n/10;
        }
        System.out.println(sum);
        sc.close();

        
    }
    
}
