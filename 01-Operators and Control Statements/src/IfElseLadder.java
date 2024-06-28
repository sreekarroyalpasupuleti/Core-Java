public class IfElseLadder {

    public static void main(String... args){

        int salary = 150000;

        if( salary > 100000) {
            System.out.println("can live this apartment happily");
        } else if ( salary < 80000 ) {
            System.out.println("cannot live this apartment happily");
        } else {
            System.out.println("try to change another apartment");
        }
    }
}
