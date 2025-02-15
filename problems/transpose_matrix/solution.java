class Solution {
    public int[][] transpose(int[][] matrix) {
        int col=matrix[0].length;
        int res[][]=new int [col][matrix.length];
    for(int i=0;i<col;i++){
		for(int j=0;j<matrix.length;j++){
			res[i][j]=matrix[j][i];
	}
	}
    return res;
}
}