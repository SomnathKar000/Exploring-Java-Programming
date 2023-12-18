package dsa;
import dsa.leetcode.Temp;
public class ArrayLeetCode {
    public int maxProductDifference(int[] nums) {
        int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE,c=0,d=0;
        for(int num :nums){
            if(num>d){
                c=d;
                d=num;
            }else if(num>c) c=num;

            if(num<a){
                b=a;
                a=num;
            }else if(num<b) b=num;
        }
        return Math.abs((a*b)-(c*d));
    }
    public void call(){
        Temp obj = new Temp();
        obj.show();
    }
}
