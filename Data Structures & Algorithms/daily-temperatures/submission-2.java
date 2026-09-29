// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int len = temperatures.length;
//         int[] res = new int[len];
//         for(int i=0;i<len;i++){
//             int j=i+1;
//             int c = 1;
//             while(j<len && temperatures[i]>=temperatures[j]){
//                 c++;
//                 j++;
//             }
//             if(j<len && temperatures[i]<temperatures[j]){
//                 res[i]=c;
//             }
//         }
//         return res;
//     }
// }
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int res[] = new int[len];
        for(int i=0;i<len;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int index = st.pop();
                res[index] = i-index;
            }
            st.push(i);
        }
        return res;
    }
}

