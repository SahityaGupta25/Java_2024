import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		

		
				if (n>=0 && n<=10000){
						for (int i=1; i<=10;i++){
							System.out.println(n*i);
						
						}}
		    	else if(n == 0 ){
						for (int i=1; i<=10;i++){
							System.out.println('0');
							
						}
			    }
			    
		    	else{
			    System.out.println("Invalid Output");
			
		}


		

	}
}
