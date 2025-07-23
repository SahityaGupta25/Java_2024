// HOw to calclate percentage in Java
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter marks of Subject 1");
        int a = sc.nextInt();
        System.out.println("Enter marks of Subject 2");
        int b = sc.nextInt();
        System.out.println("Enter marks of Subject 3");
        int c = sc.nextInt();
        System.out.println("Enter marks of Subject 4");
        int d = sc.nextInt();
        System.out.println("Enter marks of Subject 5");
        int e = sc.nextInt();
        System.out.println("Enter marks of Subject 6");
        int f = sc.nextInt();
        int percentage = (a + b + c + d + e + f *100) / 6;
        System.out.println(percentage);


            


        
     
        
    
    }
    
}
