// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter Size of Array");
        Scanner s = new Scanner(System.in); 
        int n = s.nextInt();
        int[] arr = new int [n];
        for (int i=0; i<=n-1; i++){
            arr[i] = s.nextInt(); 
            
        }
                    printArray(arr);

    }
    
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<=n-1; i++){
            System.out.println(arr[i]);
        }
    }
}
