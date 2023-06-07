package UptoTen;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int reverse = 0;
        int temp = x;
        while (temp != 0){
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }

        return (reverse == x);
    }

    public static void main(String[] args) {
        int x = 12321;

        System.out.println("Palindrome check " + isPalindrome(x));
    }
}
