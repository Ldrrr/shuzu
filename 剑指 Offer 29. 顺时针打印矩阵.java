class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix==null||matrix.length==0) return new int[0];
        int n = matrix.length, m = matrix[0].length;
        int[] a= new int[n*m];
        int left=0,right=m-1,top=0,bottom=n-1,k=0;
        while(true){
            for(int i=left;i<=right;i++){
                a[k++]=matrix[top][i];
            }
            if(++top>bottom){
                break;
            }
            for(int i=top;i<=bottom;i++){
                a[k++]=matrix[i][right];
            }
            if(--right<left){
                break;
            }
            for(int i=right;i>=left;i--){
                a[k++]=matrix[bottom][i];
            }
            if(--bottom<top){
                break;
            }
            for(int i=bottom;i>=top;i--){
                a[k++]=matrix[i][left];
            }
            if(++left>right){
                break;
            }
        }
        return a;
    }
}
