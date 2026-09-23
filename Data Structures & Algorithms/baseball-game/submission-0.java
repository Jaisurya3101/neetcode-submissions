class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<operations.length;i++){
            String c = operations[i];
            if(c.equals("C")){
                s.pop();
            }else if(c.equals("+")){
                s.push(s.get(s.size()-1)+s.get(s.size()-2));
            }else if(c.equals("D")){
                s.push(s.get(s.size()-1)*2);
            }else{
                s.push(Integer.parseInt(c));
            }
        }
        int sum=0;
        int len =s.size();
        for(int j=0;j<len;j++){
            sum+=s.pop();
        }
        return sum;
    }
}