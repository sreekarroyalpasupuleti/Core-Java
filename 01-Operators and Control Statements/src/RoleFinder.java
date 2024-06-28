//How to read data from keyboard In Java
//1) BufferedReader-----( java.io )
//2) Scanner------------( java.util )
//3) Command Line Arguments (input for main method)

import java.io.*;
  public class RoleFinder {

        public static void main(String... args)  throws Exception {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine ( );
            int salary = Integer.parseInt(str);

            if( salary >= 10000 && salary <= 20000 ){
                System.out.println("Fresher");
            }else if ( salary >= 35000 &&  salary <=65000 ){
                System.out.println("AI Engineer");
            }else if( salary >= 96000 && salary <=190000 ){
                System.out.println("Data Scientist");
            }else if( salary >= 100000 && salary <=150000 ){
                System.out.println("Business Analyst");
            }else {
                System.out.println("Cannot Found");
            }

        }

}
