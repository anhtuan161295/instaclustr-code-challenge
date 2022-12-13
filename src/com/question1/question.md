A string is called balanced when every letter occurring in the string, appears both in upper and lowercase.
For example, the string "CATattac" is balanced ('a','c' and 't' occur in both cases), but "Madam" is not ('d' and 'a'
appear only in lowercase).
Note that the number of occurences does not matter.

Write a function:  
class Solution { public int solution(String S); }

that, given a string S of length N, returns the length of the longest balanced fragment of S. If S does not contain any
balanced fragments, the function should return -1.

Examples:

1. Given S = "azABaabZax", the function should return 9. The longest balanced fragment of S is "azABaabZa".
2. Given S = "TacoCat", the function should return -1. There is no balanced fragment.
3. Given S = "AcZCbaBz", the function should return 8. The longest balanced fragment is the whole string.
4. Given S = "abcdefghijklmnopqrstuvwxyz", the function should return -1.

Assume that:

- N is an integer within the range [1..200];
- string S consists only of letters ('a'-'z' and/or 'A'-'Z')

In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.


