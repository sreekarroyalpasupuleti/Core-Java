//continue ====> It is used to skip one iteration in the loop execution then continue
//return ====> To come out from the method
public class Continue {

        public static void main(String... args){

            for (int i = 77; i<= 92; i++ ){
                if(i == 78 ) {
                    continue;
                }
                System.out.println(i);
            }
        }
}
