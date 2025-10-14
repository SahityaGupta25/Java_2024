/*
Problem statement
You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.

Note:
Given array/list can contain duplicate elements. 
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= X <= 10^9
Time Limit: 1 sec
Sample Input 1:
1
9
1 3 6 2 5 4 3 2 4
7
Sample Output 1:
7
Sample Input 2:
2
9
1 3 6 2 5 4 3 2 4
12
6
2 8 10 5 -2 5
10
Sample Output 2:
0
2


 Explanation for Input 2:
Since there doesn't exist any pair with sum equal to 12 for the first query, we print 0.

For the second query, we have 2 pairs in total that sum up to 10. They are, (2, 8) and (5, 5).
*/


import java.util.Scanner;
public class Solution {  

    public static int pairSum(int arr[], int x) {
    	//Your code goes here
        int count=0;
        for(int i=0; i<arr.length-1; i++){
             for(int j=i+1; j<arr.length;j++){
                 if(arr[i]+arr[j]==x){
                     count++;
                 }
        }
    }
    if(count>=1){
        return count;
    }
    else{
        return 0;
    }
}
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }
            int x = s.nextInt();

            System.out.println(pairSum(arr,x));
        }
    }



}
