# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        low=1
        high=n
        pos=1
        while low<=high:
            mid=(low+high)//2
            x=isBadVersion(mid)
            if x==True:
                pos=mid
                high=mid-1
            else:
                low=mid+1
        return pos
            