package com.batch2024.corejava.elements.variables.basics;

public class PrimitiveDataType {
 /*
   byte    : byte         [1 byte]                [-128 to +127]
   short   : short        [2 byte]                [-32768 - +32767]
   Integer : int          [4 byte]                [-2147483648 - +2147483647]
   long    : long         [8 byte]

   float   : float        [4 byte]
   decimal : double       [8 byte]


   alphabet: char         [2 byte]
   boolean : boolean      [1 bit]
   (true/false)


 */

    public static void main(String[] args) {
        // Integer-section - start
        byte b = 127;
        System.out.println("value of byte : "+ b);

        short s = 32767;
        System.out.println("value of short " + s);

        int i = 2140000;
        System.out.println("value of int : "+ i);

      //long l = 232443434323424L;  //will work too
        long l = 232443434323424l;
        System.out.println("value of long : " + l);

        // Integer-section - end



        // Decimal Section - start

       // float f = 9987.909F;
        float f = 9987.909f;
        System.out.println("value of float : " + f);

        double d = 898877.90;
        System.out.println("value of double : " + d);


        // Decimal Section - end


        char c = 'a';
        System.out.println("value of char : " + c);

        boolean bool = true;

        System.out.println("value of boolean : " + bool);

    }
}
