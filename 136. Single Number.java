public class Solution {
    public int singleNumber(int[] nums) {
        int result= nums[0];
        for(int i =1;i<nums.length;i++){
          result=nums[0]^nums[i];  //异或(XOR),相同返回0.不同返回1，2^2^3^3^4^4^1＝1
    }
          return result;
        
}
}
