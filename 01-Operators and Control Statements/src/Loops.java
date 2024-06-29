//Loops are used to execute statements repeteadly
//In java we have below loops

//1) while loop
//2) do-while loop
//3) for loop
//4) for-each loop  (arrays & collections)

//While loop
// While loop is used to execute statements until condition is true
//while loop is called as conditional based loop
//If condition is true then loop statments will execute otherwise loop will be terminated

//syntax
//----------
//       while ( condition ){
//stmts
//        }

// Write a java program to print numbers from 1 to 59 using while loop
class While {
    public static void main (String... args){
        int i = 1;
        while ( i <= 59 ){
            System.out.println(i);
            i++;
        }
    }
}


