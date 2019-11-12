boolean incorrectPasscodeAttempts(String passcode, String[] attempts) {
    int i = 0; 
    int attemptCount = 0;
    while (i < attempts.length) {
        if (attempts[i].equals(passcode))
            attemptCount = 0;
        else {
            attemptCount++;
        }
        if (attemptCount >= 10)
            return true;
        i++;
    }
    return (attemptCount >= 10);
}

