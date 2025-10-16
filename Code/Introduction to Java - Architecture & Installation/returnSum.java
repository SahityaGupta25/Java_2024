/*
Problem statement
Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5

Time Limit: 1sec
Sample Input 1:
1
3
9 8 9
Sample Output 1:
26
Sample Input 2:
2
5
1 2 3 4 5 
3
10 20 30 
Sample Output 2:
15
60




*/


import java.util.Scanner;
public class Solution {
	
	public static int sum(int[] arr) {

	
		
		int sumA=0;
		int N = arr.length;
		for(int i=0; i<=N-1; i++){
			sumA += arr[i];
		}
		return sumA;
		
	}

	
	
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int test =0; test<t ; test++ ){
			int N = s.nextInt();
			int[] arr = new int[N];

			for (int i=0; i<=N-1; i++){
				arr[i]=s.nextInt();	
			}
			System.out.println(sum(arr));

	}


	}
	}



