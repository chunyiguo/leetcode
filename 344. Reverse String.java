public class Solution {
    public String reverseString(String s) {
        char[] chars = new char[s.length()];  
        int index = 0;  
        for (int i = s.length() - 1; i >= 0; i--) {  
            chars[index++] = s.charAt(i);  
        }  
        return new String(chars);  
    }  
}
