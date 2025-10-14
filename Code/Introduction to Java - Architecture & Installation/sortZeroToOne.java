/*
Problem statement
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.

Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
7
0 1 1 0 1 0 1
Sample Output 1:
0 0 0 1 1 1 1
Sample Input 2:
2
8
1 0 1 1 0 1 0 1
5
0 1 0 1 0
Sample Output 2:
0 0 0 1 1 1 1 1
0 0 0 1 1 
                arr[i]=arr[j];
                arr[j]=temp;

              }
              else if(arr[i]==0){
                  break;
              }
               
    }
        }




*/

import java.util.Scanner;
public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	   int temp=0;

        for(int i=0; i<arr.length; i++){
             for(int j=i+1; j<arr.length;j++){
              if(arr[i]==1){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

              }
              else if(arr[i]==0){
                  break;
              }
               
    }
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

            sortZeroesAndOne(arr);
        }
    }

}


