import java.util.Scanner;
public class Prog7 
{
    public static void main(String[] args) 
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        a = sc.nextInt();
        if(a>0)
        {
            System.out.println("The number is positive");
        }
        else if(a<0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("The number is neither positive nor negative");
        }
    }
    
}
