import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }

    public static String ticTacResult (String filename) {

        String wino = "O";
        String winx = "X";
        String draw = "draw";


        try {
            Path gamePlay = Paths.get(filename);
            List<String> game = Files.readAllLines(gamePlay);
            String firstRow = game.get(0);
            String secondRow = game.get(1);
            String thirdRow = game.get(2);
            String ff = game.get(0).substring(0,1);
            String fs = game.get(0).substring(1,2);
            String ft = game.get(0).substring(2,3);
            String sf = game.get(1).substring(0,1);
            String ss = game.get(1).substring(1,2);
            String st = game.get(1).substring(2,3);
            String tf = game.get(2).substring(0,1);
            String ts = game.get(2).substring(1,2);
            String tt = game.get(2).substring(2,3);
/*
            System.out.println(firstRow);
            System.out.println(tt);*/

            if ((firstRow.equals("XXX") || secondRow.equals("XXX") || thirdRow.equals("XXX"))) { // check rows
                return winx;
            } else if (firstRow.equals("OOO") || secondRow.equals("OOO") || thirdRow.equals("OOO")) {
                return wino;
            } else if (ff.equals("X") && sf.equals("X") && tf.equals("X")) {
                return winx;
            } else if (ff.equals("O") && sf.equals("O") && tf.equals("O")) {
                return wino;
            } else if (fs.equals("X") && ss.equals("X") && ts.equals("X")) {
                return winx;
            } else if (fs.equals("O") && ss.equals("O") && ts.equals("O")) {
                return wino;
            } else if (ft.equals("X") && st.equals("X") && tt.equals("X")) {
                return winx;
            } else if (ft.equals("O") && st.equals("O") && tt.equals("O")) {
                return wino;
            } else if (ff.equals("X") && ss.equals("X") && tt.equals("X")) {
                return winx;
            } else if (ff.equals("O") && ss.equals("O") && tt.equals("O")) {
                return wino;
            } else if (ft.equals("X") && ss.equals("X") && tf.equals("X")) {
                return winx;
            } else if (ft.equals("O") && ss.equals("O") && tf.equals("O")) {
                return wino;
            } else return draw;

        } catch (Exception e) {
            System.out.println("OMG");
        }
        return null;
    }
}
