//// Array Declaration
//datatype [ ]  variableName;
//dataype variableName [ ] ;
//datatype  [ ]variableName ;

//// Array Creation
//variableName = new datatype [ size ] ;
//datatype[ ] variableName = new datatype [ size ] ;
//Ex :      int[ ]  arr = new int [ 7 ];

public class ArrayCreation {

        public static void main(String... args){

            int [ ]  arr  = new int [ 4 ] ;

            arr[0] = 170;
            arr[1] = 152;
            arr[2] = 126;
            arr[3] = 186;

            System.out.println ( arr [ 0 ] ) ;
            System.out.println ( arr [ 1 ] ) ;
            System.out.println ( arr [ 2 ] ) ;
            System.out.println ( arr [ 3 ] ) ;
        }
    }
