String alphabeticShift(String inputString) {
    StringBuilder build = new StringBuilder();
    for (int i = 0; i < inputString.length(); i++) {
        char c = inputString.charAt(i);
        int val = (c - 'a') + 1;
        if (val >= 26)
            val = 0;
        char b = (char) (val + 97);
        build.append(b);
    }
    return build.toString();
}
