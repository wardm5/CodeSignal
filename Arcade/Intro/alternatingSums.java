int[] alternatingSums(int[] a) {
    int[] weights = new int[2];
    for (int i = 0; i < a.length -1; i+=2) {
        weights[0] += a[i];
        weights[1] += a[i+1];
    }
    if (a.length % 2 != 0)
        weights[0] += a[a.length-1];
    return weights;
}
