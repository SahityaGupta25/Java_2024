// How to take input in Java
import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int ac = sc.nextInt();
        System.out.println("Enter second number");
        int bc = sc.nextInt();
        int cc = ac+bc;
        System.out.println(cc);
        
        
    }
    
}
