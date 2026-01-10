class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(n,result,"",0,0);
        return result;
    }
    public void generate(int n, List<String> current, String str, int open, int close){
        if(str.length() == 2*n){
            current.add(str);
            return;
        }

        if(open<n){
            generate(n,current,str+"(",open+1,close);
        }

        if(close<open){
            generate(n,current,str+")",open,close+1);
        }
    }
}
