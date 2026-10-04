## 01. Count Derangements

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/dearrangement-of-balls0918/1)

### Problem Description

**Task:** Given a number n, find the total number of Derangements of elements from 1 to n. A Derangement is a permutation of n elements, such that no element appears in its original position, i.e., 1 should not be the first element, 2 should not be second, etc. For example, [5, 3, 2, 1, 4] is a Derangement of first 5 elements.Note: The answer will always fit into a 32-bit integer.Examples:Input: n = 2

#### Examples

##### Example 1

- **Output:**
```text
2
```
- **Explanation:** For the set [1, 2, 3], there are only two possible derangements: [2, 3, 1] and [3, 1, 2].

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-04 15:51:23
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public int derangeCount(int n) {
        // code here
         if(n<=3) return n-1;
         return (n-1)*(derangeCount(n-1)+derangeCount(n-2));
    }
};
```

*Generated on: 04/10/2026, 15:52:02*