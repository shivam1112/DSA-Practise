class Solution {
    public void setZeroes(int[][] matrix) {
        //finding where zeroes are located
        ArrayList<Integer> alm = new ArrayList<Integer>();
        ArrayList<Integer> aln = new ArrayList<Integer>();
        for(int m=0;m<matrix.length;m++){
            for(int n=0;n<matrix[0].length;n++){
                if(matrix[m][n]==0){
                    alm.add(m);
                    aln.add(n);
                }
            }
        }
        for(int i=0;i<alm.size();i++){
            for(int j=alm.get(i);j<matrix.length;j++){
                matrix[j][aln.get(i)]=0;
            }
            for(int k=alm.get(i);k>=0;k--){
                matrix[k][aln.get(i)]=0;
            }
            for(int l=aln.get(i);l<matrix[0].length;l++){
                matrix[alm.get(i)][l]=0;
            }
            for(int o=aln.get(i);o>=0;o--){
                matrix[alm.get(i)][o]=0;
            }
            
        }
    }
}