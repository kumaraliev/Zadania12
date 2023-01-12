public class Main {
    public static void main(String[] args) {

        Person pers = new Person();
        pers.setName("Борис");
        pers.setLastName("Uson");

        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(2);
        cat.setWeight(1.5);
        cat.setOwner(" Kumar");
        cat.setPerson(pers);

        cat.hashOwner();
    }
}