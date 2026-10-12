## 01. Smallest Divisor

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/smallest-divisor/1)

### Problem Description

**Task:** Given an integer array arr[] and an integer k (where k ≥ arr.length), find the smallest positive integer divisor such that the sum of the ceiling values of each element in arr[] divided by this divisor is less than or equal to k.Examples:Input: arr[] = [1, 2, 5, 9], k = 6

#### Examples

##### Example 1

- **Output:**
```text
1Explanation: 1 is the smallest divisor having sum of quotients (1 + 1 + 1 + 1 = 4) less than or equal to 4.
```
- **Explanation:** 5 is the smallest divisor having sum of quotients (1 + 1 + 1 + 2 = 5) less than or equal to 6.Input: arr[] = [1, 1, 1, 1], k = 4

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n * log(max(arr[i])))
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-12 16:08:06
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public int smallestDivisor(int[] arr, int k) {

        // Step 1: array ka maximum nikalo
        int maxVal = 0;
        for (int num : arr) {
            if (num > maxVal) maxVal = num;
        }

        // Step 2: divisor ki range set karo
        int left = 1;          // sabse chhota divisor
        int right = maxVal;    // sabse bada divisor (ye hamesha valid hai) 9 tk he rakh sakte h 
        int answer = maxVal;

        // Step 3: binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (sumWithDivisor(arr, mid) <= k) {
                // mid valid hai, ise save karo aur chhota try karo
                answer = mid;
                right = mid - 1;
            } else {
                // mid se sum bahut bada, divisor badhao
                left = mid + 1;
            }
        }

        return answer;
    }

    // Har element ko divisor se divide karke ceil ka sum return karta hai
    private long sumWithDivisor(int[] arr, int divisor) {
        long total = 0;
        for (int num : arr) {
            total += (num + divisor - 1) / divisor;   // ceil(num / divisor)
        }
        return total;
    }
}
```

*Generated on: 12/10/2026, 16:10:13*