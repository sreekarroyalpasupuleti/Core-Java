
package ashokit;

    class Driver {

        public static void main(String[] args) {
            Driver d = new Driver();
            Player p = d.m1(45);
            System.out.println(p.id + "--" + p.name + "--" + p.age);
        }

        Player m1(int id) {

            Player p = new Player();

            if (id == 7) { //false
                p.id = 7;
                p.name = "dhoni";
                p.age = 40;
            } else if (id == 18) { // false
                p.id = 18;
                p.name = "kohli";
                p.age = 34;
            } else if (id == 45) { // true
                p.id = 45;
                p.name = "Rohit";
                p.age = 38;
            }
            return p;
        }

    }

    class Player {
        int id;
        String name;
        int age;
    }

