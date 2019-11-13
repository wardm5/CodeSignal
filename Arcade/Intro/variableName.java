boolean variableName(String name) {
    if (Character.isDigit(name.charAt(0)))
        return false;
    for (int i = 0; i < name.length(); i++) {
        if (Character.isLetter(name.charAt(i)) || Character.isDigit(name.charAt(i)) || name.charAt(i) == '_')
            continue;
        return false;
    }
    return true;        
}
