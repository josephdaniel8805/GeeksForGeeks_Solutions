package Arrays;
class Solution {
    //Optimal Approach using XOR Operator
    int missingNum(int arr[]) {
        int n=arr.length;
        int or=0;
        for(int i=0;i<n;i++){
            or^=arr[i];
            or^=(i+1);
        }
        return or^(n+1);
    }
}
