class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long res = Long.MAX_VALUE;;
        for(int i =0;i<n-m+1;i++){
            int minElement = a.get(i);
            int MaxElement = a.get(i+m-1);
            res = Math.min(res,MaxElement-minElement);
        }
        return res;
    }
}
