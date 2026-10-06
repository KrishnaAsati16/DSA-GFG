## 01. Count Square Submatrices with All Ones

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/count-square-submatrices-with-all-ones/1)

### Problem Description

**Task:** Given an n × m binary matrix mat[][], count the total number of square submatrices whose every element is 1.Examples :Input: n = 3, m = 3, mat[][] = [[0, 1, 1], [1, 1, 1], [0, 1, 1]]Output: 9Explanation: There are 9 square submatrices containing only 1s:
7 squares of size 1 × 1
2 squares of size 2 × 2
0 squares of size 3 × 3
Therefore, the total number of square submatrices with all 1s is 7 + 2 = 9.Input: n = 3, m = 3 mat[][] = [[1, 0, 1], [1, 1, 0], [1, 1, 0]]Output: 7Explanation: There are 7 square submatrices containing only 1s:
6 squares of size 1 × 1
1 squares of size 2 × 2
0 squares of size 3 × 3
Therefore, the total number of square submatrices with all 1s is 6 + 1 = 7.Constraints:1 ≤ n, m ≤ 10³⁰ ≤ mat[i][j] ≤ 1

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n * m)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-06 23:14:46
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
      public int countSquares(int[][]arr) {
          // code here
          int count =0;
          for(int i=0; i<arr.length;i++){
              for(int j=0; j<arr[0].length;j++){
                  if(i!=0 && j!=0){
                      if(arr[i][j]==1){
                          arr[i][j] += Math.min(arr[i-1][j],Math.min(arr[i-1][j-1],arr[i][j-1]));
                      }
                  }
                  count+=arr[i][j];
              }
          }
          return count;

      }
  }
```

*Generated on: 06/10/2026, 23:15:19*