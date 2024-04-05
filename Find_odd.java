import java.io.*;
public class Find_odd {
    static int findOdd(int arr[],int n){
        for (int i=0;i<n;i++){     /* its used for taking the number */
            int count =0;
            for (int j=0;j<n;j++){    /* its used for count the number how many times it will take like ex - 7 =4 times is even ,3=1 times is odd*/
                if (arr[i]==arr[j])
                    count++;
                }
                if (count%2!=0)
                    return arr[i];
            }
            return -1;
        }
        public static void main (String args[]){
            int arr[]= {7,3,7,7,7};
            int n = 3;
            System.out.println(findOdd(arr,n));
        }
    }

