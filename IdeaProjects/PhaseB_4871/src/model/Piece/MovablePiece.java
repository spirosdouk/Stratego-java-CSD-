package model.Piece;
/**
 * MovablePiece Class extends Piece
 */
public class MovablePiece implements Piece
{
    private int rank;
    private int rescueCount=0;
    private String name;

    /**
     * Constructor
     * Precondition rank value should to be between 0 and 10, name should be String and name!=""
     * super method sets rank=rank ,name=name,x=x,y=y its coordinates
     * @param rank Rank of piece
     * @param name Name of piece
     */
    public MovablePiece(int rank, String name) {
        setName(name);
        setRank(rank);
    }
    /**
     * Transformer Increases rescue counter by 1.
     * Post-condition Rescue counter has been increased by 1.
     */
    @Override
    public void setRescueCount()
    {
        this.rescueCount++;
    }
    /**
     * Transformer: Sets the Piece's rank.
     * Precondition: rank's value has to be between 0 and 10.
     * Post-condition: Piece's rank has been set.
     * @param rank rank of piece
     */
    @Override
    public void setRank(int rank)
    {
        this.rank=rank;
    }

    /**
     * Transformer: Sets the Piece's name.
     * Precondition: name's value has to be of type String and name!="".
     * Post-condition: Piece's name has been set.
     * @param name name of the piece
     */
    @Override
    public void setName(String name)
    {
        this.name=name;
    }
    /**
     * Accessor Returns how many times a Piece has been rescued .
     * @return  rescueCount of the piece
     */
    @Override
    public int getRescueCount()
    {
        return this.rescueCount;
    }

    /**
     * Accessor Returns the Piece's rank.
     * @return  rank of Pieces
     */
    @Override
    public int getRank()
    {
        return rank;
    }

    /**
     * Accessor: Returns the Piece's name.
     * @return name of Piece
     */
    @Override
    public String getName()
    {
        return name;
    }
}
