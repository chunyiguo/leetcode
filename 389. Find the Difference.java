public class Solution {  //只相差一个字母，先求出字母的对应code value，s和t的和相减，差就是多处的字母的code value，再转换成字母表示。
    public char findTheDifference(String s, String t) {
      int n = 0;
      int m = 0;
      for(int i=0;i<s.length()-1;i++){
        n += (int) s.charAt(i);
      }
      for(int i=0;i<t.length()-1;i++){
        m += (int) t.charAt(i);
      }
      
      return (char)(m-n);
        
    }
}
