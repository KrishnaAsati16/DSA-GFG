## 01. Capacity To Ship Packages Within d Days

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/capacity-to-ship-packages-within-d-days/1)

### Problem Description

**Task:** Given arr[] of weights, find the minimum boat capacity to ship all weights within d days.
The items are loaded in the same order as their appearance.
The total weight should not exceed the computed capacity on any day.

#### Examples

##### Example 1

- **Input:**
```text
arr[] = [1, 2, 1], d = 2
```
- **Output:**
```text
3
```
- **Explanation:** We can ship with boat capacity 3 in 2 days. Day 1- 1, 2 Day 2- 1

##### Example 2

- **Input:**
```text
arr[] = [9, 8, 10], d = 3
```
- **Output:**
```text
10
```
- **Explanation:** We can ship with boat capacity 10 in 3 days. Day 1- 9 Day 2- 8 Day 3- 10

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n * log(sum(arr)))
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-11 00:24:01
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public int leastWeightCapacity(ArrayList<Integer> arr, int d) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int ele : arr) {
            max = Math.max(max, ele);
            sum += ele;
        }

        int lo = max, hi = sum, ans = sum;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (days(mid, arr) <= d) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    private int days(int capacity, ArrayList<Integer> arr) {
        int count = 0;
        int c = capacity;
        for (int ele : arr) {
            if (c >= ele) c -= ele;
            else {
                count++;
                c = capacity - ele;
            }
        }
        count++;
        return count;
    }
}
```

*Generated on: 11/10/2026, 00:24:32*