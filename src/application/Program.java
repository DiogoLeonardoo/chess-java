package application;
import boardgame.Position;
import boardgame.Board;

public class Program {
    public static void main(String[] args) throws Exception {
        Position pos = new Position(3, 5); // 3, 5
        System.out.println(pos);

        Board board = new Board(8, 8);
        System.out.println(board);
    }
}
