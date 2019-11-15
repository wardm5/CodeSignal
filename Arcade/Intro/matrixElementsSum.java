int matrixElementsSum(int[][] matrix) {
    boolean[] arr = new boolean[matrix[0].length];
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[i].length; j++) {
            if (!arr[j] && matrix[i][j] != 0)
                sum += matrix[i][j];
            else if (matrix[i][j] == 0)
                arr[j] = true;
        }
    }
    return sum;
}
