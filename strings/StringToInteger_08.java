class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        s = s.trim();
        int i = 0, sign = 1;
        long result = 0;

        // sign check
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // digit parsing
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // overflow check
            if (result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (result * sign);
    }
}
