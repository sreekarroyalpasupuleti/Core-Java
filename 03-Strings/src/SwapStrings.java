public class SwapStrings {

    public static void main(String[ ] args){


        String a = "Hello";   // 4
        String b = "Hai"; // 7

        a = a+b; // 11

        b = a.substring(0, a.length() - b.length());

        a = a.substring(b.length());

        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

    }

}
