class Person {
    // Instance variables (data or "state")
    String name;
    int age;

    // classes can contain
    //1. Data
    //2. subroutines (methods)
}

public class ClassesAndFieldsTutorial {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
    }
}
