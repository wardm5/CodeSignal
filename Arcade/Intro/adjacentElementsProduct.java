int adjacentElementsProduct(int[] inputArray) {
    int sum = Integer.MIN_VALUE;
    for (int i = 0; i < inputArray.length-1; i++) {
        int tempSum = inputArray[i] * inputArray[i+1];
        if (tempSum > sum) 
            sum = tempSum;
    }
    return sum;
}
