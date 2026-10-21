## 01. Container With Most Water

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/container-with-most-water0535/1)

### Problem Description

**Task:** Given an array arr[] of non-negative integers, where each element arr[i] represents the height of the vertical lines, find the maximum amount of water that can be contained between any two lines, together with the x-axis.Note: In the case of a single vertical line it will not be able to hold water.Examples:Input: arr[] = [1, 5, 4, 3]

#### Examples

##### Example 1

- **Output:**
```text
12
```
- **Explanation:** 5 and 3 are 4 distance apart. So the size of the base is 4. Height of container = min(5, 3) = 3. So, total area to hold water = 4 * 3 = 12.Input: arr[] = [2, 1, 8, 6, 4, 6, 5, 5]Output: 25 Explanation: 8 and 5 are 5 distance apart. So the size of the base is 5. Height of container = min(8, 5) = 5. So, the total area to hold water = 5 * 5 = 25.Constraints:1 ≤ arr.size() ≤ 10⁵⁰ ≤ arr[i] ≤ 10⁴

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-21 22:40:47
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public int maxWater(int arr[]) {
        // Code Here
     int left = 0;
     int right = arr.length - 1;
     int maxWater = 0;
         while (left < right) {
             int h = Math.min(arr[left], arr[right]);
             int width = right - left;

             int water = h * width;

             maxWater = Math.max(maxWater, water);

             if (arr[left] < arr[right]) {
                 left++;
             } else {
                 right--;
             }
         }

         return maxWater;
   
    }
}
```

*Generated on: 21/10/2026, 22:41:20*