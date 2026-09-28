class Solution {
    public int evalRPN(String[] tokens) {
        int num = 0;
        Stack<Integer> s = new Stack<>();
        int a=0;
        int b=0;
        int total=0;
        for(int i=0;i<tokens.length;i++){
            if(Character.isDigit(tokens[i].charAt(0)) || (tokens[i].charAt(0)=='-' && tokens[i].length()>1)){
                s.push(Integer.parseInt(tokens[i]));
            }else{
                a=s.pop();
                b=s.pop();
                if(tokens[i].equals("+")){
                    total=a+b;
                    s.push(total);
                }else if(tokens[i].equals("-")){
                    total=b-a;
                    s.push(total);
                }else if(tokens[i].equals("*")){
                    total=a*b;
                    s.push(total);
                }else{
                    total=b/a;
                    s.push(total);
                }
            }
        }
        return s.pop();
    }
}
