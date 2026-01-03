import java.util.HashSet;

public class LongestSubstring_03 {

    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, longest = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                longest = Math.max(longest, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String[] testCases = {
                "abcabcbb",
                "bbbbb",
                "pwwkew",
                "",
                " ",
                "abba"
        };

        for (String s : testCases) {
            System.out.println(
                    "Input: \"" + s + "\" -> Longest Substring Length = "
                            + lengthOfLongestSubstring(s)
            );
        }
    }
}
