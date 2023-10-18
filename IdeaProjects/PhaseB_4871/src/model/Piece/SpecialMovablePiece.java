package model.Piece;

/**
 * This class represents a Special-Movable-Piece
 */
public class SpecialMovablePiece extends MovablePiece
{
    private String specialPower= "";
    
    /**
     * Constructor
     * Post-condition Creates a new Special Movable Pawn and via parent's class
     * (MovablePawn) super method sets rank and name
     * @param rank rank of pawn
     * @param name name of pawn
     */
    public SpecialMovablePiece(int rank, String name)
    {
        super(rank,name);
    }

    /**
     * Transformer Sets pawn's specialPower
     * Precondition special-power is a string and not null
     * Post-condition pawn's specialPower has been set
     * @param specialpower special power of pawn
     */
    public void setSpecialPower(String specialpower)
    {
        this.specialPower=specialpower;
    }
    
    
    /**
     * Accessor returns special power
     * Post-condition special power has been returned
     * @return special-power
     */
    public String getSpecialPower()
    {
        return this.specialPower;
    }
    
}
