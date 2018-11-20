package greenFoxOrganization;

public class Person {
  private String name;
  private int age;
  private String gender;

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " .");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment");
  }

  protected final String getName() {
    return this.name;
  }

  protected final String getGender() {
    return this.gender;
  }

  protected final int getAge() {
    return this.age;
  }
}
