//Q-1) Write a java program to read Job Roles from keyboard, based on Job Roles  print its salary like below
//  Data Scientist -> Salary is $120000
// AI Engineer -> Salary is $150000
// UI designer -> Salary is $150000
// Java Developer -> Salary is $150000
import java.io.*;

    public class LogicalProgram {


        public static void main(String... args) throws Exception {

            InputStreamReader isr = new InputStreamReader (System.in);
            BufferedReader br = new BufferedReader ( isr );
            System.out.println ("Enter Job Role");
            String JobRole = br.readLine ( );

            switch ( JobRole ) {

                case "Data Scientist" : System.out.println("Salary is $120000");  	 break;

                case "AI Engineer" : System.out.println("Salary is $150000");  break;

                case "UI designer" : System.out.println("Salary is $180000");  break;

                case "Java Developer" :  System.out.println("Salary is $200000"); 	break;

                default : System.out.println("Brand Not Found");
            }
        }
    }
