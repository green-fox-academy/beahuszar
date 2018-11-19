package inheritance.banaVideos;

public class SubClassBana_Cats extends SuperClassBana_Animal {
 public String favToy = "Yarn"; //Animal class does not have access to it
 public void playWith() {
   System.out.println("Yeah " + favToy);
 }

 public void walkAround() {
   System.out.println(this.getName() + " stalk around");
 }

 public String getToy() {
   return this.favToy;
 }

 public SubClassBana_Cats() {

 }

 public SubClassBana_Cats(String name, String favFood, String favToy) {
   super(name,favFood);
   this.favToy = favToy;
 }
}
