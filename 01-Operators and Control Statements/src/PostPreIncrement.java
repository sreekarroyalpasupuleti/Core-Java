public class PostPreIncrement {

        public static void main(String... args){
            int a = 49;

            int b = ++a  + a++ + a++  + ++a;

            // int b = 50 + 50 + 51 + 53 ==> 204
            System.out.println(b);
        }

}
