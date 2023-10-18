package view;
import model.Piece.Piece;
import model.player.Player;
import javax.swing.*;
import java.awt.*;

/**
 * This class represents a button for the board
 */
public class Button extends JButton {
    private int Player;
    private boolean Attacked,Pressed;
    private Player Plyerbut;
    private Piece Piecebut;
    private Image change,Img,sImg;
    private int X,Y;

    /**
     * Constructor
     * Post-condition: New button created
     */
    public Button() {
        super();
        setPlayer(0);
    }


    /**
     * Transformer give the button 1 or 2 dependent on the player that owns it
     * Precondition value has to be either 1 or 2 (added 3 if den einai kanenos)
     * Post-condition Piece's player has been set
     * @param player an int if 1 red else 2 blue
     */
    public void setPlayer(int player) {
       this.Player=player;
    }

    /**
     * Accessor Returns the button's player
     * Post-condition Button's player value returned
     * @return 1 if player is in the red team, else 2
     */
    public int getPlayer() {
        return this.Player;
    }

    /**
     * Accessor Returns the button's X coordinate
     * Post-condition Button's s is returned
     * @return buttons x cords
     */
    public int getXcoordinates() {

        return this.X;
    }

    /**
     * Transformer Sets X cords
     * precondition The X coordinate has to be between 0 and 7
     * Post-condition x cords are set
     * @param x int
     */
    public void setXcoordinates(int x) {

        this.X=x;
    }

    /**
     * Accessor Returns the button's Y coordinate
     * Post-condition Button's s is returned
     * @return buttons y cords
     */
    public int getYcoordinates() {
        return this.Y;
    }

    /**
     * Transformer Sets Y cords
     * precondition The Y coordinate has to be between 0 and 7
     * Post-condition y cords are set
     * @param y int
     */
    public void setYcoordinates(int y) {
        this.Y=y;
    }
    /**
     * Transformer Setter for attributes
     * Precondition pressed is bool
     * Post-condition we set pressed
     * @param pressed boolean
     */
    public void setCanBePressed(boolean pressed) {
        this.Pressed=pressed;
    }


    /**
     * Observer Returns canBePressed value of button
     * Post-condition canBePressed variable's value has been returned.
     * @return true if button can be pressed else false
     */
    public boolean getCanBePressed() {
        return this.Pressed;
    }

    /**
     * Transformer Setter for attribute attack
     * Precondition attacked is bool
     * Post-condition we set attacked
     * @param attacked boolean
     */
    public void setCanBeAttacked(boolean attacked) {this.Attacked=attacked;}

    /**
     * Observer Returns canBeAttacked value.
     * Post-condition it returned its value
     * @return true if button can be attacked else false
     */
    public boolean getCanBeAttacked() {
        return this.Attacked;
    }

    /**
     * Transformer Sets hidden image
     * Precondition img is type Image
     * @param img Image
     */
    public void setHiddenImage(Image img) {
        this.Img=img;
    }

    /**
     * Accessor Returns hidden image
     * Post-condition Hidden image returned.
     * @return hidden image
     */
    public Image getHiddenImage() {
        return this.Img;
    }

    /**
     * Transformer Sets the Piece of the button
     * Precondition piecebut is type Piece
     * Post-condition Piece of the button has been set
     * @param piecebut an object of Piece type
     */
    public void setbuttonsPiece(Piece piecebut) {this.Piecebut=piecebut;}


    /**
     * Accessor Returns the Piece of a button
     * Post-condition Piece returned
     * @return the Piece
     */
    public Piece getbuttonPiece() {
        return this.Piecebut;
    }
    /**
     * Transformer Sets start img
     * Precondition passes type image
     * @param img Image will be used for start img(PROSUESA)
     */
    public void setStartImg(Image img)
    {
        this.sImg=img;
    }


    /**
     * Accessor Returns start img
     * Postcondition img returned
     * @return start image (PROSUESA)
     */
    public Image getStartImg()
    {
        return this.sImg;
    }
    /**
     * Transformer sets image of current turn
     * Precondition Argument is an image
     * Postcondition Image of button was set
     * @param img img used in next turn
     */
    public void TurnImg(Image img)
    {
        this.change=img;
        this.setIcon(new ImageIcon(change));
    }
}