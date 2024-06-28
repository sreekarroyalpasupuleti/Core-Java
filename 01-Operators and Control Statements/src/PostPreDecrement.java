public class PostPreDecrement {

        public static void main(String... args){
            int a = 9;
            int b =  a-- + --a + a--;

            // int b = 9 + 7 + 7
            System.out.println ( b );
        }

}
