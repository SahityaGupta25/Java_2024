// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/*
* 
** 
*** 
**** 
***** 
*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of N");
        int n = s.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
}
