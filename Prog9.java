import java.util.Scanner;
public class Prog9
{
    public static void main(String[] args) 
    {
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year");
        y = sc.nextInt();
        if((y%4==0 && y%100!=0) || y%400==0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
        //(OR - || AND - && NOT - !)

        
    }
    
}
