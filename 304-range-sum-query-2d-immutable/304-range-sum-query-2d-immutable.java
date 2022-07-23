class NumMatrix {
    int[][] s;

    public NumMatrix(int[][] matrix) {
        s = matrix;
        int r = matrix.length, c = matrix[0].length;
        
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
                s[i][j] += (i!=0? s[i-1][j] :0) + (j!=0? s[i][j-1] :0) - (i!=0&&j!=0? s[i-1][j-1] :0);
        }
        
    }
    
    public int sumRegion(int r1, int c1, int r2, int c2) {
        int answer = s[r2][c2];
        if(r1!=0) answer -= s[r1-1][c2];
        if(c1!=0) answer -= s[r2][c1-1];
        if(r1!=0&&c1!=0) answer += s[r1-1][c1-1];
        
        return answer;
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */