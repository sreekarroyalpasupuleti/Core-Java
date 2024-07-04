

    // Write a java method to return College data (id, name)


package ashokit;

    public class Return {

        College m1() {

            College c = new College();
            c.id = 101;
            c.name = "HITM";

            return c;
        }

        public static void main(String[] args) {
            Driver d = new Driver();
            College c = d.m1();
            System.out.println(c.id + "--" + c.name);
        }

    }

    class College {
        int id;
        String name;
    }
