import java.util.ArrayList;
import java.util.List;

public class Solution57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int i = 0;
        int len = intervals.length;
        while (i < len && intervals[i][1] < newInterval[0]){
            res.add(intervals[i]);
            i ++;
        }
        while(i < len && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        res.add(newInterval);
        while (i < len){
            res.add(intervals[i]);
            i++;
        }
        return  res.toArray(new int[res.size()][]);
    }
}
