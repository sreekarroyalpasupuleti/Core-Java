public class RemoveVowels {
    public static void main(String... args){

        String s = "How are you";

        s = s.replaceAll ("[aeiouAEIOU]", "");

        System.out.println(s); //Output: Hw r y
    }

}


