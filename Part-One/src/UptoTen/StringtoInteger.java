package UptoTen;

public class StringtoInteger {
    public static int myAtoi(String s) {
        int index = 0;
        int sign = 1;
        int result = 0;
    
        // Remove leading whitespace
        while (index < s.length() && s.charAt(index) == ' ')
            index++;
    
        // Check for optional sign
        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            if (s.charAt(index) == '-')
                sign = -1;
            index++;
        }
    
        // Convert digits to integer
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
    
            // Check for overflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }
    
            result = result * 10 + digit;
            index++;
        }
    
        return result * sign;
    }
    
    public static void main(String[] args) {
        String s = "  -12450";

        System.out.println("Reverse is " + myAtoi(s));
    }
}
