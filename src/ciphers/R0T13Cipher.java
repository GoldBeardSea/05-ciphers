package ciphers;

public class R0T13Cipher extends Cipher {

    public String encode(String stringToCipher) {

        char[] values = stringToCipher.toCharArray();
        for (int i = 0; i < values.length; i++) {
            char letter = values[i];

            if (letter >= 'a' && letter <= 'z') {
                if (letter > 'm') {
                    letter -= 13;
                } else {
                    letter += 13;
                }
            }
            values[i] = letter;
        }
        return new String(values);
    }

        /*
    public static void main(String[] args) {
        String input = "trbetr jnfuvatgba?";
        String rot13 = encodeROT(input);
        String cycle = encodeROT(rot13);

        System.out.println(input);
        System.out.println(rot13);
        System.out.println(cycle);
    }*/
}