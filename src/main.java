import java.util.Scanner;


public class main {
        public static void main(String args[]) {

        int count = 0;
        String userinput;
        Scanner scan = new Scanner(System.in);


//     System.out.println("Test 1:");
        System.out.println("Enter: " +args[0]+ "");
        System.out.println("Enter: ");
      //  userinput = scan.nextLine();
       //    userinput = userinput.toUpperCase();

            char[] charArray = args[0].toCharArray();

            String compare0x = "0x";

            args[0] = args[0].toUpperCase();

            if(args[0].substring(0,2).equals(compare0x))
            {
                args[0] = args[0].substring(2);
                System.out.println( "W/O the two chars: " +args[0]+ "");
            }

            System.out.println(" LeNGTH: " +args[0].length()+ " Displaying: " +args[0]+ "");


        while (count < args[0].length()) {
            char hex;
            hex = args[0].charAt(count);
            charArray[count] = hex;

            System.out.println("Word/Num: " +count+ "" +charArray[count]+ "");
            count++;
        }

            double decimal = 0;
            double arraylength;

            int charvert = 0;

            arraylength = charArray.length;


            System.out.println(" LeNGTH: " +arraylength+" Displaying: ");

        for(int i = 0; i < charArray.length; i++) {
            arraylength--;
           // decimal = Math.pow(16, arraylength);

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
              //  charArray[i] = (char) (charArray[i] - 55);
            System.out.println( "Charverted: " +charvert+ "");

            //    tempdec = charArray[i] - '7';
/*
            decimal = decimal * charvert;

            tempdec = decimal + tempdec;
*/

                System.out.println("Char value: "+charArray[i]+ " Position: " +arraylength+ "  DECIMAL: " +decimal+ " TEMPDEC: 0" );



        }

        System.out.println( "Converted: " +decimal+ "");

        /*

        int test;
        char a = 'A';
        char f = 'F';

        test = a + f;
        System.out.println("Expected 135 : " +test+ "");



*/






        //conversion();


    }

}