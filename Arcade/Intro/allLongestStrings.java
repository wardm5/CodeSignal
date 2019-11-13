String[] allLongestStrings(String[] inputArray) {
    int max = 0; 
    HashMap<Integer, ArrayList<String>> map = new HashMap<>();
    for (int i = 0; i < inputArray.length; i++) {
        int tempMax = inputArray[i].length();
        ArrayList<String> list = map.getOrDefault(tempMax, new ArrayList<>());
        list.add(inputArray[i]);
        map.put(tempMax, list);
        if (tempMax>max)
            max = tempMax;
    }
    ArrayList<String> resultList = map.get(max);
    String[] result = new String[resultList.size()];
    for (int i = 0; i < resultList.size(); i++) {
        result[i] = resultList.get(i);
    }
    return result;
}
