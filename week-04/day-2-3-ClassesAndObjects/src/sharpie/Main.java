package sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie smallBlack = new Sharpie("Black",12);
        smallBlack.use();
        smallBlack.use();
        System.out.println(smallBlack.inkAmount);


    }
}
