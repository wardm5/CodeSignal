int circleOfNumbers(int n, int firstNumber) {
    int temp = n / 2;
    if (temp + firstNumber >= n)
        return Math.abs(temp - firstNumber);
    return temp + firstNumber;
}
