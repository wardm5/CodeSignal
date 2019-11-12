int largestNumber(int n) {
    StringBuilder build = new StringBuilder();
    for (int i = 0; i < n; i++) {
        build.append(9);
    }
    return Integer.valueOf(build.toString());
}
