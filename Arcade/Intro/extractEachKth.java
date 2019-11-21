int[] extractEachKth(int[] inputArray, int k) {
    ArrayList<Integer> list = new ArrayList<>(); 
    for (int i = 0; i < inputArray.length; i++) {
        if ((i+1) % k != 0)
            list.add(inputArray[i]);
    }
    int[] result = new int[list.size()];
    for (int i = 0; i < list.size(); i++)
        result[i] = list.get(i);
    return result;
}
