## 01. Rat in a Maze

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1)

### Problem Description

**Task:** Given a binary matrix maze[][] of size n × n containing values 0 and 1, find all possible paths for a rat to travel from the source cell (0, 0) to the destination cell (n - 1, n - 1). The rat can move in four directions: up(U), down(D), left(L), and right(R).1 represents an open cell through which the rat can move.0 represents a blocked cell that cannot be traversed.The rat can move only through open cells and cannot visit the same cell more than once in a path. Return all valid paths as strings consisting of 'U', 'D', 'L', and 'R', representing the sequence of moves taken by the rat.Note: Return the paths in lexicographically increasing order. If no valid path exists, return an empty list.Examples:Input: maze[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}}

#### Examples

##### Example 1

- **Output:**
```text
[]
```
- **Explanation:** No path exists as the destination cell (1, 1) is blocked.

#### Constraints

- **1.** `2 ≤ n ≤ 50 ≤ maze[i][j] ≤ 1`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(4 ^ (n * n))
- **Expected Auxiliary Space Complexity:** O(n * n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-16 22:54:08
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
public ArrayList<String> ratInMaze(int[][] maze) {
ArrayList<String> ans = new ArrayList<>();
int n = maze.length;
    solve(0, 0, maze, "", ans, n);

    return ans;
}

void solve(int r, int c, int[][] maze, String path,
           ArrayList<String> ans, int n) {

    if (r < 0 || c < 0 || r >= n || c >= n || maze[r][c] == 0)
        return;

    if (r == n - 1 && c == n - 1) {
        ans.add(path);
        return;
    }

    maze[r][c] = 0;

    solve(r + 1, c, maze, path + "D", ans, n);
    solve(r, c - 1, maze, path + "L", ans, n);
    solve(r, c + 1, maze, path + "R", ans, n);
    solve(r - 1, c, maze, path + "U", ans, n);

    maze[r][c] = 1;
}
}
```

*Generated on: 16/10/2026, 22:54:40*