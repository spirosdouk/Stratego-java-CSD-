package view.BoardandMovement;

import controller.Controller;
import model.Piece.BLANK;
import view.Button;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *class with pieces movement and board creation
 */
public class MovePiece extends JFrame {
    private boolean iconSelected;
    private JButton selectedButton;
    private MouseListener pLis;
    public Button[] button = new Button[80];

    private Controller controller; // create window (jframe)
    private Button button1;
    public MovePiece view ; // create window (jframe)
//pernao to player.array

    public MovePiece() throws IOException {
        // this.setResizable(false);
        this.controller=new Controller(this);
        this.setTitle("MovePiece Demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        CardListener cl = new CardListener();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 10));
        controller.setPlayerID(2);

        JFrame frame = new JFrame();
        String message = "do u want to play with less army?";
        int answer = JOptionPane.showConfirmDialog(frame, message);
        if (answer == JOptionPane.YES_OPTION) {
            for (int i = 0; i < 80; i++) {

                //JButton b = new JButton();
                button[i]=new Button();
                button[i].addMouseListener(pLis);
                if(i<30&&i%2==0)
                {

                    switch(i)
                    {

                        case 0:  controller.initializeButton(button[i],"Trap","red",0,0); break;

                        case 2:  controller.initializeButton(button[i],"Dragon","red",0,2); break;

                        case 4:  controller.initializeButton(button[i],"Flag","red",0,4); break;

                        case 6:  controller.initializeButton(button[i],"LavaBeast","red",0,6); break;

                        case 8:  controller.initializeButton(button[i],"Scout","red",0,8); break;

                        case 10: controller.initializeButton(button[i],"Sorceress","red",1,0); break;

                        case 12: controller.initializeButton(button[i],"Mage","red",1,2); break;

                        case 14: controller.initializeButton(button[i],"Slayer","red",1,4); break;

                        case 16: controller.initializeButton(button[i],"BeastRider","red",1,6); break;

                        case 18: controller.initializeButton(button[i],"Elf","red",1,8); break;

                        case 20: controller.initializeButton(button[i],"Scout","red",2,0); break;

                        case 22: controller.initializeButton(button[i],"Dwarf","red",2,2); break;

                        case 24: controller.initializeButton(button[i],"Trap","red",2,4); break;

                        case 26: controller.initializeButton(button[i],"Dwarf","red",2,6); break;

                        case 28: controller.initializeButton(button[i],"Knight","red",2,8); break;
                    }
                    button[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    button[i].setCanBePressed(true);
                    button[i].setCanBeAttacked(true);
                    button[i].addMouseListener(cl);
                    button[i].setName(cardname);
                    button[i].setPlayer(1);
                    panel.add(button[i]);
                }
                else if(i<30&&i%2==1){
                    switch(i)
                    {
                        case 1:controller.initializeButton(button[i],"BLANK","a",0,1); break;
                        case 3:controller.initializeButton(button[i],"BLANK","a",0,3); break;
                        case 5:controller.initializeButton(button[i],"BLANK","a",0,5); break;
                        case 7:controller.initializeButton(button[i],"BLANK","a",0,7); break;
                        case 9:controller.initializeButton(button[i],"BLANK","a",0,9); break;
                        case 11:controller.initializeButton(button[i],"BLANK","a",1,1); break;
                        case 13:controller.initializeButton(button[i],"BLANK","a",1,3); break;
                        case 15:controller.initializeButton(button[i],"BLANK","a",1,5); break;
                        case 17:controller.initializeButton(button[i],"BLANK","a",1,7); break;
                        case 19:controller.initializeButton(button[i],"BLANK","a",1,9); break;
                        case 21:controller.initializeButton(button[i],"BLANK","a",2,1); break;
                        case 23:controller.initializeButton(button[i],"BLANK","a",2,3); break;
                        case 25:controller.initializeButton(button[i],"BLANK","a",2,5); break;
                        case 27:controller.initializeButton(button[i],"BLANK","a",2,7); break;
                        case 29:controller.initializeButton(button[i],"BLANK","a",2,9); break;
                    }
                    button[i].setbuttonsPiece(new BLANK());
                    button[i].setIcon(getImageBack());
                    button[i].setCanBePressed(false);
                    button[i].setCanBeAttacked(true);
                    button[i].setPlayer(3);}
                //buttons for blue player
                else if (i>=50&&i%2==1 )
                {

                    switch(i)
                    {

                        case 51:controller.initializeButton(button[i],"Elf","blue",5,1);button[i].setXcoordinates(5);button[i].setYcoordinates(1); break;

                        case 53:controller.initializeButton(button[i],"Sorceress","blue",5,3);button[i].setXcoordinates(5);button[i].setYcoordinates(3); break;

                        case 55:controller.initializeButton(button[i],"Yeti","blue",5,5);button[i].setXcoordinates(5);button[i].setYcoordinates(5); break;

                        case 57:controller.initializeButton(button[i],"Dwarf","blue",5,7);button[i].setXcoordinates(5);button[i].setYcoordinates(7); break;

                        case 59:controller.initializeButton(button[i],"Scout","blue",5,9);button[i].setXcoordinates(5);button[i].setYcoordinates(9); break;
                        case 61:controller.initializeButton(button[i],"Trap","blue",6,1);button[i].setXcoordinates(6);button[i].setYcoordinates(1); break;
                        case 63:controller.initializeButton(button[i],"Dragon","blue",6,3);button[i].setXcoordinates(6);button[i].setYcoordinates(3); break;
                        case 65:controller.initializeButton(button[i],"Slayer","blue",6,5);button[i].setXcoordinates(6);button[i].setYcoordinates(5); break;
                        case 67:controller.initializeButton(button[i],"Scout","blue",6,7);button[i].setXcoordinates(6);button[i].setYcoordinates(7); break;
                        case 69:controller.initializeButton(button[i],"Mage","blue",6,9);button[i].setXcoordinates(6);button[i].setYcoordinates(9); break;
                        case 71:controller.initializeButton(button[i],"Dwarf","blue",7,1);button[i].setXcoordinates(7);button[i].setYcoordinates(1); break;
                        case 73:controller.initializeButton(button[i],"Trap","blue",7,3);button[i].setXcoordinates(7);button[i].setYcoordinates(3); break;
                        case 75:controller.initializeButton(button[i],"Knight","blue",7,5);button[i].setXcoordinates(7);button[i].setYcoordinates(5); break;
                        case 77:controller.initializeButton(button[i],"BeastRider","blue",7,7);button[i].setXcoordinates(7);button[i].setYcoordinates(7); break;
                        case 79:controller.initializeButton(button[i],"Flag","blue",7,9);button[i].setXcoordinates(7);button[i].setYcoordinates(9); break;
                    }
                    button[i].setPlayer(2);
                    button[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    button[i].setCanBePressed(true);
                    button[i].setCanBeAttacked(true);
                    button[i].addMouseListener(cl);
                    button[i].setName(cardname);
                    panel.add(button[i]);

                }  else if(i>=50&&i%2==0){
                    switch(i)
                    {
                        case 50:controller.initializeButton(button[i],"BLANK","a",5,0); break;
                        case 52:controller.initializeButton(button[i],"BLANK","a",5,2); break;
                        case 54:controller.initializeButton(button[i],"BLANK","a",5,4); break;
                        case 56:controller.initializeButton(button[i],"BLANK","a",5,6); break;
                        case 58:controller.initializeButton(button[i],"BLANK","a",5,8); break;
                        case 60:controller.initializeButton(button[i],"BLANK","a",6,0); break;
                        case 62:controller.initializeButton(button[i],"BLANK","a",6,2); break;
                        case 64:controller.initializeButton(button[i],"BLANK","a",6,4); break;
                        case 66:controller.initializeButton(button[i],"BLANK","a",6,6); break;
                        case 68:controller.initializeButton(button[i],"BLANK","a",6,8); break;
                        case 70:controller.initializeButton(button[i],"BLANK","a",7,0); break;
                        case 72:controller.initializeButton(button[i],"BLANK","a",7,2); break;
                        case 74:controller.initializeButton(button[i],"BLANK","a",7,4); break;
                        case 76:controller.initializeButton(button[i],"BLANK","a",7,6); break;
                        case 78:controller.initializeButton(button[i],"BLANK","a",7,8); break;
                    }
                    button[i].setbuttonsPiece(new BLANK());
                    button[i].setIcon(getImageBack());
                    button[i].setCanBePressed(false);
                    button[i].setCanBeAttacked(true);
                    button[i].setPlayer(3);
                }
                else if (i==32||i==33||i==43||i==42||i==37||i==36||i==47||i==46) {
                    button[i].setIcon(getImageBack2());
                    button[i].setCanBePressed(false);
                    button[i].setCanBeAttacked(false);
                    button[i].setPlayer(3);

                } else { // init background
                    switch(i)
                    {
                        case 30:controller.initializeButton(button[i],"BLANK","a",3,0); break;
                        case 31:controller.initializeButton(button[i],"BLANK","a",3,1); break;
                        case 40:controller.initializeButton(button[i],"BLANK","a",4,0); break;
                        case 41:controller.initializeButton(button[i],"BLANK","a",4,1); break;
                        case 34:controller.initializeButton(button[i],"BLANK","a",3,4); break;
                        case 35:controller.initializeButton(button[i],"BLANK","a",3,5); break;
                        case 44:controller.initializeButton(button[i],"BLANK","a",4,4); break;
                        case 45:controller.initializeButton(button[i],"BLANK","a",4,5); break;
                        case 38:controller.initializeButton(button[i],"BLANK","a",3,8); break;
                        case 39:controller.initializeButton(button[i],"BLANK","a",3,9); break;
                        case 48:controller.initializeButton(button[i],"BLANK","a",4,8); break;
                        case 49:controller.initializeButton(button[i],"BLANK","a",4,9); break;
                    }
                    button[i].setbuttonsPiece(new BLANK());
                    button[i].setIcon(getImageBack());
                    button[i].setCanBePressed(false);
                    button[i].setPlayer(3);
                }
                button[i].setBorder(BorderFactory.createLineBorder(Color.black));
                button[i].addMouseListener(cl);
                panel.add(button[i]);
            }
            controller.hideButtons();
            add(panel);
            iconSelected = false;
        } else if (answer == JOptionPane.NO_OPTION) {
            for (int i = 0; i < 80; i++) {

                //JButton b = new JButton();
                button[i]=new Button();
                button[i].addMouseListener(pLis);
                if(i<30)
                {
                    switch(i)
                    {

                        case 0:  controller.initializeButton(button[i],"Flag","red",0,0); break;
                        case 1:  controller.initializeButton(button[i],"Trap","red",0,1); break;
                        case 2:  controller.initializeButton(button[i],"Dragon","red",0,2); break;
                        case 3:  controller.initializeButton(button[i],"LavaBeast","red",0,3); break;
                        case 4:  controller.initializeButton(button[i],"Trap","red",0,4); break;
                        case 5:  controller.initializeButton(button[i],"Knight","red",0,5); break;
                        case 6:  controller.initializeButton(button[i],"BeastRider","red",0,6); break;
                        case 7:  controller.initializeButton(button[i],"Trap","red",0,7); break;
                        case 8:  controller.initializeButton(button[i],"Scout","red",0,8); break;
                        case 9:  controller.initializeButton(button[i],"Dwarf","red",0,9); break;
                        case 10: controller.initializeButton(button[i],"Scout","red",1,0); break;
                        case 11: controller.initializeButton(button[i],"Sorceress","red",1,1); break;
                        case 12: controller.initializeButton(button[i],"Trap","red",1,2); break;
                        case 13: controller.initializeButton(button[i],"BeastRider","red",1,3); break;
                        case 14: controller.initializeButton(button[i],"Dwarf","red",1,4); break;
                        case 15: controller.initializeButton(button[i],"Dwarf","red",1,5); break;
                        case 16: controller.initializeButton(button[i],"BeastRider","red",1,6); break;
                        case 17: controller.initializeButton(button[i],"Mage","red",1,7); break;
                        case 18: controller.initializeButton(button[i],"Elf","red",1,8); break;
                        case 19: controller.initializeButton(button[i],"Dwarf","red",1,9); break;
                        case 20: controller.initializeButton(button[i],"Scout","red",2,0); break;
                        case 21: controller.initializeButton(button[i],"Trap","red",2,1); break;
                        case 22: controller.initializeButton(button[i],"Slayer","red",2,2); break;
                        case 23: controller.initializeButton(button[i],"Knight","red",2,3); break;
                        case 24: controller.initializeButton(button[i],"Trap","red",2,4); break;
                        case 25: controller.initializeButton(button[i],"Sorceress","red",2,5); break;
                        case 26: controller.initializeButton(button[i],"Dwarf","red",2,6); break;
                        case 27: controller.initializeButton(button[i],"Scout","red",2,7); break;
                        case 28: controller.initializeButton(button[i],"LavaBeast","red",2,8); break;
                        case 29: controller.initializeButton(button[i],"Elf","red",2,9); break;
                    }
                    button[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    button[i].setCanBePressed(true);
                    button[i].setCanBeAttacked(true);
                    button[i].addMouseListener(cl);
                    button[i].setName(cardname);
                    button[i].setPlayer(1);
                    panel.add(button[i]);
                }
                //buttons for blue player
                else if (i>=50 )
                {
                    switch(i)
                    {
                        case 50:controller.initializeButton(button[i],"BeastRider","blue",5,0);button[i].setXcoordinates(5);button[i].setYcoordinates(0); break;
                        case 51:controller.initializeButton(button[i],"Scout","blue",5,1);button[i].setXcoordinates(5);button[i].setYcoordinates(1); break;
                        case 52:controller.initializeButton(button[i],"Trap","blue",5,2);button[i].setXcoordinates(5);button[i].setYcoordinates(2); break;
                        case 53:controller.initializeButton(button[i],"Sorceress","blue",5,3);button[i].setXcoordinates(5);button[i].setYcoordinates(3); break;
                        case 54:controller.initializeButton(button[i],"Elf","blue",5,4);button[i].setXcoordinates(5);button[i].setYcoordinates(4); break;
                        case 55:controller.initializeButton(button[i],"Scout","blue",5,5);button[i].setXcoordinates(5);button[i].setYcoordinates(5); break;
                        case 56:controller.initializeButton(button[i],"Dwarf","blue",5,6);button[i].setXcoordinates(5);button[i].setYcoordinates(6); break;
                        case 57:controller.initializeButton(button[i],"Dwarf","blue",5,7);button[i].setXcoordinates(5);button[i].setYcoordinates(7); break;
                        case 58:controller.initializeButton(button[i],"Dwarf","blue",5,8);button[i].setXcoordinates(5);button[i].setYcoordinates(8); break;
                        case 59:controller.initializeButton(button[i],"Yeti","blue",5,9);button[i].setXcoordinates(5);button[i].setYcoordinates(9); break;
                        case 60:controller.initializeButton(button[i],"BeastRider","blue",6,0);button[i].setXcoordinates(6);button[i].setYcoordinates(0); break;
                        case 61:controller.initializeButton(button[i],"Slayer","blue",6,1);button[i].setXcoordinates(6);button[i].setYcoordinates(1); break;
                        case 62:controller.initializeButton(button[i],"Trap","blue",6,2);button[i].setXcoordinates(6);button[i].setYcoordinates(2); break;
                        case 63:controller.initializeButton(button[i],"Dragon","blue",6,3);button[i].setXcoordinates(6);button[i].setYcoordinates(3); break;
                        case 64:controller.initializeButton(button[i],"BeastRider","blue",6,4);button[i].setXcoordinates(6);button[i].setYcoordinates(4); break;
                        case 65:controller.initializeButton(button[i],"Scout","blue",6,5);button[i].setXcoordinates(6);button[i].setYcoordinates(5); break;
                        case 66:controller.initializeButton(button[i],"Trap","blue",6,6);button[i].setXcoordinates(6);button[i].setYcoordinates(6); break;
                        case 67:controller.initializeButton(button[i],"Scout","blue",6,7);button[i].setXcoordinates(6);button[i].setYcoordinates(7); break;
                        case 68:controller.initializeButton(button[i],"Knight","blue",6,8);button[i].setXcoordinates(6);button[i].setYcoordinates(8); break;
                        case 69:controller.initializeButton(button[i],"Mage","blue",6,9);button[i].setXcoordinates(6);button[i].setYcoordinates(9); break;
                        case 70:controller.initializeButton(button[i],"Sorceress","blue",7,0);button[i].setXcoordinates(7);button[i].setYcoordinates(0); break;
                        case 71:controller.initializeButton(button[i],"Dwarf","blue",7,1);button[i].setXcoordinates(7);button[i].setYcoordinates(1); break;
                        case 72:controller.initializeButton(button[i],"Elf","blue",7,2);button[i].setXcoordinates(7);button[i].setYcoordinates(2); break;
                        case 73:controller.initializeButton(button[i],"Trap","blue",7,3);button[i].setXcoordinates(7);button[i].setYcoordinates(3); break;
                        case 74:controller.initializeButton(button[i],"Dwarf","blue",7,4);button[i].setXcoordinates(7);button[i].setYcoordinates(4); break;
                        case 75:controller.initializeButton(button[i],"Yeti","blue",7,5);button[i].setXcoordinates(7);button[i].setYcoordinates(5); break;
                        case 76:controller.initializeButton(button[i],"Trap","blue",7,6);button[i].setXcoordinates(7);button[i].setYcoordinates(6); break;
                        case 77:controller.initializeButton(button[i],"Knight","blue",7,7);button[i].setXcoordinates(7);button[i].setYcoordinates(7); break;
                        case 78:controller.initializeButton(button[i],"Trap","blue",7,8);button[i].setXcoordinates(7);button[i].setYcoordinates(8); break;
                        case 79:controller.initializeButton(button[i],"Flag","blue",7,9);button[i].setXcoordinates(7);button[i].setYcoordinates(9); break;
                    }
                    button[i].setPlayer(2);
                    button[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    button[i].setCanBePressed(true);
                    button[i].setCanBeAttacked(true);
                    button[i].addMouseListener(cl);
                    button[i].setName(cardname);
                    panel.add(button[i]);

                } else if (i==32||i==33||i==43||i==42||i==37||i==36||i==47||i==46) {
                    button[i].setIcon(getImageBack2());
                    button[i].setCanBePressed(false);
                    button[i].setCanBeAttacked(false);
                    button[i].setPlayer(3);

                } else { // init background
                    switch(i)
                    {
                        case 30:controller.initializeButton(button[i],"BLANK","a",3,0); break;
                        case 31:controller.initializeButton(button[i],"BLANK","a",3,1); break;
                        case 40:controller.initializeButton(button[i],"BLANK","a",4,0); break;
                        case 41:controller.initializeButton(button[i],"BLANK","a",4,1); break;
                        case 34:controller.initializeButton(button[i],"BLANK","a",3,4); break;
                        case 35:controller.initializeButton(button[i],"BLANK","a",3,5); break;
                        case 44:controller.initializeButton(button[i],"BLANK","a",4,4); break;
                        case 45:controller.initializeButton(button[i],"BLANK","a",4,5); break;
                        case 38:controller.initializeButton(button[i],"BLANK","a",3,8); break;
                        case 39:controller.initializeButton(button[i],"BLANK","a",3,9); break;
                        case 48:controller.initializeButton(button[i],"BLANK","a",4,8); break;
                        case 49:controller.initializeButton(button[i],"BLANK","a",4,9); break;
                    }
                    button[i].setbuttonsPiece(new BLANK());
                    button[i].setIcon(getImageBack());
                    button[i].setCanBePressed(false);
                    button[i].setPlayer(3);
                }
                button[i].setBorder(BorderFactory.createLineBorder(Color.black));
                button[i].addMouseListener(cl);
                panel.add(button[i]);
            }
            controller.hideButtons();
            add(panel);
            iconSelected = false;
        }else {
            System.exit(0);
        }
        InfoMenu wow=new InfoMenu();
    }

    private ImageIcon getImageBack() { // image for background
        try {
            return new ImageIcon(ImageIO.read(getClass().getResource("./images/bluePieces/Empty.png"))); // image
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    private ImageIcon getImageBack2( ) { // image for background
        try {
            return new ImageIcon(ImageIO.read(getClass().getResource("./images/RedPieces/Black.png"))); // image
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private ImageIcon getImageCard() { // image for card
        try {

            return new ImageIcon(ImageIO.read(getClass().getResource("./images/bluePieces/beastRiderB.png"))
                    .getScaledInstance(100, 80, Image.SCALE_SMOOTH)); // image
        } catch (IOException ex) {
            Logger.getLogger(MovePiece.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private class CardListener implements MouseListener {


        @Override
        public void mouseClicked(MouseEvent e) {

            Button but = ((Button) e.getSource());

            //startButt is the button the player wants to move to
            if (iconSelected && !but.equals(selectedButton)) { // move(swap) buttons
                controller.setendturn(false);
                button1= (Button) selectedButton;
                if(button1.getCanBePressed()){

                if (controller.MoveValidity(button1, but)==true) {
                    int result = controller.Attack(button1, but);
                    if (result == 1)
                        but.setIcon(selectedButton.getIcon());
                    but.setName(cardname);
                    // but.setBorder(BorderFactory.createLineBorder(Color.YELLOW,5));
                    selectedButton.setIcon(getImageBack());
                    selectedButton.setBorder(BorderFactory.createLineBorder(Color.black));
                    selectedButton.setName(null);
                    selectedButton = but;
                    iconSelected = false;
                    controller.nextTurn();
                    controller.hideButtons();
                }else{
                        button1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                        but.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                        iconSelected=false;
                    }


                }else{
                    //OUSIASTIKA AN eimai o paikths pou den exei seira den exo diakaivma na kounh8o
                    button1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    but.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    iconSelected=false;
                }
                } else if (!iconSelected && but.getName() != null) { // if not selected icon is joker then select
                    iconSelected = true; // we can do without it, we can check for null selected button
                    selectedButton = but;
                    but.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
                } else { // if already selected or not selected at all
                    if (iconSelected) {
                        System.out.println("Already Selected");
                    } else {

                    }
                }
            }
        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    public static String cardname = "My Card";

    public static void main(String[] args) throws IOException {
        MovePiece view = new MovePiece(); // create window (jframe)
        view.setSize(500, 500);
        // view.pack();
        view.setVisible(true);

    }

    public static class InfoMenu extends JFrame{
        private JPanel MainPanel;
        private JTextField roundTextField;
        private JTextField lessArmyModeTextField;
        private JTextField attackPercentageTextField;
        private JButton button1;
        private JButton button2;
        private JButton button3;
        private JButton button4;
        private JButton button5;
        private JButton button6;
        private JButton button7;
        private JButton button8;
        private JButton button9;
        private JTextField amountOfCapturedPiecesTextField;
        private JTextField PLAYERTURNTextField;
        public InfoMenu(){
            setContentPane(MainPanel);
          setTitle("MENU");
          setSize(450,1000);
          setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          setVisible(true);
        }
    }
}