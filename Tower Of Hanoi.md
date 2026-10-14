## 01. Tower Of Hanoi

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1)

### Problem Description

**Task:** You are given n disks placed on a starting rod (from), with the smallest disk on top and the largest at the bottom. There are three rods: the starting rod(from), the target rod (to), and an auxiliary rod (aux).You have to calculate the minimum number of moves required to transfer all n disks from the starting rod to the target rod, following these rules: 1. Only one disk can be moved at a time. 2. A disk can only be placed on top of a larger disk or on an empty rod.Return the minimum number of moves needed to complete the task.Examples:Input: n = 2

#### Examples

##### Example 1

- **Output:**
```text
0
```
- **Explanation:** Total 0 steps will be taken.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(2^n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-14 23:33:56
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        if (n == 1) {
            return 1;
        }

        int count = 0;

        count += towerOfHanoi(n - 1, from, aux, to);
        count += 1;
        count += towerOfHanoi(n - 1, aux, to, from);

        return count;
    }
}
```

*Generated on: 14/10/2026, 23:34:23*