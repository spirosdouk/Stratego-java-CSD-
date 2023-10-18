package controller;
import model.Piece.*;
import model.player.Player;
import view.BoardandMovement.MovePiece;
import view.Button;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Controller
{
    private final Image redHidden=ImageIO.read(getClass().getResource("./images/RedPieces/redHidden.png"));
    private final Image blueHidden=ImageIO.read(getClass().getResource("./images/bluePieces/blueHidden.png"));/**prosuesa auta ta 2*/
    private int ID;
    private final Image blankBlock = ImageIO.read(getClass().getResource("./images/RedPieces/dragonR.png"));
    private  boolean end=false;
    private Player red,blue;
    private MovePiece viewa;

    /**
     * Constructor
     * Post-condition: Two Player created
     * ID for players turn has been initialized
     * variable endGame=false
     */
    public Controller( MovePiece view) throws IOException {
        this.red=new Player(true);
        this.blue=new Player(false);
        this.viewa=view;
        setPlayerID(1);
    }


    /**
     * TransformerInitializes a piece button
     * Precondition button type Button + it is not null, Name has to be a String and not null
     * x value has to be between 0 and 7
     * y value has to be between 0 and 9
     * Post-condition initialized piece
     */
    public Player temp=new Player(true);
    public Player temp2=new Player(false);
    public void initializeButton(Button button, String Name, String Color, int x, int y) throws IOException {
        Player temp=Color.equals("red")? red:blue;
        button.setXcoordinates(x);
        button.setYcoordinates(y);

        if (Color.equals("red")) {
            switch (Name) {
                case "Flag":
                    button.setbuttonsPiece(new Flag());
                    button.setCanBePressed(false);
                    temp.addAlive(new Flag());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/RedPieces/flagR.png")));
                    break;
                case "Trap":
                    button.setbuttonsPiece(new Trap());
                    button.setCanBePressed(false);
                    temp.addAlive(new Trap());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/RedPieces/trapR.png")));
                    break;
                case "Slayer":
                    button.setbuttonsPiece(new Slayer());
                    button.setCanBePressed(true);
                    temp.addAlive(new Slayer());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/RedPieces/slayerR.png")));
                    break;

                case "Scout":
                    button.setbuttonsPiece(new Scout());
                    button.setCanBePressed(true);
                    temp.addAlive(new Scout());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/RedPieces/scoutR.png")));
                    break;
                case "Elf":
                    button.setbuttonsPiece(new Elf());
                    button.setCanBePressed(true);
                    temp.addAlive(new Elf());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/RedPieces/elfR.png")));
                    break;
                case "Dwarf":
                    button.setbuttonsPiece(new Dwarf());
                    button.setCanBePressed(true);
                    temp.addAlive(new Dwarf());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/RedPieces/dwarfR.png")));
                    break;
                case "BeastRider":
                    button.setbuttonsPiece(new BeastRider());
                    button.setCanBePressed(true);
                    temp.addAlive(new BeastRider());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/RedPieces/beastRiderR.png")));
                    break;
                case "Knight":
                    button.setbuttonsPiece(new Knight());
                    button.setCanBePressed(true);
                    temp.addAlive(new Knight());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/RedPieces/knightR.png")));
                    break;
                case "LavaBeast":
                    button.setbuttonsPiece(new LavaBeast());
                    button.setCanBePressed(true);
                    temp.addAlive(new LavaBeast());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/RedPieces/lavaBeast.png")));
                    break;
                case "Yeti":
                    button.setbuttonsPiece(new Yeti());
                    button.setCanBePressed(true);
                    temp.addAlive(new Yeti());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/RedPieces/yeti.png")));
                    break;
                case "Sorceress":
                    button.setbuttonsPiece(new Sorceress());
                    button.setCanBePressed(true);
                    temp.addAlive(new Sorceress());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/RedPieces/sorceressR.png")));
                    break;
                case "Mage":
                    button.setbuttonsPiece(new Mage());
                    button.setCanBePressed(true);
                    temp.addAlive(new Mage());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/RedPieces/mageR.png")));
                    break;
                case "Dragon":
                    button.setbuttonsPiece(new Dragon());
                    button.setCanBePressed(true);
                    temp.addAlive(new Dragon());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/RedPieces/dragonR.png")));
                    break;
            }
            button.setHiddenImage(ImageIO.read(getClass().getResource("./images/RedPieces/redHidden.png")));
        }
        else if (Color.equals("blue")) {
            switch (Name) {
                case "Flag":
                    button.setbuttonsPiece(new Flag());
                    button.setCanBePressed(false);
                    temp2.addAlive(new Flag());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/bluePieces/flagB.png")));
                    break;
                case "Trap":
                    button.setbuttonsPiece(new Trap());
                    button.setCanBePressed(false);
                    temp2.addAlive(new Trap());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/bluePieces/trapB.png")));
                    break;
                case "Slayer":
                    button.setbuttonsPiece(new Slayer());
                    button.setCanBePressed(true);
                    temp2.addAlive(new Slayer());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/bluePieces/slayerB.png")));
                    break;
                case "Scout":
                    button.setbuttonsPiece(new Scout());
                    button.setCanBePressed(true);
                    temp2.addAlive(new Scout());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/bluePieces/scoutB.png")));
                    break;
                case "Elf":
                    button.setbuttonsPiece(new Elf());
                    button.setCanBePressed(true);
                    temp2.addAlive(new Elf());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/bluePieces/elfB.png")));
                    break;
                case "Dwarf":
                    button.setbuttonsPiece(new Dwarf());
                    button.setCanBePressed(true);
                    temp2.addAlive(new Dwarf());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/bluePieces/dwarfB.png")));
                    break;
                case "BeastRider":
                    button.setbuttonsPiece(new BeastRider());
                    button.setCanBePressed(true);
                    temp2.addAlive(new BeastRider());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/bluePieces/beastRiderB.png")));
                    break;
                case "Knight":
                    button.setbuttonsPiece(new Knight());
                    button.setCanBePressed(true);
                    temp2.addAlive(new Knight());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/bluePieces/knightB.png")));
                    break;
                case "LavaBeast":
                    button.setbuttonsPiece(new LavaBeast());
                    button.setCanBePressed(true);
                    temp2.addAlive(new LavaBeast());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/bluePieces/lavaBeast.png")));
                    break;
                case "Yeti":
                    button.setbuttonsPiece(new Yeti());
                    button.setCanBePressed(true);
                    temp2.addAlive(new Yeti());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/bluePieces/yeti.png")));
                    break;
                case "Sorceress":
                    button.setbuttonsPiece(new Sorceress());
                    button.setCanBePressed(true);
                    temp2.addAlive(new Sorceress());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/bluePieces/sorceressB.png")));
                    break;

                case "Mage":
                    button.setbuttonsPiece(new Mage());
                    button.setCanBePressed(true);
                    temp2.addAlive(new Mage());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/bluePieces/mageB.png")));
                    break;
                case "Dragon":
                    button.setbuttonsPiece(new Dragon());
                    button.setCanBePressed(true);
                    temp2.addAlive(new Dragon());
                    button.setStartImg(ImageIO.read(getClass().getResource("./images/bluePieces/dragonB.png")));
                    break;
            }
            button.setHiddenImage(ImageIO.read(getClass().getResource("./images/bluePieces/blueHidden.png")));
        }else{
            button.setbuttonsPiece(new BLANK());
            button.setCanBePressed(false);
        }
        button.setXcoordinates(x);
        button.setYcoordinates(y);
        button.setCanBeAttacked(true);

        if(Color.equals("red"))
        {
            button.setPlayer(1);
            button.setHiddenImage(redHidden);
            button.TurnImg(button.getStartImg());
        }
        else if(Color.equals("blue"))
        {
            button.setPlayer(2);
            button.setHiddenImage(blueHidden);
            button.TurnImg(button.getStartImg());
        }else {
            button.setPlayer(3);
        }
    }

    /**
     * Observer: Checks if move is Valid
     * Precondition buttons are type my buttons
     * Post-condition Move checked
     * @param start button 
     * @param end  button
     * @return  true if move is correct, else false
     */
    public boolean MoveValidity(Button start , Button end)
    {
        //check if the 2nd button can  be attacked
        if(end.getCanBeAttacked()==true){
         //same team can not be attacked
            if(start.getPlayer()==end.getPlayer()){
                return false;
            }

            //if pawn is scout "special power"
            if(start.getbuttonPiece().getRank()==2){
                int Xstart=start.getXcoordinates();
                int Ystart=start.getYcoordinates();
                int Xend=end.getXcoordinates();
                int Yend=end.getYcoordinates();
                int check=0;
                if((end.getXcoordinates()==start.getXcoordinates()+1 && end.getYcoordinates()==start.getYcoordinates()+1) || (end.getXcoordinates()==start.getXcoordinates()+1 && end.getYcoordinates()==start.getYcoordinates()-1) || (end.getXcoordinates()==start.getXcoordinates()-1 && end.getYcoordinates()==start.getYcoordinates()-1) || (end.getXcoordinates()==start.getXcoordinates()-1 && end.getYcoordinates()==start.getYcoordinates()+1))
                {
                    return false;
                }
                if((start.getXcoordinates()==end.getXcoordinates()&&(start.getYcoordinates()==end.getYcoordinates())))
                {return false;}
                if(end.getXcoordinates()==start.getXcoordinates()+1 || end.getXcoordinates()==start.getXcoordinates()-1 || end.getXcoordinates()==start.getXcoordinates()) {
                    if (end.getYcoordinates() == start.getYcoordinates() + 1 || end.getYcoordinates() == start.getYcoordinates() - 1 || end.getYcoordinates() == start.getYcoordinates()) {
                        return true;
                    }
                }
                if(Xstart==Xend&&Yend!=Ystart){
                    if(Ystart>Yend){
                        Ystart=Ystart-1;
                        for(int i=Ystart;i>=Yend;i--){
                            int coords=i+Xend*10;
                            if(viewa.button[coords].getPlayer()==1||viewa.button[coords].getPlayer()==2){
                                check++;
                                return false;
                            }
                        }
                        return true;
                    }
                    else{

                        System.out.println(Yend);
                        Ystart=Ystart+1;

                        System.out.println(Ystart);
                        for(int i=Ystart;i<=Yend;i++){
                            int coords=i+Xend*10;
                            if(viewa.button[coords].getPlayer()==1||viewa.button[coords].getPlayer()==2){
                                check++;
                                return false;
                            }
                        }
                        return true;
                    }

                }
                if(Ystart==Yend&&Xend!=Xstart){
                    if(Xstart>Xend){

                        System.out.println(Xend);
                        Xstart=Xstart-1;

                        System.out.println(Xstart);
                        for(int i=Xstart;i>=Xend;i=i-1){

                            int coords=i*10+Yend;
                            System.out.println(coords);
                            if(viewa.button[coords].getPlayer()==1||viewa.button[coords].getPlayer()==2){
                                check++;

                                return false;
                            }
                        }
                        return true;

                    }
                    else{

                        System.out.println(Xend);
                        Xstart=Xstart+1;

                        System.out.println(Xstart);
                        for(int i=Xstart;i<=Xend;i++){
                            int coords=i*10+Yend;
                            if(viewa.button[coords].getPlayer()==1||viewa.button[coords].getPlayer()==2){
                                check++;
                                return false;
                            }
                        }
                    }

                    System.out.println(check);

                    if (check==0){
                        return true;}
                    else {return false;}
                }
            }
//if the target button is diagonal, then return false.
            if((end.getXcoordinates()==start.getXcoordinates()+1 && end.getYcoordinates()==start.getYcoordinates()+1) || (end.getXcoordinates()==start.getXcoordinates()+1 && end.getYcoordinates()==start.getYcoordinates()-1) || (end.getXcoordinates()==start.getXcoordinates()-1 && end.getYcoordinates()==start.getYcoordinates()-1) || (end.getXcoordinates()==start.getXcoordinates()-1 && end.getYcoordinates()==start.getYcoordinates()+1))
            {
                System.out.println("AAAAA");
                return false;
            }
            if((start.getXcoordinates()==end.getXcoordinates()&&(start.getYcoordinates()==end.getYcoordinates())))
            {
                System.out.println("AAAAA");
                return false;}
            if(end.getXcoordinates()==start.getXcoordinates()+1 || end.getXcoordinates()==start.getXcoordinates()-1 || end.getXcoordinates()==start.getXcoordinates()) {
                if(end.getYcoordinates()==start.getYcoordinates()+1 || end.getYcoordinates()==start.getYcoordinates()-1 || end.getYcoordinates()==start.getYcoordinates()){
                    return true;
                }else{

                    return false;}
            }else{
                return false;}
        }
        return false;
    }


    /**
     * Transformer Makes an attack
     * Precondition start and end are type buttons
     * Post-condition fight done
     * (made some checks for validity if not valid returns )
     * @param start button that attacks
     * @param end  button that is attacked
     * @return (difrence 0 if attack not valid if attack valid return 1 if flag captured return 2)attacker wins 0,defender wins return 1,trap attacked 2,flag attacked 3
     */
    public int Attack (Button start , Button end)
    {
        System.out.println("attackers rank is ");
        System.out.println(start.getbuttonPiece().getRank());
        System.out.println("defenders rank is ");
        System.out.println(end.getbuttonPiece().getRank());
        //if block not a piece just move
        System.out.print("player is");
        System.out.println(end.getPlayer());

        if(start.getPlayer()==end.getPlayer()) {

            return 0;

        }
        //scout attacks dragon so cuz of the special power it is able to kill it
        if(start.getbuttonPiece().getRank()==1&&end.getbuttonPiece().getRank()==10){
            if(start.getPlayer()==1){
                blue.addDead(end.getbuttonPiece());
                this.swapButtonInfo(start, end);
                this.MakeBlank(start);
                return 1;
            }
            if(start.getPlayer()==2){
                red.addDead(end.getbuttonPiece());
                this.swapButtonInfo(start, end);
                this.MakeBlank(start);
                return 1;
            }
        }
        if(end.getbuttonPiece().getName().equals("BLANK"))
        {
            this.swapButtonInfo(start, end);
            this.MakeBlank(start);
            return 1;
        }

        if(start.getbuttonPiece().getRank()==3&&end.getbuttonPiece().getRank()==-1){
            if(start.getPlayer()==1){
                blue.addDead(end.getbuttonPiece());
                this.swapButtonInfo(start, end);
                this.MakeBlank(start);
                return 1;
            }
            if(start.getPlayer()==2){
                red.addDead(end.getbuttonPiece());
                this.swapButtonInfo(start, end);
                this.MakeBlank(start);
                return 1;
            }
        }
if(end.getbuttonPiece().getRank()==-2){
    if(start.getPlayer()==1){
        System.out.println("red player won");
        JOptionPane.showMessageDialog(null, "red player won","WINNER",1);
        System.exit(0);
    }else{
        System.out.println("blue player won");
        JOptionPane.showMessageDialog(null, "blue player won","WINNER",1);
        System.exit(0);
    }
    return 2;
}
        if(end.getbuttonPiece().getRank()==-1&&end.getbuttonPiece().getRank()==-1){

           if( start.getPlayer()==1&&end.getbuttonPiece().getRank()==-1){
            red.addDead(start.getbuttonPiece());
               this.MakeBlank(start);
           return 1;}
            if( start.getPlayer()==2&&end.getbuttonPiece().getRank()==-1){
            blue.addDead(start.getbuttonPiece());
                this.MakeBlank(start);
            return 1; }
        }
        if(start.getbuttonPiece().getRank()>end.getbuttonPiece().getRank())
    {
        if(start.getPlayer()==1)
        {
            System.out.println("Red attacked and killed Blue");
            this.swapButtonInfo(start, end);
            blue.addDead(start.getbuttonPiece());
            MakeBlank(start);
        }
        else if(start.getPlayer()==2)
        {
            System.out.println("Blue attacked and killed Red");
            this.swapButtonInfo(start, end);
            red.addDead(start.getbuttonPiece());
            MakeBlank(start);
        }
        return 1;
    }
    //attacker loses so there is no swap to the two buttons
    else if(start.getbuttonPiece().getRank()<end.getbuttonPiece().getRank())
    {
        if(start.getPlayer()==1)
        {
            System.out.println("Red attacked and got killed by Blue");
            red.addDead(start.getbuttonPiece());
            MakeBlank(start);
        }
        else if(start.getPlayer()==2)
        {
            System.out.println("Blue attacked and got killed by Red");
            blue.addDead(start.getbuttonPiece());
            MakeBlank(start);
        }
        return 1;
    }
    //both pieces die
    else if(start.getbuttonPiece().getRank()==end.getbuttonPiece().getRank())
    {
        if(start.getPlayer()==1)
        {
            System.out.println("Red and Blue killed each other");
            red.addDead(start.getbuttonPiece());
            MakeBlank(start);
            blue.addDead(end.getbuttonPiece());
            MakeBlank(end);
            end.setCanBePressed(false);
            start.setCanBePressed(false);
            return 1;
        }
        else if(start.getPlayer()==2)
        {
            System.out.println("Blue and Red killed each other");
            blue.addDead(start.getbuttonPiece());
            MakeBlank(start);
            red.addDead(end.getbuttonPiece());
            MakeBlank(end);
            end.setCanBePressed(false);
            start.setCanBePressed(false);
            return 1;
        }

    }


        MakeBlank(start);
        MakeBlank(end);
            return 1;
    }

    /**
     * Transformer Swaps info of buttons
     * Precondition Arguments start and end have to be buttons and not Null
     * Postcondition the buttons info got swapped
     * @param start button number 1
     * @param end button number 2nep(NEW)
     */
    public void swapButtonInfo(Button start, Button end)
    {
        if(end.getbuttonPiece().getName().equals("BLANK"))
        {
end.setPlayer(start.getPlayer());
            end.setStartImg(start.getStartImg());
            end.setHiddenImage(start.getHiddenImage());

            end.setbuttonsPiece(start.getbuttonPiece());

            end.setCanBePressed(true);
            MakeBlank(start);
            return;
        }
        Image temp1=start.getStartImg();
        Image temp2=start.getHiddenImage();
        Piece tempPawn=start.getbuttonPiece();
        int player=start.getPlayer();
        boolean canPressed=start.getCanBePressed();


        start.setStartImg(end.getStartImg());
        start.setHiddenImage(end.getHiddenImage());
        start.setCanBePressed(end.getCanBePressed());
        start.setbuttonsPiece(end.getbuttonPiece());
        if(end.getPlayer()==1){
            start.setPlayer(2);
        }else{start.setPlayer(1);}

        end.setStartImg(temp1);
        end.setHiddenImage(temp2);
        end.setCanBePressed(canPressed);
        end.setbuttonsPiece(tempPawn);
        end.setPlayer(player);
    }

    /**
     * Transformer Brings back a piece from the dead it is deployed in the start if it is allowed to be rescued + we replace the pieces
     * Precondition type MyButton and not null.
     * Post-condition Piece nor dead add the rescued one and delete the current and add it to the dead
     * @param button the button that will be swapped
     */
    public void Rescue(Button button)
    {}


    /**
     * Transformer Hides the buttons of the last player that moved,
     * and reveals the next player's buttons
     * Post-condition  last users buttons are hidden,reveal current player's buttons
     */

    public void hideButtons( ) {
//Hides buttons

        for(int i=0; i<80; i++) {

            if (i == 32 || i == 33 || i == 43 || i == 42 || i == 37 || i == 36 || i == 47 || i == 46) {
            }else{

            if (viewa.button[i].getPlayer() != 3) {
                viewa.button[i].setCanBePressed(false);
            }
            if (viewa.button[i].getPlayer() != 3) {
                viewa.button[i].setCanBePressed(false);
                //hide the buttons of last player.
                if (viewa.button[i].getPlayer() == this.getPlayerID()) {
                    viewa.button[i].setCanBePressed(false);

                    viewa.button[i].TurnImg(viewa.button[i].getHiddenImage());
                } else if (this.getPlayerID() == 1) {
                    if (viewa.button[i].getbuttonPiece().getRank() <= 0) {
                        viewa.button[i].setCanBePressed(false);
                    } else {
                        viewa.button[i].setCanBePressed(true);
                    }
                    viewa.button[i].TurnImg(viewa.button[i].getStartImg());
                    //reveal the buttons of the next player.
                } else if (this.getPlayerID() == 2) {
                    if (viewa.button[i].getbuttonPiece().getRank() <= 0) {
                        viewa.button[i].setCanBePressed(false);
                    } else {
                        viewa.button[i].setCanBePressed(true);
                    }
                    viewa.button[i].TurnImg(viewa.button[i].getStartImg());
                    //reveal the buttons of the next player.
                } else {
                }
            }
            else{
                viewa.button[i].setCanBeAttacked(true);
                viewa.button[i].setCanBePressed(false);
            }
        }
        }
    }


    /**
     * Observer Checks if the button can't move
     * Post-condition Returns 0 if the button is blocked
     * @param button the button
     * @return  0 if the button is blocked, else 1
     */
    public int checkIfBlocked(Button button)
    {
        return 1;
    }
   
    /**
     * Transformer buttons last x and y become blank
     * Precondition button is type my button + not null
     * Post-condition Button has been transformed to blank button.
     * @param but a button
     */

    public void MakeBlank(Button but)
    {
        but.setStartImg(blankBlock);
        but.setHiddenImage(blankBlock);
        but.TurnImg(blankBlock);
        but.setCanBeAttacked(true);
        but.setCanBePressed(false);
        but.setbuttonsPiece(new BLANK());
        but.setPlayer(3);
    }

    /**
     * Accessor Returns the ID
     * Post-condition ID returned
     * @return current player id(current player turn)
     */
        public int getPlayerID()
        {
            return this.ID;
        }
        /**
         * Transformer Sets the ID
         * Precondition id s 1 or 0
         * Post-condition set id
         * @param id ID of player(current player turn)
         */
        public void setPlayerID(int id)
        { this.ID=id;}
    /**
     * Transformer
     * return if player made a valid move and turn ended
     * Post-condition returned 1 if ended else 0
     */
    public void setendturn(boolean p){
         this.end=p;
    }
    /**
     * Accessor Returns the end
     * Post-condition end returned
     * @return if end is false or true(deleted)
     */
    public boolean getendturn()
    { return this.end;}
        /**
         * Transformer
         * switches id 1 fpr red 2 for blue
         * Post-condition New id(next player turn)
         */

        public void nextTurn()
        {
            if(this.getPlayerID()==1){this.setPlayerID(2);}
            else{this.setPlayerID(1);}
        }
}