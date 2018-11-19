package inheritance.superStuff;

public class SuperConstructor {
  SuperConstructor(){System.out.println("animal is created");}
}
class Dog3 extends SuperConstructor{
  Dog3(){
    super(); //calling superclass' constructor
    System.out.println("dog is created");
  }
}
class TestSuper3{
  public static void main(String args[]){
    Dog3 d=new Dog3();
  }
}

/*super can be provided implicitly too by the compiler */
