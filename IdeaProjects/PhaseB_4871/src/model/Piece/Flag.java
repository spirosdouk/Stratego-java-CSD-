package model.Piece;
/**
 * creating Flag class it extends ImmovablePiece
 */
public class Flag extends ImmovablePiece
{
    /**
     * The Constructor
     * Post-condition Constructs an instance of Flag which it super method sets rank=-2, name=Flag.it is a ImmovablePiece
     */
    public Flag() {
        super(-2, "Flag");
    }
    
}
