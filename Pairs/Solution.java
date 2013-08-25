import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n;
        int k;

        n = in.nextInt();
        k = in.nextInt();

        int nums[] = new int[n]; 
        int numsComparer[] = new int[n]; 
        int kCount=0;   
        
        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.arraycopy( nums, 0, numsComparer, 0, nums.length );
        for(int numberToCompareToEach : nums){
            for(int compareTo : numsComparer){
                if (compareTo - numberToCompareToEach == k ){
                    kCount ++;
                }
            }
        }
        System.out.println(kCount);
    }
}