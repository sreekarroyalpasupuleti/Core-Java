import java.io.*;
   public class FindNumber {
        public static void main(String... args) throws Exception {

            InputStreamReader isr = new InputStreamReader(System.in);

            BufferedReader br = new BufferedReader ( isr );
            System.out.println("Enter Number");

            String str = br.readLine ( );

            int num = Integer.parseInt (str);

            if( num % 2 == 0){
                System.out.println("It is even number");
            }else{
                System.out.println("It is odd number");
            }
        }


}
