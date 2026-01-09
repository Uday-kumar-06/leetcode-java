class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        Stack<Character> stack = new Stack<>();
        int sum = 0;
        for(int i = s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(stack.isEmpty() || map.get(ch) >= map.get(stack.peek())){
                sum += map.get(ch);
                
            }else{
                sum -= map.get(ch);
            }
            stack.push(ch);
        }
        return sum;
    }
}
