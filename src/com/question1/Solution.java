package com.question1;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    // https://leetcode.com/discuss/interview-question/963586/Microsoft-or-OA-or-Codility/785106
    public int solution(String S) {
        // write your code in Java 8
        int result = find(S);
        return result;
    }

    // we have two set, one set for lowercase character, one set for uppercase character
    // when we slide the window, we compare two sets
    // if two sets are equal, same length, same items, then the substring is balanced (every letter has both lowercase and uppercase form)
    // then we find the max length
    public int find(String str) {
        int len = str.length();
        Set<Character> set1, set2;
        int max = -1;

        for (int j = 1; j <= len; j++) {
            for (int i = 0; i < j; i++) {
                set1 = new HashSet<>();
                set2 = new HashSet<>();

                String tempStr = str.substring(i, j);

                for (char ch : tempStr.toCharArray()) {
                    if (Character.isLowerCase(ch)) {
                        set1.add(ch);
                    } else {
                        set2.add(Character.toLowerCase(ch));
                    }
                }

                if (equals(set1, set2)) {
                    max = Math.max(max, tempStr.length());
                }
            }
        }

        return max;
    }

    private boolean equals(Set<Character> set1, Set<Character> set2) {
        if (set1.size() != set2.size()) {
            return false;
        }

        for (Character c : set1) {
            if (!set2.contains(c)) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("azABaabZax");
        System.out.println(result); // 9

        int result2 = solution.solution("TacoCat");
        System.out.println(result2); // -1

        int result3 = solution.solution("AcZCbaBz");
        System.out.println(result3); // 8
    }
}
