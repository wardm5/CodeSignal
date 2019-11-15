boolean almostIncreasingSequence(int[] sequence) {
    int last = Integer.MIN_VALUE;
    int lastPrev = Integer.MIN_VALUE;
    int c = 0;
    
    for (int n : sequence) {
        if (n <= last) {
            c++;
            if (n > lastPrev)
                last = n;
        } else {
            lastPrev = last;
            last = n;
        }
    }
    return c <= 1;
}
