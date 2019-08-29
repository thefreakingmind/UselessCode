package DailyCodingProblems;

class NewTask {
    boolean isNegative = false;
    int i = 0; // string iterator position
    int k = 0;
    public int myAtoi(String str) {
        int solution = 0;

        if (str == null || str.isEmpty()) {
            return 0;
        }
        while (i < str.length() && str.charAt(i) == ' ') {
            i++; // discard leading whitespace
        }
        checkSign(str);
        for (; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                int prev = solution; // keep solution from last iter to check for overflow
                solution = solution*10; // move number left one position
                solution = solution+(str.charAt(i)-'0'); // increase solution by curr integer
                if (isOverflow(prev, solution)) {
                    if (isNegative) {
                        return Integer.MIN_VALUE;
                    }
                    return Integer.MAX_VALUE;
                }
            } else {
                return signSolution(solution); // we've reached a non-integer character before end of string
            }
        }
        return signSolution(solution); // last character of string is an integer
    }

    boolean isOverflow(int prev, int curr) {
        // prev = value at last iteration
        // curr = value after current iteration
        if (curr/10 == prev) {
            return false;
        }
        return true;
    }

    void checkSign(String str) {
        if (str.charAt(i) == '+') {
            i++;
        } else if (str.charAt(i) == '-') {
            isNegative = true;
            i++;
        }
    }

    int signSolution(int solution) {
        if (isNegative) {
            return solution*-1;
        }
        return solution;
    }
}