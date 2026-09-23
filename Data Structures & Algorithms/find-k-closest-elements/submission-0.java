class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> l = new ArrayList<>();
        List<int[]> l1 = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            l1.add(new int[]{Math.abs(x-arr[i]),i});
        }
        l1.sort((a,b)->Integer.compare(a[0],b[0]));
        for(int[] a : l1){
            if(l.size()==k){
                break;
            }
            l.add(arr[a[1]]);
        }
        Collections.sort(l);
        return l;
    }
}
