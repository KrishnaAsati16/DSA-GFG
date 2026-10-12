## 01. Koko Eating Bananas

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/koko-eating-bananas/1)

### Problem Description

**Task:** Koko is given an array arr[], where each element represents a pile of bananas. She has exactly k hours to eat all the bananas.
Each hour, Koko can choose one pile and eat up to s bananas from it.
If the pile has atleast s bananas, she eats exactly s bananas.
If the pile has fewer than s bananas, she eats the entire pile in that hour.
Koko can only eat from one pile per hour.
Your task is to find the minimum value of s (bananas per hour) such that Koko can finish all the piles within k hours.

#### Examples

##### Example 1

- **Input:**
```text
arr[] = [5, 10, 3], k = 4
```
- **Output:**
```text
5Explanation: If Koko eats at the rate of 5 bananas per hour:First pile of 5 bananas will be finished in 1 hour. Second pile of 10 bananas will be finished in 2 hours. Third pile of 3 bananas will be finished in 1 hours.Therefore, Koko can finish all piles of bananas in 1 + 2 + 1 = 4 hours.
```

##### Example 2

- **Input:**
```text
arr[] = [5, 10, 15, 20], k = 7
```
- **Output:**
```text
10
```
- **Explanation:** If Koko eats at the rate of 10 bananas per hour, it will take 6 hours to finish all the piles.

#### Constraints

- **1.** `1 ≤ arr.size() ≤ k ≤ 10⁶¹ ≤ arr[i] ≤ 10⁶`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n * log(max(arr[i])))
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (3)

#### Solution 1 (Java)

- **Submitted:** 2026-10-12 15:57:18
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
      public int kokoEat(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for(int ele : arr){
            max = Math.max(max,ele);
        }
        int lo = 1, hi = max, speed = max;
        while(lo<=hi){ // O(n*log(max))
            int mid = lo + (hi-lo)/2;
            if(hours(mid,arr) <= k){
                hi = mid - 1;
                speed = mid;
            }
            else lo = mid + 1;
        }
        return speed;
    }

    private int hours(int speed, int[] arr) {
        int h = 0;
        for(int ele : arr){
            if(ele%speed == 0) h += ele/speed;
            else h += (ele/speed + 1);
        }
        return h;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-09-22 22:17:32
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
      public int kokoEat(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for(int ele : arr){
            max = Math.max(max,ele);
        }
        int lo = 1, hi = max, speed = max;
        while(lo<=hi){ // O(n*log(max))
            int mid = lo + (hi-lo)/2;
            if(hours(mid,arr) <= k){
                hi = mid - 1;
                speed = mid;
            }
            else lo = mid + 1;
        }
        return speed;
    }

    private int hours(int speed, int[] arr) {
        int h = 0;
        for(int ele : arr){
            if(ele%speed == 0) h += ele/speed;
            else h += (ele/speed + 1);
        }
        return h;
    }
}
```

#### Solution 3 (Java)

- **Submitted:** 2026-08-04 23:05:27
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
      public int kokoEat(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for(int ele : arr){
            max = Math.max(max,ele);
        }
        int lo = 1, hi = max, speed = max;
        while(lo<=hi){ // O(n*log(max))
            int mid = lo + (hi-lo)/2;
            if(hours(mid,arr) <= k){
                hi = mid - 1;
                speed = mid;
            }
            else lo = mid + 1;
        }
        return speed;
    }

    private int hours(int speed, int[] arr) {
        int h = 0;
        for(int ele : arr){
            if(ele%speed == 0) h += ele/speed;
            else h += (ele/speed + 1);
        }
        return h;
    }
}
```

*Generated on: 12/10/2026, 15:59:53*