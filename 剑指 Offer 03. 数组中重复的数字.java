class Solution {
    public int findRepeatNumber(int[] nums) {
        int[] a = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[nums[i]]++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>1){
                return i;
            }
        }
        return -1;
    }
}
