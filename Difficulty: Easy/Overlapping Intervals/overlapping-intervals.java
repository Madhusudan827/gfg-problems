class Solution {
    static boolean isIntersect(int[][] intervals) {
       for(int i=0;i<intervals.length-1;i++){
           for(int j=i+1;j<intervals.length;j++){
               if(intervals[i][0]<=intervals[j][1] && intervals[i][1]>=intervals[j][0] ){
                   return true;
               }
           }
       }
        return false;
    }
}