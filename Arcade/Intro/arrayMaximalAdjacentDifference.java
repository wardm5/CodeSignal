int arrayMaximalAdjacentDifference(int[] inputArray) {
    int max = Integer.MIN_VALUE;
    for (int i = 1; i< inputArray.length; i++) {
        if (Math.abs(inputArray[i] - inputArray[i-1]) > max)
            max = Math.abs(inputArray[i] - inputArray[i-1]);
    }
    return max;
}
