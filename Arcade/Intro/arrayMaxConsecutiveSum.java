int arrayMaxConsecutiveSum(int[] inputArray, int k) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < inputArray.length - k + 1; i++) {
        int sum = 0;
        for (int j = 0; j < k; j++) 
            sum += inputArray[i+j];
        System.out.println(sum);
        if (max < sum)
            max = sum;
    }
    return max;
}
