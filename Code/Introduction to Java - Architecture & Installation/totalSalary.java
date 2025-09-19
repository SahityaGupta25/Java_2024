import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter your basic salary");
		Scanner s = new Scanner(System.in);
		int basic = s.nextInt();
		System.out.println("Also Enter your grade");
		String grade = s.next().charAt(0);
		double da = (50/100) * salary;
		double hra = (20/100) * salary;
		double pf = (11/100) * salary;
        double allowancea =1700;
        double allowanceb = 1500;
        double allowancec = 1300;
        
        if(grade == 'A' || 'a'){
            double totalSalary = hra +Da + totalSalary + allowancea - pf;
        }
         else if(grade == 'B' || 'b'){
            double totalSalary = hra +Da + totalSalary + allowanceb - pf;
        }
        else{
            double totalSalary = hra +Da + totalSalary + allowancec - pf;
        }
        finalSalary = (int)Math.round(totalSalary);
        System.out.println(finalSalary);
