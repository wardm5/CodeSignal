int shapeArea(int n) {
    if (n == 1)
        return 1;
    // System.out.println((n*n) + "   " + (n-2) +   "    ");
    return ((n*2) + ((n-2) * 2)) + shapeArea(n-1);
}
