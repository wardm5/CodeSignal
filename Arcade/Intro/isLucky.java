boolean isLucky(int n) {
    String s = n +"";
    int sum = 0;

    for (int i = 0; i < s.length()/2; i++) {
        sum += Integer.valueOf(s.charAt(i));
        sum -= Integer.valueOf(s.charAt(i + s.length()/2));
    }
    return sum == 0;
}

    // int first = Integer.valueOf(s.substring(0, s.length()/2));
    // int firstSum = 0;
    // while (first > 0) {
    //     firstSum += first % 10;
    //     first /= 10;
    // }
    // int second = Integer.valueOf(s.substring(s.length()/2, s.length()));
    // int secondSum = 0;
    // while (second > 0) {
    //     secondSum += second % 10;
    //     second /= 10;
    // }
    // return (firstSum == secondSum);
