import java.util.Scanner;
public class Prog6 
{
    public static void main(String[] args) 
    {
        int age;
        String name, ent_no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = sc.nextLine();
        System.out.print("Enter your entry number : ");
        ent_no = sc.nextLine();
        System.out.print("Enter your age : ");
        age = sc.nextInt();
        System.out.print("My name is "+name+" And my age is "+age+" and my entry number is "+ent_no);
    }
    
}
