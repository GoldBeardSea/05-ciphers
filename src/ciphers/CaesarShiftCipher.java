package ciphers;

import java.util.Scanner;

public class CaesarShiftCipher {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encode(String stringToCipher, int shiftInt) {
        String origStr = stringToCipher;
        stringToCipher = stringToCipher.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < stringToCipher.length(); i++) {
            int originalChar = ALPHABET.indexOf(stringToCipher.charAt(i));
            int shiftVal = (shiftInt + originalChar) % 26;
            char replaceVal = ALPHABET.charAt(shiftVal);
            if (origStr.charAt(i) != 32) {
                cipherText += replaceVal;
            } else {
                cipherText += origStr.charAt(i);
            }
        }
        return cipherText;
    }

    public static String decode(String stringToCipher, int shiftInt) {
        stringToCipher = stringToCipher.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < stringToCipher.length(); i++) {
            int originalChar = ALPHABET.indexOf(stringToCipher.charAt(i));
            int shiftVal = (originalChar - shiftInt) % 26;
            if (shiftVal < 0) {
                shiftVal = ALPHABET.length() + shiftVal;
            }
            char replaceVal = ALPHABET.charAt(shiftVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
        String message = new String("defend the east wall of the castle");
//        message = scan.next("Hello");
        System.out.println(encode(message, 1));
//        System.out.println(decode(encode(message, 3), 3));
        scan.close();
    }
}