## 01. Add Binary Strings

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/add-binary-strings3805/1)

### Problem Description

**Task:** Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.Note: The input strings may contain leading zeros but the output string should not have any leading zeros.

#### Examples

##### Example 1

- **Input:**
```text
s1 = "1101", s2 = "111"
```
- **Output:**
```text
10100 1101 + 111 10100
```

##### Example 2

- **Input:**
```text
s1 = "00100", s2 = "010"
```
- **Output:**
```text
110 100 + 10 110
```

#### Constraints

- **1.** `1 ≤s1.size(), s2.size()≤ 10⁶`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-20 22:36:07
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public String addBinary(String s1, String s2) {
        StringBuilder ans = new StringBuilder();

        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += s1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += s2.charAt(j) - '0';
                j--;
            }

            ans.append(sum % 2);
            carry = sum / 2;
        }

        // Reverse the answer
        ans.reverse();

        // Remove leading zeros
        int k = 0;
        while (k < ans.length() - 1 && ans.charAt(k) == '0') {
            k++;
        }

        return ans.substring(k).toString();
    }
}
```

*Generated on: 20/10/2026, 22:36:43*