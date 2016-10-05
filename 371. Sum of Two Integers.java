public class Solution {
    public int getSum(int a, int b) {
     int sum = 0;
        int carry = 0;
        do{
            sum = a ^ b;//异或，不考虑进位的加法
            carry = (a & b)<<1;//按位与并左移一位，相当于进位

              a = sum;
              b = carry;
        }while(carry != 0);

        return a;
    }
}
