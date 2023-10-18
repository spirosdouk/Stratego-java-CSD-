package model.player;
import model.Piece.Piece;
import java.util.ArrayList;
/**
 * This class represents a player's dead pieces
 */
public class Deadpieces
{
    private ArrayList<Piece> deadpieces;
    /**
     * Constructor
     * Post-condition array of alive pieces created
     */
    public Deadpieces()
    {
        this.deadpieces =new ArrayList<Piece>();
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
        return deadpieces.get(I);
    }
    /**
     * Accessor Returns the piece's rank in pos I
     * Precondition I is less than array size
     * Post-condition piece's rank in position I returned
     * @param I position
     * @return the rank of the piece
     */
    public int getRank(int I)
    {return deadpieces.get(I).getRank();}

    /**
     * Transformer removes a piece form the list
     * Precondition name is string type
     * Post-condition A piece has been removed from the list
     * @param name the piece that wants to be added
     */

        public void removePawn(String name)
        {
            for(int i=0; i<deadpieces.size(); i++)
            {
                if(deadpieces.get(i).getName().equals(name))
                {
                    deadpieces.remove(i);
                    return;
                }
            }
        }

    /**
     * Transformer Adds a piece form the list
     * Precondition name is Piece type
     * Post-condition A piece has been added from the list
     * @param piece the piece that wants to be added
     */
    public void addPiece(Piece piece)
    {
        this.deadpieces.add(piece);
    }

}


