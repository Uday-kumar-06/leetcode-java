class Solution {
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        int i = 0; int a = 0;int b = 1;
        int c = a+b;
        while(i != n){
            c = a+b;
            a = b;
            b = c;
            i++;
        }
        return c;
    }
}
