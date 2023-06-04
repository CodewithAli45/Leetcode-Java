// LeetCode Question No. - 001

package UptoTen;

import java.util.HashMap;

public class TwoSum {
    public static int [] twoSum(int arr[], int target){
        int ans[] = new int [2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(target - arr[i])){
                ans[1] = i;
                ans[0] = map.get(target - arr[i]);
                return ans;
            }
            map.put(arr[i], i);
        }

        return ans;
    }

    public static void display(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {2,7,11,5};
        int target = 9;

        int res[] = twoSum(nums, target);
        display(res);

    }
}
