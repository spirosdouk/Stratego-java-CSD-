package model.player;
import model.Piece.Piece;
import java.util.ArrayList;
/**
 * This class represents a player's alive pieces
 */
public class Alivepeaces
{
    private ArrayList<Piece> pieces;

    /**
     * Constructor
     * Post-condition array of alive pieces created
     */
    public Alivepeaces()
    {
        this.pieces =new ArrayList<Piece>();
    }
    /**
     * Accessor return's piece in i pos
     * Precondition I is lessthan array size
     * Post-condition piece in position I returned
     * @param I the position of the piece in the list
     * @return piece of I position
     */
    public Piece getPiece(int I)
    {
        return pieces.get(I);
    }
    /**
     * Accessor Returns the piece's rank in pos I
     * Precondition I is less than array size
     * Post-condition piece's rank in position I returned
     * @param I position
     * @return the rank of the piece
     */
    public int getRank(int I)
    {return pieces.get(I).getRank();}

    /**
     * Transformer removes a piece form the list
     * Precondition name is string type
     * Post-condition A piece has been removed from the list
     * @param name the piece that wants to be added
     */

    public void removePiece(String name)
    {

    }

    /**
     * Transformer Adds a piece form the list
     * Precondition name is Piece type
     * Post-condition A piece has been added from the list
     * @param piece the piece that wants to be added
     */
    public void addPiece(Piece piece)
    {
        this.pieces.add(piece);
    }

}
