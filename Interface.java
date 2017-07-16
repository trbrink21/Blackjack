/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Interface.java
 *
 * Created on Apr 6, 2014, 7:50:10 PM
 */
package my.projectinterface;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author Tyler, Alycia, Darwin
 */
public class Interface extends javax.swing.JFrame {
    
    
    //declaration of variables used in C/S
    public static String [][] playersHand = {{"null","null","null","null","null"},{"null","null","null","null","null"},{"null","null","null","null","null"},{"null","null","null","null","null"},{"null","null","null","null","null"},{"null","null","null","null","null"},{"null","null","null","null","null"},{"null","null","null","null","null"}};
    public static double [][] playersCoin = {{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0}};
    public static double [][] resetCoin = {{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0}};
    public static String [][] resetHand = {{"null","null","null","null","null"},{"null","null","null","null","null"},{"null","null","null","null","null"},{"null","null","null","null","null"},{"null","null","null","null","null"},{"null","null","null","null","null"},{"null","null","null","null","null"},{"null","null","null","null","null"}};
    public static int buttonNum = -1;
    boolean  allPlayersDone = false;
    public static String player,card;
    public static int cardBeingPlayed;
    public static String playerTotal;
         
    /** Creates new form Interface */
    public Interface() {
        initComponents();
        
        //Give the form a dark green background
        this.getContentPane().setBackground(new Color(24, 112, 0));
       
               
        
        //Loop to iterate through array to find every value for every player
         for(int i =0;i<8;i++){
            for(int j=0;j<5;j++){
                if(!(playersHand[i][j].equals("null"))){
                    System.out.println("Send to interface method: ");
                    System.out.println("Player " + (i+1) + " CardNum: " + (j+1) + " Card: " + playersHand[i][j] + " Player's Total: " + playersCoin[i][0]);
                    player = String.valueOf("player " + (i+1));
                    card = playersHand[i][j];
                    cardBeingPlayed = (j+1);
                    playerTotal = playersCoin[i][0] + "";
                    
                    
                     
         //Displays the card image for each player in their appropriate card slot            
         if(cardBeingPlayed == 1)
          {
          if(player.equals("player 1")){
               if(card.equals("ace spade")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                   }
               if(card.equals("two spade")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                   }
               if(card.equals("three spade")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                  }
               if(card.equals("four spade")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                   }
               if(card.equals("five spade")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                   }
               if(card.equals("six spade")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                   }
               if(card.equals("seven spade")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                   }
               if(card.equals("eight spade")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                   }
               if(card.equals("nine spade")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                   }
               if(card.equals("ten spade")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                   }
               if(card.equals("jack spade")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                   }
              if(card.equals("queen spade")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                   }
               if(card.equals("king spade")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                   }
               if(card.equals("ace club")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                   }
               if(card.equals("two club")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                   }
               if(card.equals("three club")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                   }
               if(card.equals("four club")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                   }
               if(card.equals("five club")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                   }
               if(card.equals("six club")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                   }
               if(card.equals("seven club")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                   }
               if(card.equals("eight club")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                   }
               if(card.equals("nine club")){
                  Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                   }
              if(card.equals("ten club")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                   }
              if(card.equals("jack club")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                   }
               if(card.equals("queen club")){
                   Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                   }
                if(card.equals("king club")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 2"))
           {
                if(card.equals("ace spade")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 3"))
           {
                if(card.equals("ace spade")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 4"))
           {
                if(card.equals("ace spade")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 5"))
           {
                if(card.equals("ace spade")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player5Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 6"))
           {
                if(card.equals("ace spade")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player6Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 7"))
           {
                if(card.equals("ace spade")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player7Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
          }
           
           //if(cardBeingPlayed == 2)
           //{
           if(player.equals("player 1")){
                if(card.equals("ace spade")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 2"))
           {
                if(card.equals("ace spade")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 3"))
           {
                if(card.equals("ace spade")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 4"))
           {
                if(card.equals("ace spade")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 5"))
           {
                if(card.equals("ace spade")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player5Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 6"))
           {
                if(card.equals("ace spade")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player6Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 7"))
           {
                if(card.equals("ace spade")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player7Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
    //}
           
           if(cardBeingPlayed == 3)
           {
           if(player.equals("player 1")){
                if(card.equals("ace spade")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player1Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 2"))
           {
                if(card.equals("ace spade")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player2Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 3"))
           {
                if(card.equals("ace spade")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player3Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 4"))
           {
                if(card.equals("ace spade")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player4Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 5"))
           {
                if(card.equals("ace spade")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player5Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 6"))
           {
                if(card.equals("ace spade")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player6Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           if(player.equals("player 7"))
           {
                if(card.equals("ace spade")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    Player7Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }}
           
           
           if(player.equals("player 8"))
           {
                DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/back.jpg")));
           
                if(card.equals("ace spade")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           }
           
           if(allPlayersDone==(true))
           {
                if(card.equals("ace spade")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           
           
                if(card.equals("ace spade")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceSpades.jpg")));
                    }
                if(card.equals("two spade")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoSpades.jpg")));
                    }
                if(card.equals("three spade")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeSpades.jpg")));
                    }
                if(card.equals("four spade")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourSpades.jpg")));
                    }
                if(card.equals("five spade")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveSpades.jpg")));
                    }
                if(card.equals("six spade")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixSpades.jpg")));
                    }
                if(card.equals("seven spade")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenSpades.jpg")));
                    }
                if(card.equals("eight spade")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightSpades.jpg")));
                    }
                if(card.equals("nine spade")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineSpades.jpg")));
                    }
                if(card.equals("ten spade")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenSpades.jpg")));
                    }
                if(card.equals("jack spade")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackSpades.jpg")));
                    }
                if(card.equals("queen spade")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenSpades.jpg")));
                    }
                if(card.equals("king spade")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingSpades.jpg")));
                    }
                if(card.equals("ace club")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceClubs.jpg")));
                    }
                if(card.equals("two club")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoClubs.jpg")));
                    }
                if(card.equals("three club")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeClubs.jpg")));
                    }
                if(card.equals("four club")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourClubs.jpg")));
                    }
                if(card.equals("five club")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveClubs.jpg")));
                    }
                if(card.equals("six club")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixClubs.jpg")));
                    }
                if(card.equals("seven club")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenClubs.jpg")));
                    }
                if(card.equals("eight club")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightClubs.jpg")));
                    }
                if(card.equals("nine club")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineClubs.jpg")));
                    }
                if(card.equals("ten club")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenClubs.jpg")));
                    }
                if(card.equals("jack club")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackClubs.jpg")));
                    }
                if(card.equals("queen club")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenClubs.jpg")));
                    }
                if(card.equals("king club")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingClubs.jpg")));
                    }
                if(card.equals("ace heart")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceHearts.jpg")));
                    }
                if(card.equals("two heart")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoHearts.jpg")));
                    }
                if(card.equals("three heart")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeHearts.jpg")));
                    }
                if(card.equals("four heart")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourHearts.jpg")));
                    }
                if(card.equals("five heart")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveHearts.jpg")));
                    }
                if(card.equals("six heart")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixHearts.jpg")));
                    }
                if(card.equals("seven heart")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenHearts.jpg")));
                    }
                if(card.equals("eight heart")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightHearts.jpg")));
                    }
                if(card.equals("nine heart")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineHearts.jpg")));
                    }
                if(card.equals("ten heart")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenHearts.jpg")));
                    }
                if(card.equals("jack heart")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackHearts.jpg")));
                    }
                if(card.equals("queen heart")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenHearts.jpg")));
                    }
                if(card.equals("king heart")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingHearts.jpg")));
                    }
                if(card.equals("ace diamond")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/aceDiamonds.jpg")));
                    }
                if(card.equals("two diamond")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/twoDiamonds.jpg")));
                    }
                if(card.equals("three diamond")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/threeDiamonds.jpg")));
                    }
                if(card.equals("four diamond")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fourDiamonds.jpg")));
                    }
                if(card.equals("five diamond")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/fiveDiamonds.jpg")));
                    }
                if(card.equals("six diamond")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sixDiamonds.jpg")));
                    }
                if(card.equals("seven diamond")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/sevenDiamonds.jpg")));
                    }
                if(card.equals("eight diamond")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/eightDiamonds.jpg")));
                    }
                if(card.equals("nine diamond")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/nineDiamonds.jpg")));
                    }
                if(card.equals("ten diamond")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/tenDiamonds.jpg")));
                    }
                if(card.equals("jack diamond")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/jackDiamonds.jpg")));
                    }
                if(card.equals("queen diamond")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/queenDiamonds.jpg")));
                    }
                if(card.equals("king diamond")){
                    DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/projectinterface/images/kingDiamonds.jpg")));
                    }
           
                
           }
                
       }  
               
            }
        }
        
       
        
    }
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StartButton = new javax.swing.JButton();
        QuitButton = new javax.swing.JButton();
        HitButton = new javax.swing.JButton();
        StayButton = new javax.swing.JButton();
        Player1Label = new javax.swing.JLabel();
        Player2Label = new javax.swing.JLabel();
        Player3Label = new javax.swing.JLabel();
        Player4Label = new javax.swing.JLabel();
        Player5Label = new javax.swing.JLabel();
        Player6Label = new javax.swing.JLabel();
        Player7Label = new javax.swing.JLabel();
        Player1Card1 = new javax.swing.JLabel();
        Player1Card2 = new javax.swing.JLabel();
        Player2Card1 = new javax.swing.JLabel();
        Player2Card2 = new javax.swing.JLabel();
        Player3Card1 = new javax.swing.JLabel();
        Player3Card2 = new javax.swing.JLabel();
        Player4Card1 = new javax.swing.JLabel();
        Player4Card2 = new javax.swing.JLabel();
        Player5Card1 = new javax.swing.JLabel();
        Player5Card2 = new javax.swing.JLabel();
        Player6Card1 = new javax.swing.JLabel();
        Player7Card1 = new javax.swing.JLabel();
        Player7Card2 = new javax.swing.JLabel();
        Player6Card2 = new javax.swing.JLabel();
        Player1Card3 = new javax.swing.JLabel();
        Player2Card3 = new javax.swing.JLabel();
        Player3Card3 = new javax.swing.JLabel();
        Player4Card3 = new javax.swing.JLabel();
        Player5Card3 = new javax.swing.JLabel();
        Player6Card3 = new javax.swing.JLabel();
        Player7Card3 = new javax.swing.JLabel();
        DealerLabel = new javax.swing.JLabel();
        Player1Bet = new javax.swing.JLabel();
        Player2Bet = new javax.swing.JLabel();
        Player3Bet = new javax.swing.JLabel();
        Player4Bet = new javax.swing.JLabel();
        Player5Bet = new javax.swing.JLabel();
        Player6Bet = new javax.swing.JLabel();
        Player7Bet = new javax.swing.JLabel();
        Player1Total = new javax.swing.JLabel();
        Player2Total = new javax.swing.JLabel();
        Player3Total = new javax.swing.JLabel();
        Player4Total = new javax.swing.JLabel();
        Player5Total = new javax.swing.JLabel();
        Player6Total = new javax.swing.JLabel();
        Player7Total = new javax.swing.JLabel();
        DealerCard1 = new javax.swing.JLabel();
        DealerCard2 = new javax.swing.JLabel();
        DealerCard3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        QuitButton.setText("Quit");
        QuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButtonActionPerformed(evt);
            }
        });

        HitButton.setText("Hit");
        HitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitButtonActionPerformed(evt);
            }
        });

        StayButton.setText("Stay");
        StayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StayButtonActionPerformed(evt);
            }
        });

        Player1Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Player1Label.setText("Player 1");

        Player2Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Player2Label.setText("Player 2");

        Player3Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Player3Label.setText("Player 3");

        Player4Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Player4Label.setText("Player 4");

        Player5Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Player5Label.setText("Player 5");

        Player6Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Player6Label.setText("Player 6");

        Player7Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Player7Label.setText("Player 7");

        DealerLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DealerLabel.setText("Dealer");

        Player1Bet.setText("-");

        Player2Bet.setText("-");

        Player3Bet.setText("-");

        Player4Bet.setText("-");

        Player5Bet.setText("-");

        Player6Bet.setText("-");

        Player7Bet.setText("-");

        Player1Total.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        Player1Total.setText("-");

        Player2Total.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        Player2Total.setText("-");

        Player3Total.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        Player3Total.setText("-");

        Player4Total.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        Player4Total.setText("-");

        Player5Total.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        Player5Total.setText("-");

        Player6Total.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        Player6Total.setText("-");

        Player7Total.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        Player7Total.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Player6Card1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player6Card2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player6Card3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Player6Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player6Total)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(Player5Bet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(Player5Card1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Player5Card2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Player5Card3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(344, 344, 344)
                                .addComponent(Player5Label)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player5Total)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                        .addComponent(Player4Bet)
                        .addGap(155, 155, 155)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Player3Card1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player3Card2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player3Card3)
                        .addGap(210, 210, 210))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Player3Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player3Total)
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Player3Bet)
                        .addGap(268, 268, 268))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Player2Card1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Player2Card2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Player2Card3)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Player2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Player2Total)
                .addGap(99, 99, 99))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(QuitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(StayButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HitButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Player7Bet)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(Player7Card1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player7Card2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player7Card3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(Player7Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player7Total))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(Player6Bet)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 525, Short.MAX_VALUE)
                .addComponent(DealerCard1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DealerCard2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Player1Bet)
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Player2Bet)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Player1Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Player1Total)))
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Player4Card1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Player4Card2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Player4Card3))
                            .addComponent(Player4Label)
                            .addComponent(DealerLabel)
                            .addComponent(DealerCard3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player4Total)
                        .addGap(372, 372, 372))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Player1Card1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Player1Card2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Player1Card3)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StartButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QuitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HitButton)
                            .addComponent(DealerLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DealerCard3)
                                .addComponent(DealerCard1)
                                .addComponent(DealerCard2))
                            .addComponent(StayButton))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Player1Bet)
                                    .addComponent(Player7Bet))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Player7Label)
                                    .addComponent(Player1Label)
                                    .addComponent(Player1Total)
                                    .addComponent(Player7Total))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Player7Card1)
                                    .addComponent(Player7Card2)
                                    .addComponent(Player7Card3)
                                    .addComponent(Player1Card3)
                                    .addComponent(Player1Card2)
                                    .addComponent(Player1Card1))
                                .addGap(44, 44, 44)
                                .addComponent(Player2Bet))
                            .addComponent(Player6Bet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Player6Label)
                                    .addComponent(Player6Total))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Player6Card1)
                                    .addComponent(Player6Card2)
                                    .addComponent(Player6Card3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Player2Label)
                                    .addComponent(Player2Total))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Player2Card1)
                                    .addComponent(Player2Card2)
                                    .addComponent(Player2Card3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Player3Bet)
                            .addComponent(Player5Bet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Player5Label)
                            .addComponent(Player3Label)
                            .addComponent(Player3Total)
                            .addComponent(Player5Total))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Player5Card1)
                            .addComponent(Player5Card2)
                            .addComponent(Player5Card3)
                            .addComponent(Player3Card1)
                            .addComponent(Player3Card2)
                            .addComponent(Player3Card3))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Player4Bet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player4Label)
                    .addComponent(Player4Total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player4Card1)
                    .addComponent(Player4Card2)
                    .addComponent(Player4Card3))
                .addGap(139, 139, 139))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitButtonActionPerformed
        // TODO add your handling code here:
        //Value given to buttonNum for "Hit" option
        buttonNum = 0;
        
    }//GEN-LAST:event_HitButtonActionPerformed

    private void StayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StayButtonActionPerformed
        // TODO add your handling code here:
        //Value given to buttonNum for "Stay" option
        buttonNum = 1;
    }//GEN-LAST:event_StayButtonActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        // TODO add your handling code here:
        //Value given to buttonNum for "Start" option
        buttonNum = 2;
    }//GEN-LAST:event_StartButtonActionPerformed

    private void QuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButtonActionPerformed
        // TODO add your handling code here:
        //Value given to buttonNum for "Quit" option
        buttonNum = 3;
    }//GEN-LAST:event_QuitButtonActionPerformed

    
    
    /**
     * The main method where the run interface and client code are located
     * Client code allows communication with server
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Interface().setVisible(true);
                
                
            }
        });
        
        //Code to connect each client to the server
                String host = "10.134.217.19";
                int port = 8888;
                boolean loop=true,game=true,haveBet=false;
                
                try 
                { 
                    //System.out.println(InetAddress.getLocalHost());
                    Socket socket = new Socket(host, port);
                    PrintWriter send = new PrintWriter(socket.getOutputStream(), true);
                    BufferedReader read = new BufferedReader( new InputStreamReader(socket.getInputStream()));
                    BufferedReader stdIn =new BufferedReader(new InputStreamReader(System.in));
                    String fromServer, fromUser="" ;
                    while (game) {              
                        boolean timeOut = true;                        
                        if((fromServer = read.readLine()) != null){
                            //change boolean value for button and let player play
                            //enable button for users turn
                            if(fromServer.equals("update")){
                                 System.out.println("inside update");
                                 if((fromServer = read.readLine())!=null){
                                     System.out.println("Server: " + fromServer);
                                     useUpdate(fromServer);
                                 }
                             }else if(fromServer.equals("true")){                        
                                System.out.println("true: "+ buttonNum);
                                if(!haveBet){
                                    System.out.println("making bet");
                                    send.println("50");
                                    haveBet = true;
                                }                                
                                loop=true;
                                long startTime = System.currentTimeMillis();
                                long endWait = startTime + 6000;
                                while((startTime<endWait) && loop){                            
                                        //Receive buttonNum value for another card
                                        if(buttonNum == 0)
                                        {
                                           fromUser = "Card";
                                            send.println(fromUser);
                                            buttonNum = -1;
                                            loop=false;
                                            timeOut=false;
                                        }
                                        //Receive buttonNum value to end turn
                                        else if(buttonNum == 1)
                                        {
                                            fromUser = "Hold";
                                            send.println(fromUser);
                                            buttonNum = -1;
                                            loop=false;
                                            timeOut = false;
                                        }
                                    
                                }
                                if(timeOut){
                                    fromUser = "Hold";
                                    send.println(fromUser);
                                    buttonNum = -1;
                                    loop=false;
                                    timeOut = false;
                                }
                             }//after game ends the player says if staying
                            else if(fromServer.equals("true keep playing")){
                                System.out.println("Server: " + fromServer);
                                //Receive buttonNum value to start game
                                loop=true;
                                long startTime = System.currentTimeMillis();
                                long endWait = startTime + 60000;
                                while((startTime<endWait) && loop){  
                                        if(buttonNum == 2)
                                        {
                                            fromUser = "Again";
                                            send.println(fromUser);
                                            buttonNum = -1;
                                            loop = false;
                                            playersHand = resetHand;
                                            playersCoin = resetCoin;
                                            timeOut = false;
                                        }
                                        //Receive buttonNum value to quit game
                                        else if(buttonNum == 3)
                                        {
                                            fromUser = "Exit";
                                            send.println(fromUser);
                                            buttonNum = -1;
                                            loop = false;
                                            game = false;
                                            playersHand = resetHand;
                                            playersCoin = resetCoin;
                                            timeOut = false;
                                        }                                        
                                }
                                if(timeOut){
                                    fromUser = "Exit";
                                    send.println(fromUser);
                                    buttonNum = -1;
                                    loop=false;
                                    timeOut = false;
                                }
                             }else{
                                 System.out.println("Server: " + fromServer);
                                 
                            }
                        }     
                    }
                    socket.close();
                } catch (UnknownHostException e) {
                    System.err.println("host error e: " + e);
                    System.exit(1);
                } catch (IOException e) {
                    System.err.println("error e: " + e );
                    System.exit(1);
                }     

            
        
    }    
    
    /**
     * Splits the update sting from the message
     * @param update the string to be split
     */
    public static void useUpdate(String update){
        String localPlayer="";
        //t, tt, ss, and pla are counting variables
        int count=0,t=0,tt=0,ss=0,pla=0;
        
        System.out.println("");
        System.out.println("Return Value :" );
        for (String retval: update.split(" :: ")){
          //Splits player from other information
          for(String playerSplit: retval.split("Player ")){
              if(count!=0){
                //splits the cards from the player 
                for (String playerAndCardSplit: playerSplit.split(" card:")){
                    if(t==0){
                        localPlayer = playerAndCardSplit;
                        pla = Integer.parseInt(localPlayer);
                    }else{//splits money, total, and bets from the card
                        for (String value: playerAndCardSplit.split("-")){
                            if(tt==0){
                                for(String card: value.split(",")){
                                    if(ss!=0){
                                        playersHand[pla][ss-1]=card;
                                    }
                                    ss++;
                                }
                                ss=0;
                            } else if(tt==1){
                                playersCoin[pla][0]=Integer.parseInt(value);
                            }else if(tt==2){
                                playersCoin[pla][1]=Double.parseDouble(value);
                            }else if(tt==3){
                                playersCoin[pla][2]=Double.parseDouble(value);
                            }
                            tt++;
                        }
                        tt=0;
                    }
                    t++;
                }
                t=0;
              }
              count++;
          }
            count=0;
        }
    } 
                
        
    // Generated variables for the UI
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DealerCard1;
    private javax.swing.JLabel DealerCard2;
    private javax.swing.JLabel DealerCard3;
    private javax.swing.JLabel DealerLabel;
    private javax.swing.JButton HitButton;
    private javax.swing.JLabel Player1Bet;
    private javax.swing.JLabel Player1Card1;
    private javax.swing.JLabel Player1Card2;
    private javax.swing.JLabel Player1Card3;
    private javax.swing.JLabel Player1Label;
    private javax.swing.JLabel Player1Total;
    private javax.swing.JLabel Player2Bet;
    private javax.swing.JLabel Player2Card1;
    private javax.swing.JLabel Player2Card2;
    private javax.swing.JLabel Player2Card3;
    private javax.swing.JLabel Player2Label;
    private javax.swing.JLabel Player2Total;
    private javax.swing.JLabel Player3Bet;
    private javax.swing.JLabel Player3Card1;
    private javax.swing.JLabel Player3Card2;
    private javax.swing.JLabel Player3Card3;
    private javax.swing.JLabel Player3Label;
    private javax.swing.JLabel Player3Total;
    private javax.swing.JLabel Player4Bet;
    private javax.swing.JLabel Player4Card1;
    private javax.swing.JLabel Player4Card2;
    private javax.swing.JLabel Player4Card3;
    private javax.swing.JLabel Player4Label;
    private javax.swing.JLabel Player4Total;
    private javax.swing.JLabel Player5Bet;
    private javax.swing.JLabel Player5Card1;
    private javax.swing.JLabel Player5Card2;
    private javax.swing.JLabel Player5Card3;
    private javax.swing.JLabel Player5Label;
    private javax.swing.JLabel Player5Total;
    private javax.swing.JLabel Player6Bet;
    private javax.swing.JLabel Player6Card1;
    private javax.swing.JLabel Player6Card2;
    private javax.swing.JLabel Player6Card3;
    private javax.swing.JLabel Player6Label;
    private javax.swing.JLabel Player6Total;
    private javax.swing.JLabel Player7Bet;
    private javax.swing.JLabel Player7Card1;
    private javax.swing.JLabel Player7Card2;
    private javax.swing.JLabel Player7Card3;
    private javax.swing.JLabel Player7Label;
    private javax.swing.JLabel Player7Total;
    private javax.swing.JButton QuitButton;
    private javax.swing.JButton StartButton;
    private javax.swing.JButton StayButton;
    // End of variables declaration//GEN-END:variables

    

}