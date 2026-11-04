## 01. Palindrome Number

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/palindrome0746/1)

### Problem Description

**Task:** You are given an integer n. Your task is to find if it is a palindrome. Examples:Input: n = 555

#### Examples

##### Example 1

- **Output:**
```text
trueExplanation: if number is palindrome, mainly ignore sign.
```

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(d), d is number of digits in nAuxiliary Space: O(1)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-11-04 22:26:39
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public boolean isPalindrome(int n) {

        int reverse = 0;
        int xcopy = n;

        while (n != 0) {
            reverse = (reverse * 10) + (n % 10);
            n = n / 10;
        }

        return reverse == xcopy;
    }
}
```

*Generated on: 04/11/2026, 22:27:11*