public class ReverseEachWord {

        public static void main(String... args){

            String s = "Welcome Back";

            String[ ]  arr = s.split(" ");

            for(int i = 0; i < arr.length ; i++){
                String x = arr [ i ];
                StringBuffer sb = new StringBuffer(x);
                sb.reverse( );
                System.out.print (sb+" ");
            }
        }

    }
