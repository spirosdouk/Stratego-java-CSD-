package model.Piece;

/**
 * interface Piece Contains the methods signatures MovablePiece/SpecialMovablePiece/ImmovablePiece
 */
public interface Piece
{

    /**
     * Transformer Sets the Piece's rank
     * Precondition rank's value has to be between 0 and 10
     * Post-condition Piece's rank has been set
     * @param rank rank of piece
     */
    public void setRank(int rank) ;
    /**
     * Transformer Sets the Piece's name
     * Precondition name's value has to be of type String and name!=""
     * Post-condition Piece's name has been set
     * @param name name of the Piece
     */
    public void setName(String name);
    /**
     * Transformer Increases rescue counter ++
     * Post-condition Rescue counter has been increased
     */
    public void setRescueCount();
    /**
     * Accessor Returns how many times a Piece has been rescued
     * @return  rescueCount of the piece
     */
    public int getRescueCount();

    /**
     * Accessor Returns the Piece's rank
     * @return  rank of Pieces
     */

    public int getRank();
    /**
     * Accessor Returns the Piece's name
     * @return name of Piece
     */
    public String getName();
}
