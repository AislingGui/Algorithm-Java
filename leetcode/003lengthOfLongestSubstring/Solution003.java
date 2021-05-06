import java.util.HashSet;

public class Solution003 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int len = s.length();
        int i = 0,j = 0;
        HashSet<Character> set = new HashSet<>();
        while(i < len && j < len){
            if(!set.contains(s.charAt(j))){
               set.add(s.charAt(j));
               ans = Math.max(j - i + 1,ans);
               j ++;
            }
            else{
                set.remove(s.charAt(i));
                i ++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        Solution003 sl003 = new Solution003();
        int ans = sl003.lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
}
