int shapeArea(int n) {
    // if (n == 1)
    //     return 1;
    // // System.out.println((n*n) + "   " + (n-2) +   "    ");
    // return ((n*2) + ((n-2) * 2)) + shapeArea(n-1);
    int sum = 1;
    for (int i = 2; i <= n; i++) {
        sum += (i * 2) + ((i - 2)  * 2);
    }
    return sum;
}
