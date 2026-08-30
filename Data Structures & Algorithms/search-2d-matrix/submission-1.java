class Solution {

    public boolean search(int [] [] matrix,int target, int row){
        int m=matrix[0].length;
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(target==matrix[row][mid]){
                return true;
            }
            else if(target>matrix[row][mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length; //no of rows
        int m=matrix[0].length;// no of col
        int low =0;
        int high = n-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(target>=matrix[mid][0] && target<=matrix[mid][m-1]){
                return search(matrix,target,mid);
            }
            else if(target>matrix[mid][m-1]){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;

    }
}
