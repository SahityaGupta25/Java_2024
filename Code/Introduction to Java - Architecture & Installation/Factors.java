import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        String result = " ";
		int n = s.nextInt();
        for(int i= 2; i<=n-1;i++){
            if(n %i ==0){
                    // int convert = Integer.toString(i);

                    result += i + " ";
            }
            
        }
        System.out.println(result);
    }
}
