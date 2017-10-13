import sun.plugin2.message.Conversation;

import java.util.Scanner;


public class main {

    public static int conversion(String[] args) {

        int count = 0;

        System.out.println("Enter: " +args[0]+ "");
        char[] charArray = args[0].toCharArray();
        String compare0x = "0x";
        args[0] = args[0].toUpperCase();
        if(args[0].substring(0,2).equals(compare0x))
        {
            args[0] = args[0].substring(2);
        }

        while (count < args[0].length()) {
            char hex;
            hex = args[0].charAt(count);
            charArray[count] = hex;
            count++;
        }

        double decimal = 0;
        double arraylength;

        int charvert = 0;

        arraylength = charArray.length;


        for(int i = 0; i < charArray.length; i++) {
            arraylength--;

            if(charArray[i] > 58) {
                if(charArray[i] == 'A')
                    charvert = 10;
                else if(charArray[i] == 'B')
                    charvert = 11;
                else if(charArray[i] == 'C')
                    charvert = 12;
                else if(charArray[i] == 'D' )
                    charvert = 13;
                else if(charArray[i] == 'E')
                    charvert = 14;
                else if(charArray[i] == 'F')
                    charvert = 15;

                decimal = Math.pow(16, arraylength) * charvert + decimal;
            }
            else{
                charvert = (charArray[i] - '0');
                decimal = Math.pow(16, arraylength) * charvert + decimal;


            }
        }

        System.out.println( "Converted: " +decimal+ "");
        return (int) decimal;

    }


        public static void main(String args[]) {

            String hexdecimal;
            hexdecimal = args[0];
            conversion(hexdecimal);


    }

}