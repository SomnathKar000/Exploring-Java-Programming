package dsa.leetcode;

import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        int[] maxNum=new int[2];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(Integer num : nums){
         Integer val=0;
         if(map.containsKey(num))val=map.get(num);
         val+=1;
         if(val>maxNum[1]){
             maxNum[1]=val;
             maxNum[0]=num;
         }
         map.put(num, val);
        } 
        return (int)maxNum[0];
    }
}
