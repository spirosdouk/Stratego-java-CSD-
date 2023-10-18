package model.Piece;

/**
 * creating Slayer class it extends SpecialMovablePiece
 */
public class Slayer extends SpecialMovablePiece
{
    /**
     * The Constructor
     * Post-condition Constructs an instance of Slayer which it super method sets rank=1, name=Slayer. and we
     * with a method add its special powers .it is a MovablePiece
     */
    public Slayer() 
    {
        super(1, "Slayer");
        setSpecialPower("killDragon");
    }
}
