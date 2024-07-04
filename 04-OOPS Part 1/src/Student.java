


    package ashokit;

      public class Student {

        int id;
        String name;

        Person[] m2() {

            Person p1 = new Person();
            p1.id = 101;
            p1.name = "Raju";

            Person p2 = new Person();
            p2.id = 102;
            p2.name = "Rani";

            Person p3 = new Person();
            p3.id = 103;
            p3.name = "Anil";

            Person[] arr = { p1, p2, p3 };

            return arr;

        }

        void m1(Person p1, Person p2) {
            System.out.println(p1.id + "--" + p1.name);
            System.out.println(p2.id + "--" + p2.name);
        }

        public static void main(String[] args) {
            Person p = new Person(); // obj1 created

            Person p1 = new Person(); // obj2 created
            p1.id = 101;
            p1.name = "Raju";

            Person p2 = new Person(); // obj3 created
            p2.id = 102;
            p2.name = "Rani";

            p.m1(p1, p2);

            Person[] arr = p.m2();

            for (Person person : arr) {
                System.out.println(person.id + "--" + person.name);
            }

        }
    }
