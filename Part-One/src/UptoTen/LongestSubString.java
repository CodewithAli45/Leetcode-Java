package UptoTen;

import java.util.HashSet;

public class LongestSubString {
    public static int longestSubstring(String str){
        int count = 0;
        int left = 0;

        HashSet<Character> set = new HashSet<>();
        for(int right = 0; right < str.length(); right++){
            if(!set.contains(str.charAt(right))){
                set.add(str.charAt(right));
                count = Math.max(count, right - left + 1);
            }
            else {
                while(str.charAt(right) != str.charAt(left)){
                    set.remove(str.charAt(left));
                    left++;
                }
                set.remove(str.charAt(left));
                left++;
                set.add(str.charAt(right));
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String str = "pwwkew";
        int ans = longestSubstring(str);
        System.out.println(ans);
    }
}
