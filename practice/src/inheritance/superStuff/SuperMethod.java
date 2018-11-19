package inheritance.superStuff;

public class SuperMethod {
  void eat(){System.out.println("eating...");}
}
class Dog2 extends SuperMethod{
  void eat(){System.out.println("eating bread...");}
  void bark(){System.out.println("barking...");}
  void work(){
    super.eat(); //calling superclass' method
    bark();
  }
}
class TestSuper2{
  public static void main(String args[]){
    Dog2 d=new Dog2();
    d.work();
  }
}
