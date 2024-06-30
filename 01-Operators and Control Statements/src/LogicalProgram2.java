// Write a java program to read person age and person salary and print his eligibility for marriage
//Condtion : If person completes 5 projects and salary 1 lakh then eligible for promotion

import java.io.*;

 public class LogicalProgram2 {

    public static void main (String... args) throws Exception {

        InputStreamReader isr = new InputStreamReader( System.in );
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter Your Completed Projects");
        String str1 = br.readLine ( );
        int Projects = Integer.parseInt ( str1 );

        System.out.println("Enter Your Salary");
        String str2 = br.readLine ( );
        double salary = Double.parseDouble(str2);

        if ( Projects >5 && salary > 100000 ) {
            System.out.println("You are eligible for promotion");
        } else {
            System.out.println("You are not eligible for promotion");
        }
    }
}
