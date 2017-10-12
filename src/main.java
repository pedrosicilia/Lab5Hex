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

            char[] charArray = userinput.toCharArray();

            String compare0x = "0x";

            if(args[0].substring(0,2).equals(compare0x))
            {
                args[0] = args[0].substring(2);
                System.out.println( "W/O the two chars: " +args[0]+ "");
            }
            else
                System.out.println("FAILED");
            

        while (count < userinput.length()) {
            char hex;
            hex = userinput.charAt(count);
            charArray[count] = hex;

            System.out.println("Word/Num: " +charArray[count]+ "");
            count++;

        }


        //conversion();


    }

}