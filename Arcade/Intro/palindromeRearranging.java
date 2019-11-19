boolean palindromeRearranging(String inputString) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < inputString.length(); i++)
        map.put(inputString.charAt(i), map.getOrDefault(inputString.charAt(i), 0) + 1);
    int odds = 0;
    for (char tempChar : map.keySet()) {
        if (map.getOrDefault(tempChar, 0) % 2 == 1)
            odds++;
        if (odds > 1)
            return false;
    }
    return odds <= 1;
}
