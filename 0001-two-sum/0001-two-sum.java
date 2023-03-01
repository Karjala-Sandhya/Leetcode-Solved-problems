class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=0;
      int n=nums.length;
      int flag=0;
      for(i=0;i<n;i++){
          for(j=i+1;j<n;j++){
              int sum=0;
              sum=nums[i]+nums[j];
              if(sum==target){
                  flag=1;
                  break;
              }
             
              }
            if(flag==1){
                break;
          }
      } 
      return new int[]{i,j};
    }
}