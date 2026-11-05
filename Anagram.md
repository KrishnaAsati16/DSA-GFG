## 01. Anagram

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/anagram-1587115620/1)

### Problem Description

**Task:** Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not. Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.Examples:Input: s1 = "geeks" s2 = "kseeg"Output: true Explanation: Both the string have same characters with same frequency. So, they are anagrams.Input: s1 = "allergy", s2 = "allergyy" Output: false Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams. Input: s1 = "listen", s2 = "lists" Output: false Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n + m)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-11-05 22:17:30
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-04-28 23:37:38
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
         if (s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // Method 2: Using Frequency Count (Efficient)
    static boolean isAnagramCount(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[26]; // assuming lowercase a-z

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
        
    }
}
```

*Generated on: 05/11/2026, 22:18:01*