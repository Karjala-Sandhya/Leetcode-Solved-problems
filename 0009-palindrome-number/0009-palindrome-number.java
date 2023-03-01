class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int r=0;
        if(n<0){
            return false;
        }
        else{
            
            while(n>=1){
                r=r*10+(n%10);
                n=n/10;
                 
            }
        }
        if(x==r){
            return true;
        }
        else{
            return false;
        }

    }
}