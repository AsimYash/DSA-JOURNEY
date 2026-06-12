import java.util.*;
class Solution {
    public long repairCars(int[] ranks, int cars) {
        long l = 1, r = ranks[0];
        for (int i = 0; i<ranks.length; i++){
            if (ranks[i]<r)
            r = ranks[i];
        }
        r = r*cars*cars;
        while (l<r){
            long mid = l+(r-l)/2;
            long rc = 0;
            for (int rank : ranks){
                rc = rc+(long)Math.sqrt(mid/rank);
            }
            if (rc >= cars)
            r = mid;
            else 
            l = mid+1;
        }
        return l;
    }
}
