import java.util.Scanner;
public class Prog14 
{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        int reverse = 0;
        while(n>0)
        {
            int z = n%10;
            reverse = reverse*10 + z;
            n = n/10;

        }
        System.out.println(reverse);
        sc.close();
    }
    
}
