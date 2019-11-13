boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    boolean check1 = (yourLeft == friendsLeft || yourLeft == friendsRight);
    boolean check2 = (yourRight == friendsLeft || yourRight == friendsRight);
    return (check1 && check2);
}
