package model.Piece;
/**
 * creating BLANK class it extends MovablePiece,used for non pieces squares
 */
public class BLANK extends MovablePiece
{
    /**
     * Constructor
     * Post-condition Constructs an instance of BLANK which it super method sets rank=0, name=BLANK..it is a MovablePiece
     */
    public BLANK()
    {
        super(0,"BLANK");
    }
}
