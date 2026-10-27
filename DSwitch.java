//implementing switch case statements taking user input for making calculator
import java.util.Scanner;
public class DSwitch{
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the numbers");
     int a = sc.nextInt();
     int b = sc.nextInt();
     
     System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder");
     int choice = sc.nextInt();
     switch(choice) {
        case 1: System.out.println(a+b);
        break;
        case 2: System.out.println(a-b);
        break;
        case 3: System.out.println(a*b);
        break;
        case 4: if(b==0){
            System.out.println("invalid input");
        }
        else
        System.out.println(a/b);
    break;
    case 5: if(b==0){
        System.out.println("Invalid input");
    }
    else{
        System.out.println(a%b);
    }
    break;
    default:
        System.out.println("oops");
    
     }
    }
}