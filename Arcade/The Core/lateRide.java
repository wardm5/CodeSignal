int lateRide(int n) {
    int hours = (n / 60) ;
    int minutes = (n % 60);
    int result = 0;
    while (hours > 0) {
        result += hours % 10;
        hours /= 10;
    }
    while (minutes > 0) {
        result += minutes % 10;
        minutes /= 10;
    }
    return result;
}
