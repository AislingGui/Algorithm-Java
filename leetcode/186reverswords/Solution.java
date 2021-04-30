
class Solution {
    public void reverseWords(char[] s) {
        int len = s.length;
        reverse(s, 0, len - 1);
        int start = 0;
        for(int i = 0; i < len; i ++){

            if(s[i] == ' '){
                reverse(s, start, i - 1);
                start = i + 1;
            }
        }
        reverse(s, start, len - 1);
    }
    private void reverse(char[] s, int start, int end) {
        while (start < end) {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
    }
}