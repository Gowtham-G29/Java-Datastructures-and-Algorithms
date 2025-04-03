
class singleNumber {
    public int singleNum(int[] nums) {
        int singleNum=0;
        for(int num:nums){
            singleNum=singleNum^num;
        }
        return singleNum;
    }
}