public class main {

    public static long conversion(String converting) {

        int count = 0;

        char[] charArray = converting.toCharArray();
        String compare0x = "0x";
        converting = converting.toUpperCase();
        if(converting.substring(0,2).equals(compare0x))
        {
            converting = converting.substring(2);
        }

        while (count < converting.length()) {
            char hex;
            hex = converting.charAt(count);
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

        return (long) decimal;

    }


        public static void main(String args[]) {

            String hexdecimal;
            long converteddec;
            System.out.print("java Main " +args[0]);
            hexdecimal = args[0];
           converteddec = conversion(hexdecimal);
            System.out.println( "\n" +converteddec+ "");


    }

}