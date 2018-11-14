package OOP;

public class ClassesAndFieldsTutorial {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;
        person1.speak(); //running Person class's "speak+ behaviour

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.sayHello();

        System.out.println(person1.name);
    }
}
