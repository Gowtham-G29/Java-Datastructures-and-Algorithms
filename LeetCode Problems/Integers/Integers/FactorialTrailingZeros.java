class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        int currentPowerOfFive=5;
        while(n>=currentPowerOfFive){
            count+=(n/currentPowerOfFive);
            currentPowerOfFive*=5;
        }
        // The number of trailing zeros in n! is equal to the number of times 5 is a factor in the numbers from 1 to n.
        // This is because there are always more factors of 2 than factors of 5 in the factorial.
        return count;
        
    }
}