public class WordCount2 {

        public static void main(String... args){

            String s = "Good Morning";

            String[ ] arr = s.trim().split("\\s+");

            System.out.println(arr.length); //Output: 2
        }

    }
