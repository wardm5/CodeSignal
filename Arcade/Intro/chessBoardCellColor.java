boolean chessBoardCellColor(String cell1, String cell2) {
    int a1 = (cell1.charAt(0) - 'A') % 2;
    int a2 = (cell1.charAt(1) - '1') % 2;
    int b1 = (cell2.charAt(0) - 'A') % 2;
    int b2 = (cell2.charAt(1) - '1') % 2;
    System.out.println(a1 + " " + b2 + "      " + b1 + " " + b2);
    return (a1 == b1 && a2 == b2) ||  (a1 != b1 && a2 != b2);
}
