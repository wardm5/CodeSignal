String[] addBorder(String[] picture) {
    String[] result = new String[picture.length+2];
    String topBot = buildTopBot(picture[0].length() + 2);
    result[0] = topBot;
    result[result.length-1] = topBot;
    for (int i = 1; i < result.length -1; i++) {
        result[i] = addStarBorder(picture[i-1]);
    }
    return result;
}
private String buildTopBot(int length) {
    StringBuilder build = new StringBuilder();
    for (int i = 0; i< length; i++) {
        build.append("*");
    }
    return build.toString();
}
private String addStarBorder(String text) {
    return "*" + text + "*";
}
