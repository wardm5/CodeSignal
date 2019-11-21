boolean arithmeticExpression(int a, int b, int c) {
    return (a + b == c) || (a * b == c) || (a - b == c) || (((double)a / (double)b) == (double)c);
}
