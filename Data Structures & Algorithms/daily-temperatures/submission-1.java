class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        for(int i=0;i<len;i++){
            int j=i+1;
            int c = 1;
            while(j<len && temperatures[i]>=temperatures[j]){
                c++;
                j++;
            }
            if(j<len && temperatures[i]<temperatures[j]){
                res[i]=c;
            }
        }
        return res;
    }
}
