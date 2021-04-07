import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testReverseWords() {
        char[] ch = new char[]{'t','h','e', ' ','s','k','y', ' ', 'i','s',' ','b','l','u','e'};
        new Solution().reverseWords(ch);
        System.out.println(ch);
    }
}