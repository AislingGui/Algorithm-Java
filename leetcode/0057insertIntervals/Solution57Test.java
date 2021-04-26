import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution57Test {

    @Test
    void insert() {
        int[][] intervals = new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[][] res = new Solution57().insert(intervals,new int[]{4,8});
        for(int i = 0; i < res.length; i ++){
            for(int j = 0; j < 2; j ++){
                System.out.println(res[i][j]);
            }
        }

    }
}