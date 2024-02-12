package Concepts;
 class EnhancedLoop {
    public static void main (String args[]){
        int nums[]= new int[5];
        
        for(int i=0;i<nums.length;i++){
            nums[i]=(int)(Math.random()*10);
        }

        for(int n :nums){
            System.out.println(n);
        }
    }
}
