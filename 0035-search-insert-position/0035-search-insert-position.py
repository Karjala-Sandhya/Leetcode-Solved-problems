class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        n=len(nums)-1
        low=0
        high=n
        
        while low<=high:
            mid=(low+high)//2
            if target==nums[mid]:
                return mid
            elif target<nums[mid]:
                high=mid-1
            else:
                low=mid+1
            
        return high+1