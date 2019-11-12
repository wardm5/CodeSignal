int centuryFromYear(int year) {
    String s = year + "";
    if (s.length() <= 2)
        return 1;
    if (s.length() <= 3 && Integer.valueOf(s.substring(s.length()-2,s.length())) > 0)
        return Integer.valueOf(s.substring(0,1)) + 1;
    else if (s.length() <= 3)
        return Integer.valueOf(s.substring(0,1));
    if (Integer.valueOf(s.substring(s.length()-2,s.length())) > 0)
        return Integer.valueOf(s.substring(0,2)) + 1;
    return Integer.valueOf(s.substring(0,2));
}
