class Solution {
    public int reverse(int x) {
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        if(x==max||x==min) return 0;

        int reversed=0;

        while(x!=0){
            int lastDigit=x%10;
            if(reversed>max/10) return 0;
            if(reversed<min/10) return 0;
            reversed=reversed*10+lastDigit;
            x=x/10;

        }
        return reversed;
    }
}