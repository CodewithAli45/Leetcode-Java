package UptoTen;

public class ZigzagConversion {
    public static String convert(String s, int numRow){
       
        if(numRow == 1 || s.length() <= numRow){
            return s;
        }
        StringBuilder [] row = new StringBuilder[numRow];
        for(int i = 0; i < numRow; i++){
            row[i] = new StringBuilder();
        }
        int currentRow = 0;
        boolean goingDown = false;

        for(char c : s.toCharArray()){
            row[currentRow].append(c);
            if (currentRow == 0 || currentRow == numRow - 1) {
                goingDown = !goingDown;
            }
            
            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder str = new StringBuilder();
        for(StringBuilder ans : row){
            str.append(ans);
        }

        return str.toString();
    }
    public static void main(String[] args) {
        String str = "paypal";
        String res = convert(str, 3);
        System.out.println("Answer is " + res);
    }
}