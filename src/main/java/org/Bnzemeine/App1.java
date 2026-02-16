package org.Bnzemeine;

import java.util.Arrays;
import java.util.Map;

public class App1 {

    public int add(int a, int b) {
        return a + b;
    }
//    public int[] subtraction(int a,int b){
//        return

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        //[1,2,3,4,5]
        int arr[] = {1,2,3,4,5};
        if (Arrays.toString(arr).equals("[1, 2, 3, 4, 5]"))
        {
            System.out.println("hi");
        }
//
//        int arr[] = {1,2,3,4,5};
//
//        if(Arrays.toString(arr).equals("[1, 2, 3, 4, 5]")) {
//            System.out.println("hi");
//
//        }
    }
}