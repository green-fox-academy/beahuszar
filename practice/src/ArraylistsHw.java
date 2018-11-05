import java.util.ArrayList;

public class ArraylistsHw {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(85);
        grades.add(70);

        for (int i = 0; i < grades.size(); i++) {
            System.out.printf("Grade #%d == %d\n",i, grades.get(i));
            /* grades[i] == grades.get(i) //first is for Array, second is for Arraylist via object */
        }

        grades.remove(1); // removes 85 above and reindexes 90&70
    }
}
