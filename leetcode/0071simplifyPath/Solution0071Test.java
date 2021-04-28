import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0071Test {
    Solution0071 sl = new Solution0071();
    @Test
    void simplifyPath() {

        String path = "/home//foo/";
        String path2 = "/../";
        String res = sl.simplifyPath(path);
        System.out.println(res);
    }
}