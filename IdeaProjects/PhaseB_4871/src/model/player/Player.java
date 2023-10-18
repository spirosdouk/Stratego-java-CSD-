package model.player;
import model.Piece.Piece;
/**
 * This class represents a player
 */
public class Player 
{
    private boolean Player;// redPlayer is the one with the fire troops.
    private Deadpieces deadPieces ;
    private Alivepeaces alivePieces ;
    private int rescueCounter=0;

    /**
     * Constructor
     * Postconditions Creates a player and sets,if true it is the red playerelse blue
     * also it initializes the player's two piece collections.
     * @param Player is true if player is the red Player,else blue which is blue
     */
    public Player(boolean Player)
    {
        setPlayerteam(Player);
        this.alivePieces=new Alivepeaces();
        this.deadPieces=new Deadpieces();

    }

    /**
     * Transformer Sets color variable true if player has the fire troops else blue so false
     * Precondition Player is boolean type
     * Post-condition Player variable has been set with true if player has the fire troops,else blue and false
     * @param Playerz boolean variable
     */
    public void setPlayerteam(boolean Playerz)
    {
        this.Player=Playerz;
    }


    /**
     * Observer Returns true/false accordingly to player's team
     * Post-condition Returns true if the player has the fire team,else false
     * @return true if player has the fire team, else false
     */
    public boolean getPlayerteam()
    {
        return this.Player;
    }

    /**
     * Transformer Adds a piece to alive piece collection
     * Precondition piece is ty Piece
     * Post-condition piece added to alive
     * @param piece  piece type
     */
    public void addAlive(Piece piece)
    {
        this.alivePieces.addPiece(piece);
    }
    /**
     * Accessor Returns the size of the alive piece list
     * Transformer Size of the alive piece list has been returned
     * @return alive piece collection size
     */
    public int getAlivearrSize()
    {
        return 0;
    }

    /**
     * Accessor Returns the size of the dead piece list
     * Transformer Size of the dead piece list has been returned
     * @return dead piece list size
     */
    public int getDeadarrSize()
    {
        return 0;
    }


    /**
     * Transformer Adds a piece to dead piece collection
     * Precondition piece is ty Piece
     * Post-condition piece added to dead
     * @param piece  piece type
     */
    public void addDead(Piece piece)
    {
        this.deadPieces.addPiece(piece);
        this.alivePieces.removePiece(piece.getName());
    }
    
    
    /**
     * Transformer Removes a piece from dead piece list
     * Precondition piece is ty Piece
     * Post-condition piece removed dead list
     * @param piece an object of piece type
     */
    public void removeFromDead(Piece piece)
    {
    }
    /**
     * Accessor Returns a piece, from the dead piece list in position i
     * Post-condition piece from position i of the dead piece list has been returned
     * @param i the position of the piece in the dead piece list
     * @return the piece in position i in the dead piece list
     */
    public Piece getDeadPiece(int i)
    {
        return null;
    }
    /**
     * Transformer counter of rescue++
     * Post-condition Counter of rescues increases
     */
    public void IncreaseRescueCounter()
    {
        rescueCounter=this.rescueCounter+1;
        this.rescueCounter=rescueCounter;
    }
    /**
     * Accessor Returns the value of the rescue counter
     * Post-condition Value of rescue counter has been returned
     * @return the value of rescue counter
     */
    public int getRescueCounter(){
         return this.rescueCounter;
    }
}
