class Solution {
    public int countOnes(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int count=0;
        while(i<=j){
            if(arr[i]==1){
                count++;
            }
            if(arr[j]==1)
            { if(i!=j){
                count++;
                 }
            }
            i++;
            j--;
        }
        return count;
    }
}