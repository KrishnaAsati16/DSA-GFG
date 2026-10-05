## 01. Count Paths from Top Left to Bottom Right

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/number-of-paths0926/1)

### Problem Description

**Task:** Given two integers m and n representing the number of rows and columns of a grid, respectively, find the number of distinct paths from the top-left cell (0, 0) to the bottom-right cell (m - 1, n - 1). From any cell, you can move only right or down.Note: The answer is guaranteed to fit within a 32-bit integer.Examples:Input: m = 2, n = 3

#### Examples

##### Example 1

- **Output:**
```text
1
```
- **Explanation:** There is only one possible path from the top-left cell to the bottom-right cell.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(min(m, n))
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (5)

#### Solution 1 (Java)

- **Submitted:** 2026-10-05 23:01:20
- **Status:** Correct
- **Marks:** 0

```java
// using recursion--------------------------------------->

// class Solution {
//     public int numberOfPaths(int m, int n) {
//         int N = m + n - 2;
//         int r = m - 1;
        
//         long res = 1;
//         for (int i = 1; i <= r; i++) {
//             res = res * (N - r + i) / i;
//         }
        
//         return (int) res;
//     }
// }

// using Dynamic programming--------------------->

// class Solution {
//      static int[][] dp;
//      public int numberOfPaths(int m, int n) {
//          dp = new int [m][n];   // rows -> 0 to m, cols-> 0 to n
//          return paths(m-1,n-1);
//      }
//      public int paths(int m, int n){
//          if(m==0 || n==0) return 1;
//          if(dp[m][n]!=0) return dp[m][n];
//          return dp[m][n] = paths(m-1,n) + paths(m,n-1);
//      }
// }


class Solution {
    public int numberOfPaths(int m, int n) {
      int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) dp[i][j] = 1;
                else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-10-03 15:53:23
- **Status:** Correct
- **Marks:** 0

```java
// using recursion--------------------------------------->

// class Solution {
//     public int numberOfPaths(int m, int n) {
//         int N = m + n - 2;
//         int r = m - 1;
        
//         long res = 1;
//         for (int i = 1; i <= r; i++) {
//             res = res * (N - r + i) / i;
//         }
        
//         return (int) res;
//     }
// }

// using Dynamic programming--------------------->

// class Solution {
//      static int[][] dp;
//      public int numberOfPaths(int m, int n) {
//          dp = new int [m][n];   // rows -> 0 to m, cols-> 0 to n
//          return paths(m-1,n-1);
//      }
//      public int paths(int m, int n){
//          if(m==0 || n==0) return 1;
//          if(dp[m][n]!=0) return dp[m][n];
//          return dp[m][n] = paths(m-1,n) + paths(m,n-1);
//      }
// }


class Solution {
    public int numberOfPaths(int m, int n) {
      int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) dp[i][j] = 1;
                else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
```

#### Solution 3 (Java)

- **Submitted:** 2026-10-03 15:51:40
- **Status:** Correct
- **Marks:** 0

```java
// using recursion--------------------------------------->

// class Solution {
//     public int numberOfPaths(int m, int n) {
//         int N = m + n - 2;
//         int r = m - 1;
        
//         long res = 1;
//         for (int i = 1; i <= r; i++) {
//             res = res * (N - r + i) / i;
//         }
        
//         return (int) res;
//     }
// }

// using Dynamic programming--------------------->

class Solution {
     static int[][] dp;
     public int numberOfPaths(int m, int n) {
         dp = new int [m][n];   // rows -> 0 to m, cols-> 0 to n
         return paths(m-1,n-1);
     }
     public int paths(int m, int n){
         if(m==0 || n==0) return 1;
         if(dp[m][n]!=0) return dp[m][n];
         return dp[m][n] = paths(m-1,n) + paths(m,n-1);
     }
}
```

#### Solution 4 (Java)

- **Submitted:** 2026-07-10 14:56:40
- **Status:** Correct
- **Marks:** 0

```java
// using recursion--------------------------------------->

// class Solution {
//     public int numberOfPaths(int m, int n) {
//         int N = m + n - 2;
//         int r = m - 1;
        
//         long res = 1;
//         for (int i = 1; i <= r; i++) {
//             res = res * (N - r + i) / i;
//         }
        
//         return (int) res;
//     }
// }

// using Dynamic programming--------------------->

class Solution {
     static int[][] dp;
     public int numberOfPaths(int m, int n) {
         dp = new int [m][n];   // rows -> 0 to m, cols-> 0 to n
         return paths(m-1,n-1);
     }
     public int paths(int m, int n){
         if(m==0 || n==0) return 1;
         if(dp[m][n]!=0) return dp[m][n];
         return dp[m][n] = paths(m-1,n) + paths(m,n-1);
     }
}
```

#### Solution 5 (Java)

- **Submitted:** 2026-07-10 14:49:00
- **Status:** Correct
- **Marks:** 0

```java
// using recursion--------------------------------------->

// class Solution {
//     public int numberOfPaths(int m, int n) {
//         int N = m + n - 2;
//         int r = m - 1;
        
//         long res = 1;
//         for (int i = 1; i <= r; i++) {
//             res = res * (N - r + i) / i;
//         }
        
//         return (int) res;
//     }
// }

// using Dynamic programming--------------------->

class Solution {
     static int[][] dp;
     public int numberOfPaths(int m, int n) {
         dp = new int [m+1][n+1];   // rows -> 0 to m, cols-> 0 to n
         return paths(m,n);
     }
     public int paths(int m, int n){
         if(m==1 || n==1) return 1;
         if(dp[m][n]!=0) return dp[m][n];
         return dp[m][n] = paths(m-1,n) + paths(m,n-1);
     }
}
```

*Generated on: 05/10/2026, 23:02:01*