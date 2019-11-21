int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
    int height = 0;
    int day = 1;
    while (height < desiredHeight) {
        height += upSpeed;
        if (height >= desiredHeight)
            return day;
        height -= downSpeed;
        day++;
    }
    return day;
}
