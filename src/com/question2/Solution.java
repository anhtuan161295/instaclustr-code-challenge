package com.question2;

public class Solution {
    // https://leetcode.com/discuss/interview-question/1726332/Microsoft-Online-Assessment-Questions/1241226
    public int solution(int[] blocks) {
        // write your code in Java SE 8
        int ans = 0;
        for (int i = 0; i < blocks.length; i++) {
            int leftMax = i;
            int rightMax = i;
            //go to left
            while (leftMax - 1 >= 0 && blocks[leftMax] <= blocks[leftMax - 1]) {
                leftMax--;
            }
            while (rightMax + 1 < blocks.length && blocks[rightMax] <= blocks[rightMax + 1]) {
                rightMax++;
            }
            ans = Math.max(ans, rightMax - leftMax + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{2, 6, 8, 5});
        System.out.println(result); // 3
    }
}
