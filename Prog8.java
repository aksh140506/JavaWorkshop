import java.util.Scanner;
public class Prog8 
{
    public static void main(String[] args) {
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        y = sc.nextInt();
        if(y%4==0)
        {
            if(y%100!=0)
            {
                System.out.println("The given year is a leap year");
            }
            else if(y%400==0)
            {
                System.out.println("Given year is a leap year");
            }
            else
            {
                System.out.println("Given year is not a leap year");
            }
        }
        else
        {
            System.out.println("Given year is not a leap year");
        }
        sc.close();
    }
    
}
