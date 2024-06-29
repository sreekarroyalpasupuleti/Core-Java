// Nested Loops
// Writing one loop inside another loop is called as Nested loop

// Q) Write a java program to print below pattern using loops
//
//*
//* *
//* * *
//* * * *
//* * * * *
public class NestedLoop {
    public static void main(String... args){
        for ( int i = 1; i <=5 ; i++ ){
            for ( int j = 1; j <= i ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
