// using recursion--------------------------------------->

// class Solution {
//     public int numberOfPaths(int m, int n) {
//         // code here
//          if(m == 0 || n == 0) return 0;
//         if(m==1 || n==1) return 1;
//         return numberOfPaths(m-1,n) + numberOfPaths(m,n-1);
        
//     }
// }

class Solution {
    public int numberOfPaths(int m, int n) {
        int N = m + n - 2;
        int r = m - 1;
        
        long res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (N - r + i) / i;
        }
        
        return (int) res;
    }
}