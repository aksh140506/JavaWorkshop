import java.util.Scanner;

public class Program15 
{
    public static void main(String[] args) {
        int sum = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i = 1;
        while(i<=n)
        {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
