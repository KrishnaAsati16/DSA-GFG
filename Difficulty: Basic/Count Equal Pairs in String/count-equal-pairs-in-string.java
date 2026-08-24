class Solution {
    int equalPairs(String s) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            count += freq[i] * freq[i];
        }

        return count;
    }
}