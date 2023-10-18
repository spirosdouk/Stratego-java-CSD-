package model.Piece;

/**
 * creating Dwarf class it extends SpecialMovablePiece
 */
public class Dwarf extends SpecialMovablePiece
{
    /**
     * Constructor
     * Post-condition Constructs an instance of Dwarf which it super method sets rank=3, name=Dwarf. and we
     * with a method add its special powers .it is a MovablePiece
     */
    public Dwarf()
    {
        super(3,"Dwarf"); 
        setSpecialPower("Defuse");
    }
}
