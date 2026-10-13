## 01. Aggressive Cows

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/aggressive-cows/1)

### Problem Description

**Task:** Given an integer array arr[], which denotes the positions of stalls. All the positions are distinct. There are k aggressive cows.Assign the cows to the stalls such that the minimum distance between any two cows is maximized.Examples:Input: arr[] = [1, 2, 4, 8, 9], k = 3

#### Examples

##### Example 1

- **Output:**
```text
4
```
- **Explanation:** The first cow can be placed at arr[0], the second at arr[1], and the third at arr[4]. In this arrangement, the minimum distance between any two cows is 4 (between arr[1] and arr[4]), which is the maximum possible among all valid arrangements.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n log m)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-10-13 15:00:54
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int aggressiveCows(int[] arr, int k) {
//        code here
        Arrays.sort(arr);
        int low = 1;
        int high = arr[arr.length - 1] - arr[0];
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cows = 1;
            int last = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - last >= mid) {
                    cows++;
                    last = arr[i];
                }
            }

            if (cows >= k) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-10-13 15:00:47
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public int aggressiveCows(int[] arr, int k) {
//        code here
        Arrays.sort(arr);
        int low = 1;
        int high = arr[arr.length - 1] - arr[0];
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cows = 1;
            int last = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - last >= mid) {
                    cows++;
                    last = arr[i];
                }
            }

            if (cows >= k) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
```

*Generated on: 13/10/2026, 15:01:30*