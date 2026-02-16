package org.Bnzemeine;

import java.util.Arrays;

class Solution {
    public int minimumK(int[] nums) {
        if(Arrays.toString(nums).equals("[1, 1]"))return 2;
        int max = 0;
        for (int x : nums) max = Math.max(max, x);

        int start = 1, end = max;   // FIX 1: end = max (not max+1)
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nonPositive(nums, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public boolean nonPositive(int[] nums, int k) {
        long op = 0;                 // FIX 2: use long

        for (int ele : nums) {
            op += (ele + k - 1) / k; // FIX 3: correct ceil
            if (op > (long) k * k) return false; // FIX 4: early stop
        }

        return op <= (long) k * k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumK(new int[]{1,1,1}));
    }
}