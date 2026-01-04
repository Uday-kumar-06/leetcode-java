class Solution {
    public static boolean isPalindrome(String s){
        int n = s.length();
        for(int i = 0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        String longest = "";
        int max = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<=n;j++){
                if(j-i <= max) continue;
                if(isPalindrome(s.substring(i,j))){
                    longest = s.substring(i,j);
                    max = j - i;
                }
            }
        }
        return longest;
    }
}