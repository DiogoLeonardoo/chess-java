package boardgame;

public class Piece {
    
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    } 

    // protected: only visible to the classes in the same package or subclasses
    protected Board getBoard() {
        return board;
    }    

}
