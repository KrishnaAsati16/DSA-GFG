## 01. Coin Change (Minimum Coins)

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/number-of-coins1824/1)

### Problem Description

**Task:** Given an array coins[], where each element represents a coin of a different denomination, and a target value sum. You have an unlimited supply of each coin type. Find the minimum number of coins needed to obtain the target sum. If it is not possible to form the sum using the given coins, return -1.Examples:Input: coins[] = [25, 10, 5], sum = 30Output: 2Explanation: Minimum 2 coins needed, 25 and 5 Input: coins[] = [9, 6, 5, 1], sum = 19Output: 3Explanation: 19 = 9 + 9 + 1Input: coins[] = [5, 1], sum = 0Output: 0Explanation: For 0 sum, we do not need a coinInput: coins[] = [4, 6, 2], sum = 5Output: -1Explanation: Not possible to make the given sum.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(coins.size * sum)
- **Expected Auxiliary Space Complexity:** O(sum)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-09 22:12:01
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public int minCoins(int coins[], int sum) {
      if (sum == 0) return 0;
        int[][] dp = new int[coins.length][sum+1];
        // code here
        // 2 20 10 5 1 sum = 14 10+2+ = 3 coins
        int ans = helper(0,sum,coins,dp);
        return(ans!= Integer.MAX_VALUE) ? ans:-1;
    }
    
    private int helper(int i, int sum , int[] coins,  int[][] dp){
        if(i==coins.length){
            if(sum==0) return 0;      // valid ans
            else return Integer.MAX_VALUE; // invalid ans
        }
        if(dp[i][sum]!=0) return dp[i][sum];
        int skip = helper(i+1,sum,coins,dp);
        if(sum< coins[i]) return dp[i][sum] = skip;
        
        int take = helper(i,sum-coins[i],coins,dp);
        int pick = (take==Integer.MAX_VALUE) ? take : take + 1 ;
        return dp[i][sum]= Math.min(skip,pick);
    }
}
```

*Generated on: 09/10/2026, 22:12:34*