package Arrays;
class Solution {
    //Optimal Approach using Mathematical Formula
    int missingNum(int arr[]) {
        int n=arr.length;
        long expected_sum=(long)(n+1)*(n+2)/2;
        long actual_sum=0;
        for(int i:arr){
            actual_sum+=i;
        }
        return (int)(expected_sum-actual_sum);
    }
}
