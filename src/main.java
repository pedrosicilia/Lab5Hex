import java.util.Scanner;


public class main {
        public static void main(String args[]) {

        int count = 0;
        String userinput;
        Scanner scan = new Scanner(System.in);


//     System.out.println("Test 1:");
        System.out.println("Enter: " +args[0]+ "");
        System.out.println("Enter: ");
        userinput = scan.nextLine();
           userinput = userinput.toUpperCase();

            char[] charArray = userinput.toCharArray();

            String compare0x = "0X";


           args[0] = args[0].toUpperCase();
            if(args[0].substring(0,2).equals(compare0x))
            {
                args[0] = args[0].substring(2);
                System.out.println( "W/O the two chars: " +args[0]+ "");
            }

        while (count < userinput.length()) {
            char hex;
            hex = userinput.charAt(count);
            charArray[count] = hex;

            System.out.println("Word/Num: " +count+ "" +charArray[count]+ "");
            count++;
        }
            char test = 'A';
            int num = 0;
            num = test - 55 ;

            System.out.println("TESTCHAR:  " +num+ "");

            double decimal = 0;
            double arraylength = charArray.length;
            double tempdec = 0;

            int charvert = 0;

System.out.println(" LeNGTH: " +arraylength+"");

        for(int i = 0; i < charArray.length; i++) {
            arraylength--;
           // decimal = Math.pow(16, arraylength);

            if(charArray[i] > 58) {
                if(charArray[i] == 'A') {
                    charvert = 10;
                }
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

                System.out.println("Char value: "+charArray[i]+ " Position: " +arraylength+ "  DECIMAL: " +decimal+ " TEMPDEC" +tempdec+ "");



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