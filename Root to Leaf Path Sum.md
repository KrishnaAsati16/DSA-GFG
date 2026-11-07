## 01. Root to Leaf Path Sum

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/root-to-leaf-path-sum/1)

### Problem Description

**Task:** Given root of a binary tree and an integer target, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum. Return false if no such path can be found. Examples :Input: root = [1, 2, 3], target = 4

#### Examples

##### Example 1

- **Output:**
```text
true
```
- **Explanation:** The root to leaf path sums are 1 + 2 + 4 = 7, 1 + 2 + 1 = 4 and 1 + 3 = 4. Since, a path with sum 4 exists (1 - > 3 and 1 - > 2 - > 1), the answer is true.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(h)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-11-07 23:20:00
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    boolean hasPathSum(Node root, int target) {

        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return target == root.data;
        }

        target -= root.data;

        return hasPathSum(root.left, target) ||
               hasPathSum(root.right, target);
    }
}
```

*Generated on: 07/11/2026, 23:20:30*