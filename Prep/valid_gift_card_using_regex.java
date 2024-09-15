package Prep;

import java.util.Scanner;

public class valid_gift_card_using_regex {
    public static boolean checkValidCard(String giftCardNo) {

        // Correct pattern to match the gift card number format
        String pattern = "^[986]\\d{3}-\\d{4}-\\d{4}-\\d{4}$";
        
        // Check if the card matches the pattern
        if (!giftCardNo.matches(pattern)) {
            return false;
        }

        // Check for consecutive repeated digits
        for (int j = 0; j < giftCardNo.length() - 3; j++) {
            if (giftCardNo.charAt(j) == giftCardNo.charAt(j + 1) &&
                giftCardNo.charAt(j + 1) == giftCardNo.charAt(j + 2) &&
                giftCardNo.charAt(j + 2) == giftCardNo.charAt(j + 3)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input

        for (int i = 0; i < n; i++) {
            String giftCardNo = sc.nextLine();
            if (checkValidCard(giftCardNo)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        sc.close();
    }
}
