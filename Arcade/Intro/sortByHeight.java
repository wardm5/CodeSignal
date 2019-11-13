int[] sortByHeight(int[] a) {
    ArrayList<Integer> copy = new ArrayList<>();
    for (int i = 0; i < a.length; i++) {
        if (a[i] != -1)
            copy.add(a[i]);
    }
    Collections.sort(copy);
    int aIndex = 0; 
    int copyIndex = 0;
    while (aIndex < a.length && copyIndex < a.length) {
        if (a[aIndex] == -1) {
            aIndex++;
            continue;
        }
        a[aIndex] = copy.get(copyIndex);
        copyIndex++;
        aIndex++;
    }
    return a;
}
