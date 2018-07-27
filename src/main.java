import ciphers.*;

import ciphers.Cipher;
//import ciphers.R0T13Cipher;

public class main {
    public static void main(String[] args) {
        Cipher cipher = new R0T13Cipher();
        //cipher.setX(5);
        cipher.encode("trbetr jnfuvatgba?");
        //  R0T13Cipher rot13 = new R0T13Cipher();
        // rot13.encodeROT();
    }
}
