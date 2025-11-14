import java.util.Scanner;
public class prog5 
{
    public static void main(String[] args) {
        int a;
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        String c;
        c = sc.nextLine();
        int b = a*a;
        System.out.println("The given number is "+a+" and the square of the number is " + b);
    }
    
}
