package ciphers;

public class Cipher {


    private int x;

    public int getX(){
        return this.x;
    }

    public void setX(int x ){
        this.x = x;
    }

   //public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

   //public Cipher(){

   //}


   public String encode(String payload) {
       return payload;
   }

   public String decode(String payload) {
       return payload;
   }


   protected String replaceCharacters(String payload, String source, String target) {
       return "";
   }


   }
