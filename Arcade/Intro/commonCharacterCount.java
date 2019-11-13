int commonCharacterCount(String s1, String s2) {
    HashMap<Character, int[]> map = new HashMap<>();
    for (int i = 0; i < s1.length(); i++) {
        int[] arr = map.getOrDefault(s1.charAt(i), new int[2]);
        arr[0] = arr[0] + 1;
        map.put(s1.charAt(i), arr);
    }
    int count = 0;
    for (int i = 0; i < s2.length(); i++) {
        int[] arr = map.getOrDefault(s2.charAt(i), new int[2]);
        if (arr[0] <= 0)
            continue;
        arr[1] = arr[1] + 1;
        if (arr[1] <= arr[0])
            count++;
    }
    return count;
}
