class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int original=num;
        int reverse=0;

        if(x<0){
            return false;
        }

        while(num != 0){
            int digit = num % 10;
            reverse =reverse*10+digit;
            num = num/10;
        }

        if(original == reverse){
            return true;
        }
        else{
            return false;
        }
        
    }
}
