int arrayChange(int[] inputArray) {
    int count =0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < inputArray.length; i++) {
        if (inputArray[i] < max) {
            count += max + 1 - inputArray[i];
            max++;
        } else if (max == inputArray[i]) {
            count++;
            max++;
        } else {
            max = inputArray[i];
        }
    }
    return count;
}
