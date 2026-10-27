import java.util.Scanner;
//implementing if and else taking user input
public class CIfElse {
    public static void main(String args[]) {
        // Input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>18) {
         System.out.println("You are elligible");   
        }
        else{
            int b = (18-a);
         System.out.println("You are not elligible");
         System.out.print("wait for ");
          System.out.print(b);
          System.out.print(" years");
        }
    }
}
