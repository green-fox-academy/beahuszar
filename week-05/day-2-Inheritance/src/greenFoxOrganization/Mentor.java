package greenFoxOrganization;

public class Mentor extends Person {

  private String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name,age,gender);
    this.level = level;
  }

  public Mentor() {
    super("Jane Doe",30,"female");
    this.level = "intermediate";
  }

  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() + " " + level + " mentor.");
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  private final String getLevel() {
    return this.level;
  }
}
