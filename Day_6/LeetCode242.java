package Day_6;

import java.util.Arrays;

//----------------------- slow and takes more memory
class Solution {
    public boolean isAnagram(String s, String t) {
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }
}

class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr1[s.charAt(i) - 'a']++;
            arr2[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(arr1, arr2);
        
    }
}

class Solution3 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr1[s.charAt(i) - 'a']++;
            arr2[t.charAt(i) - 'a']++;
        }

        
        for (int i = 0; i < 26; i++){
            if (arr1[i] != arr2[i])
                return false;
            }
            
        return true;
    }
}

public class LeetCode242 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.isAnagram("car", "rat"));
        System.out.println(s.isAnagram("anagram", "nagaram"));

    }
}
