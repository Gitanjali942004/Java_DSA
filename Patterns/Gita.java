package Patterns;


public class Gita {
    public static void main(String[] args) {
        String[] G = {
            " ***** ",
            "*      ",
            "*  *** ",
            "*    * ",
            " ***** "
        };
        
        String[] I = {
            " ***** ",
            "   *   ",
            "   *   ",
            "   *   ",
            " ***** "
        };
        
        String[] T = {
            " ***** ",
            "   *   ",
            "   *   ",
            "   *   ",
            "   *   "
        };
        
        String[] A = {
            "   *   ",
            "  * *  ",
            " ***** ",
            " *   * ",
            " *   * "
        };
        
        String[][] letters = {G, I, T, A};

        for (int i = 0; i < 5; i++) {  // 5 rows per letter
            for (int j = 0; j < letters.length; j++) {  // Loop through each letter
                System.out.print(letters[j][i] + "  ");  // Print each row of the letter
            }
            System.out.println();
        }
    }
}
