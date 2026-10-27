// Implementing Type Casting and taking user input and checking whether the given input is integer or not
import java.util.Scanner;
public class ETypeCasting{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    double a = sc.nextDouble();
    int x = (int)a;
    if(a-x>0){
        System.out.println("The given number is not an integer");
    }
    else{
        System.out.println("The given number is an integer");
    }
    }
}