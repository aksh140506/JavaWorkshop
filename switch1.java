import java.util.Scanner;
public class switch1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value ");
        int rank=in.nextInt();
        
        switch(rank){
            case 1:
            System.out.println("tejash the boss");
            break;
            case 2:
            System.out.println("mayank the manager");
            break;
            case 3:
            System.out.println("employee id");
            String emply_id=in.next();
            switch(emply_id){
                case "24BCS041":
                System.out.println("maneesh attri");
                break;
                default :
                System.out.println("you are boss not employee");
            }
            break;
            default:
            System.out.println("are greeb pdh leta ");
        }
        in.close();
    }
    
}
