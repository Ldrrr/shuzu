class Solution {
    public int search(int[] nums, int target) {
    /*  int cnt=0;
      for(int i=0;i<nums.length;i++){
          if(nums[i]==target){
              cnt++;
          }
      }
      return cnt;*/
      int i=0,j=nums.length-1;
      while(i<j){
          int mid = i+(j-i)/2;
          if(nums[mid]>=target){
              j=mid;
          }else if(nums[mid]<target){
              i=mid+1;
          }
      }
      int cnt=0;
      while(i<nums.length&&nums[i]==target){
          cnt++;
          i++;
      }
      return cnt;
    }
}
