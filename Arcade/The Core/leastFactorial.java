int leastFactorial(int n) {
    int factSum = 1;
    int i = 1;
    while (factSum < n) {
        factSum *= i;
        i++;
    }
    return factSum;
}
