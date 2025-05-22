package Arrays;
import java.util.*;
class Solution {
    //Brute Force Approach using TreeSet
    int missingNum(int arr[]) {
        TreeSet<Integer> set=new TreeSet<>();
        int x=1;
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i: set){
            if(i==x){
                x++;
                continue;
            }else{
                return x;
            }
        }
        return x;
    }
}