import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution93Test {

    @Test
    void restoreIpAddresses() {
        Solution93 sl = new Solution93();
        List<String> res = sl.restoreIpAddresses("101023");
       for(String item: res){
           System.out.println(item);
       }

    }
}