package model.Piece;

/**
 * creating Scout class it extends SpecialMovablePiece
 */
public class Scout extends SpecialMovablePiece
{
 /**
 * The Constructor
 * Post-condition Constructs an instance of Scout which it super method sets rank=2, name=Scout. and we
 * with a method add its special powers .it is a MovablePiece
 */
    public Scout() 
    {
        super(2,"Scout");
        setSpecialPower("move");
    }
}
