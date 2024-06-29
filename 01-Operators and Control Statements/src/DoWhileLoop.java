// do-while loop
// It is used to execute statements first then it will check the condition
// do-while is also called as conditional based loop only

// Syntax:

//        do{
        //statements
  //      }while (condition );

// Q) Write a java program to print numbers from 50 to 99 using do-while loop

public class DoWhileLoop {
    public static void main(String... args){

        int i = 50;
        do {
            System.out.println(i);
            i++;
        }while (i <= 99);
    }
}

