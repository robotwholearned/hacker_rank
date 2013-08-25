import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        Set<Integer> nums = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }
        findPairs(nums, k);
    }
    public static void findPairs(Set<Integer> nums, int k){
        int kCount=0;

        for(Integer i : nums){
            kCount += nums.contains(i+k) ? 1:0;
        }
        System.out.println(kCount);
    }
}