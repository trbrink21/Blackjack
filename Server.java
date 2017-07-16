/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.projectinterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 *
 * @author Alycia, Darwin, Tyler
 */
public class Server implements Runnable{
 
     //global variables for dealer
    public static int playerMax = 8,TOTALDECKS=4,DealerNum=7,startAmount=0;
    public static int count = 0,updateCount=0,peopleStaying=0,checkingOut=0,newStartAmount=0;
    public static boolean endOfGame=false, DealersTurn=true, gameStarted=false,begin=false;
    public static int [][] playerDone = {{1,1},{2,1},{3,1},{4,1},{5,1},{6,1},{7,1},{8,1}};
    //public static int player;
    public static String [] cardValue = {"ace","two","three","four","five","six","seven","eight","nine","ten","jack","queen","king"};
    public static String [] cardSuit = {"heart","diamond","spade","club"};
    //cards that were played
    public static String []playedCard = {"null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null"};
    //individual player hands
    public static String [][] player1Hand = {{"null","0"},{"null","0"},{"null","0"}};
    public static String [][] player2Hand = {{"null","0"},{"null","0"},{"null","0"}};
    public static String [][] player3Hand = {{"null","0"},{"null","0"},{"null","0"}};
    public static String [][] player4Hand = {{"null","0"},{"null","0"},{"null","0"}};
    public static String [][] player5Hand = {{"null","0"},{"null","0"},{"null","0"}};   
    public static String [][] player6Hand = {{"null","0"},{"null","0"},{"null","0"}};
    public static String [][] player7Hand = {{"null","0"},{"null","0"},{"null","0"}};
    //Dealers hand always number 8(which will be 7 in code)
    public static String [][] player8Hand = {{"null","0"},{"null","0"},{"null","0"}};   
    //reset hand
    public static String [][] resetHand = {{"null","0"},{"null","0"},{"null","0"}};
    //players total
    public static int [] playerTotal = {0,0,0,0,0,0,0,0};
    //array to hold the bets
    public static double [] bet = {0,0,0,0,0,0,0};
    //holds the players Money
    public static double [][] playerMoney = {{1,500},{2,500},{3,500},{4,500},{5,500},{6,500},{7,500},{8,500}};
    //message to be given to client
    public static String msg="",sendMsg="",player1msg="",player2msg="",player3msg="",player4msg="",player5msg="",player6msg="",player7msg="",DealerMsg="";
    public static int clientsConnected=0,maxClients=7;
    
    //client thread
    Socket client;
    Server(Socket client){
        this.client = client;
    }
    
    /**
    * Create the new player threads for a certain amount of time, then wait until a new
    * game has bee created
    */
    public static void main(String[] args){
               int port = 8888;
               long startTime = System.currentTimeMillis();
               long endWait = startTime + 30000; //30 is in seconds
               try { 
                   ServerSocket socket = new ServerSocket(port);
                   while(true){
                       //if a current game isn't playing already
                       if(!gameStarted){
                           //allow entry for a certain amount of time
                           while(System.currentTimeMillis()<endWait){
                               //if the there isn't a max player yet
                               if(clientsConnected<maxClients){
                                    Socket clientSocket = socket.accept();
                                    Server s = new Server(clientSocket);
                                    Thread thread = new Thread(s);
                                    thread.start();
                                    clientsConnected++;
                                    gameStarted=true;
                               }
                           }
                       }
                       if(clientsConnected==0){
                           gameStarted=false;                           
                       }
                   }
               } catch (IOException e) { 
                   System.out.println("error e: " + e);
               }
   }
    
    @Override
    public void run(){
        Socket localClient = client;
        System.out.println(localClient);        
          
        int playerNum = 0;        
        startAmount++;
        endOfGame = false;
        //assign each client its own player
        for(int i=0;i<playerMax;i++){
            if(playerDone[i][1]==1){
                playerNum = i;
                break;
            }
        }
        //sets the player to allow player to play
        playerDone[playerNum][1]=0;
        System.out.println("Player: " + playerDone[playerNum][0] + " is ready to play with " + playerDone[playerNum][1]);
        
        //try to play the game
        try{
            PrintWriter send =new PrintWriter(localClient.getOutputStream(), true);
            BufferedReader read = new BufferedReader(new InputStreamReader(localClient.getInputStream()));
            String input, output="You are Player " + String.valueOf(playerDone[playerNum][0]);
                   
            send.println(output);
            System.out.println("said hi");
            System.out.println("startAmount is: " + startAmount);
            boolean haveBet = false;
            //loop through the fubctions
            while (true) {
                    //if its the Dealers turn the dealer makes a move     
                     if(DealersTurn){
                            System.out.println("Dealers turn");
                            boolean checkCanGetCard = checkPlayersHand(DealerNum);
                               if(checkCanGetCard){
                                   if(14>=playerTotal[DealerNum]){
                                        getCard(DealerNum);
                                        saveInfo(msg,DealerNum);
                                   }
                               }                            
                            DealersTurn = false;
                            //seperate players easily with this
                           System.out.println("------------");
                      }//if all players are waiting for new game
                      else if (endOfGame){
                           System.out.println("in end of game");
                           if(count==playerNum){                               
                                    output = "true keep playing";
                                    send.println(output);
                                    if((input = read.readLine()) != null){
                                        if(playerTotal[playerNum]>0){
                                            System.out.println("waiting to leave");
                                            //player is leaving the game: reset player variables, close socket, & move to next player
                                            if(input.equalsIgnoreCase("Exit")){ 
                                                    System.out.println("Leaving");  
                                                    clientsConnected--;
                                                    count++;
                                                    playerDone[playerNum][1] = 1;
                                                    playerTotal[playerNum]=0;
                                                    setPlayersHand(resetHand,playerNum);
                                                    playerMoney[playerNum][1]=500;
                                                    localClient.close();
                                                    //break;
                                            }//player will play again: set player to lowest player possible
                                            else if(input.equalsIgnoreCase("Again")){
                                                    System.out.println("waiting for new game");
                                                    for(int i=0;i<playerDone.length;i++){
                                                       if((playerDone[i][1]==1)){
                                                           playerNum = i;
                                                           playerDone[playerNum][1]=0;
                                                           break;
                                                       } else if(i==playerNum){                                                           
                                                           playerDone[playerNum][1]=0;
                                                           break;
                                                       }else if ((i+1)==playerDone.length){
                                                           playerDone[playerNum][1]=0;
                                                       }
                                                    }
                                                    //empty the total & players hand, check betting outcome and signal player is playing again
                                                    playerTotal[playerNum]=0;
                                                    setPlayersHand(resetHand,playerNum);
                                                    if(bettingOutCome(playerNum)>0){                                                        
                                                        peopleStaying++;
                                                    } else{
                                                        System.out.println("Out of money sorry, goood bye");
                                                        playerDone[playerNum][1]=1;
                                                        localClient.close();
                                                    }
                                               }
                                        }
                                    }
                               updateCount++;
                               //if done checking all players to see if staying/leaving
                               if(updateCount==startAmount){                                  
                                   System.out.println("player should be updated"); 
                                   //if no one is staying resent counts       
                                   if(peopleStaying==0){
                                       count=0;
                                       startAmount=0;
                                       break;
                                   }
                                   //reset update messages to be blank, reset varaibles, let dealer know its his turn
                                    resetUpdate();
                                    playerTotal[DealerNum]=0;
                                    setPlayersHand(resetHand,DealerNum);                                    
                                    count=-1;
                                    startAmount=peopleStaying;
                                    updateCount=0;
                                    peopleStaying=0;
                                    System.out.println("start new game");                                       
                                    gameStarted=false;
                                    DealersTurn = true;
                                    endOfGame = false;
                               }
                               //loop through all players
                               count++;
                               if(count >= startAmount){
                                        count = 0;                          
                               }
                           }
                       }//if its the players turn
                      else if(count==playerNum){       
                               if(playerDone[playerNum][1]==0){                                    
                                    //update current player of previous move
                                    send.println("update");
                                    output = updateClient();    
                                    send.println(output);
                                    //tell client to enbevel buttons (change to false in client)
                                    send.println("true");                                    
                                    //if client talks to serverDealer
                                    if((input = read.readLine()) != null){
                                       if(!haveBet){
                                           System.out.println("bet: " + input);
                                           bet[playerNum]= Double.parseDouble(input);
                                           System.out.println("numerical bet: " + bet[playerNum]);
                                           input = read.readLine();
                                           haveBet = true;
                                       }
                                       System.out.println("Client said: " + input);
                                       //if the player doesnt want a card
                                       if(input.equalsIgnoreCase("Hold")){
                                           //player is no longer getting cards, and waits for end of game
                                           playerDone[playerNum][1] = 2;
                                           checkingOut++;
                                           if(checkingOut==startAmount){ 
                                               //if all the players are holding
                                                endOfGame=true;
                                           }
                                       }//if player wants a card
                                       else if(input.equalsIgnoreCase("Card")){
                                          boolean checkCanGetCard = checkPlayersHand(playerNum);
                                           if(checkCanGetCard){
                                             //get a card
                                             getCard(playerNum);
                                             saveInfo(msg,playerNum);
                                             //check total
                                             checkTotal(playerNum);
                                             //check next player
                                             playerNum = checkNextPlayer(playerNum);
                                           }else{
                                               System.out.println("player has max number of cards");
                                               playerDone[playerNum][1]=2;
                                           }
                                       }
                                       //seperate players easily with this
                                       System.out.println("------------");
                                    }
                                }//Client is waiting for the end of game
                                 else if(playerDone[playerNum][1]==2){
                                    System.out.println("waiting for end");
                               } 
                               //loop through all players
                                count++;
                                if(count >= startAmount){
                                    count = 0;
                                    DealersTurn=true;                            
                                }            
                        }  
                
                    //update every client with current cards
                    send.println("update");
                    output = updateClient();    
                    send.println(output);
                       
                    try{ 
                        //wait a tiny bit between updates
                        Thread.sleep(170);                        
                    }catch(InterruptedException e){
                        System.out.println("error " +e);
                    }                  
            }
        }catch(IOException e){
            //if client disconnects: player is done and goes to next player if need to
            //reset all information
            playerDone[playerNum][1]=1;
            playerTotal[playerNum]=0;
            setPlayersHand(resetHand,playerNum);
            playerMoney[playerNum][1]=500;
            bet[playerNum]=0;
            if(count==playerNum)
                count++;
            System.out.println("error e: " + e);
       } 
    }
    
    /**
     * 
     */
    public boolean checkPlayersHand(int playersNumber){
        boolean haveCard = false;
        if(playersNumber==0){
            if(player1Hand[2][0].equals("null"))
                haveCard = true;
        } else if(playersNumber==1){
            if(player2Hand[2][0].equals("null"))
                haveCard = true;
        }  else if(playersNumber==2){
            if(player3Hand[2][0].equals("null"))
                haveCard = true;
        }else if(playersNumber==3){
            if(player4Hand[2][0].equals("null"))
                haveCard = true;
        } else if(playersNumber==4){
            if(player5Hand[2][0].equals("null"))
                haveCard = true;
        } else if(playersNumber==5){
            if(player6Hand[2][0].equals("null"))
                haveCard = true;
        } else if(playersNumber==6){
            if(player7Hand[2][0].equals("null"))
                haveCard = true;
        } else if(playersNumber==7){
            if(player8Hand[2][0].equals("null"))
                haveCard = true;
        }
        return haveCard;
    }
    
    /**
     * Creates the string to send to update the clients, updates the string with current players hands
     * @return sendMsg  holds the update
     */
    public String updateClient(){
        sendMsg = "Player 7 card:"+DealerMsg +"-"+ String.valueOf(playerTotal[DealerNum])+"-"+String.valueOf(1)+"-"+String.valueOf(1);
        if(playerDone[0][1]!=1){
            sendMsg = sendMsg + " :: Player 0 card:" + player1msg + "-" + String.valueOf(playerTotal[0])+"-"+String.valueOf(playerMoney[0][1])+"-"+String.valueOf(bet[0]);
        }
        if(playerDone[1][1]!=1){
            sendMsg = sendMsg + " :: Player 1 card:" + player2msg + "-" + String.valueOf(playerTotal[1])+"-"+String.valueOf(playerMoney[1][1])+"-"+String.valueOf(bet[1]);
        }
        if(playerDone[2][1]!=1){
            sendMsg = sendMsg + " :: Player 2 card:" + player3msg + "-" + String.valueOf(playerTotal[2])+"-"+String.valueOf(playerMoney[2][1])+"-"+String.valueOf(bet[2]);
        }
        if(playerDone[3][1]!=1){
            sendMsg = sendMsg + " :: Player 3 card:" + player4msg + "-" + String.valueOf(playerTotal[3])+"-"+String.valueOf(playerMoney[3][1])+"-"+String.valueOf(bet[3]);
        }
        if(playerDone[4][1]!=1){
            sendMsg = sendMsg + " :: Player 4 card:" + player5msg + "-" + String.valueOf(playerTotal[4])+"-"+String.valueOf(playerMoney[4][1])+"-"+String.valueOf(bet[4]);
        }
        if(playerDone[5][1]!=1){
            sendMsg = sendMsg + " :: Player 5 card:" + player6msg + "-" + String.valueOf(playerTotal[5])+"-"+String.valueOf(playerMoney[5][1])+"-"+String.valueOf(bet[5]);
        }
        if(playerDone[6][1]!=1){
            sendMsg = sendMsg + " :: Player 6 card:" + player7msg + "-" + String.valueOf(playerTotal[6])+"-"+String.valueOf(playerMoney[6][1])+"-"+String.valueOf(bet[6]);
        }
        return sendMsg;
    }
    
    /**
     * Updates the individual player strings to update the clients when called in updateClient
     * @param str to be added to update string
     * @param num the players number
     */
    public void saveInfo(String str, int num){
        if(num==0){
            player1msg = player1msg + "," +str;
        } else if(num==1){
            player2msg = player2msg+ "," + str;
        }  else if(num==2){
            player3msg = player3msg+ "," + str;
        }else if(num==3){
            player4msg = player4msg+ "," + str;
        } else if(num==4){
            player5msg = player5msg+ "," + str;
        } else if(num==5){
            player6msg = player6msg+ "," + str;
        } else if(num==6){
            player7msg = player7msg+ "," +str;
        } else if(num==7){
            DealerMsg = DealerMsg+ "," + str;
        }
    } 
    
    /**
    * Wipes the messages for each player and the send update message
    * for the new game
    */
    public void resetUpdate(){
        sendMsg = " ";
        player1msg = "";
        player2msg = "";
        player3msg = "";
        player4msg = "";
        player5msg = "";
        player6msg = "";
        player7msg = "";
        DealerMsg="";
    }
    
    
    /**
     * Determines if the player should win money or lose according
     * to the dealers and their score and how much they bet, then updates 
     * players money accordingly
     * @param pl the player
     * @return the amount of money the player has left
     */
    public double bettingOutCome(int pl){
        //if dealer lost, player must have 21 or less to win 
        if(playerTotal[DealerNum]>21){
             if(playerTotal[pl]<21){
                 double add = bet[pl] * 2;
                 playerMoney[pl][1] = playerMoney[pl][1] + add;
             }else if(playerTotal[pl]==21){
                 double add = bet[pl] * 2.5;
                 playerMoney[pl][1] = playerMoney[pl][1] + add;
             }
         }//if dealer didn't lose, player must have had more and not over 21
        else if((playerTotal[DealerNum]<playerTotal[pl])&&(playerTotal[pl]<=21)){
                 double add = bet[pl] * 2;
                 playerMoney[pl][1] = playerMoney[pl][1] + add;            
         }else if(playerTotal[DealerNum]==playerTotal[pl]){
             System.out.println("player loses/wins nothing");
         }else{
                 playerMoney[pl][1] = playerMoney[pl][1] - bet[pl];
         }
        
        return playerMoney[pl][1];
    }
    
    
    /**
     * Method that get the next card to be dealt
     * and checks that the card hasn't been used before,
     * gives the card to the player and makes a new total
     * @param p
     */
    public static void getCard(int p){
        int player = p;
        Random rand = new Random();
        boolean badChoice;
        String possibleCard ="";
        int numOfDecks = 0;
         do{
            //get a randome card
            int possibleCardValue = rand.nextInt(13);
            int possibleCardSuit = rand.nextInt(4);
            possibleCard = cardValue[possibleCardValue] + " " + cardSuit[possibleCardSuit];
            badChoice = true;
            for (String temp : playedCard) {
                if(temp.equals(possibleCard)){
                    //multilpy by #of decks-can have one from each deck
                    numOfDecks++;
                    if(numOfDecks==TOTALDECKS){                     
                        badChoice = false;   
                    }
                }
            }                        
        }while(!badChoice);
        //add cards to hand and remove from possibily getting picked again
        for(int i=0;i<playedCard.length;i++){
            if(playedCard[i].equals("null")){
                playedCard[i] = possibleCard;
                break;
            }
        }
        //get players hand and update with new card, repeate for players total
        String [][] playersHand = getPlayersHand(player);
        for (String[] playerHand1 : playersHand) {
            if (playerHand1[0].equals("null")) {
                playerHand1[0] = possibleCard;
                //grab card value
                String point = cardPoint(possibleCard);
                playerHand1[1] = point;
                System.out.println("Player " + playerDone[player][0] +" got card: " + possibleCard + " with point: " + point);
                msg =  possibleCard;
                //get total 
                playerTotal[player] = playerTotal[player] + Integer.parseInt(point);
                System.out.println("Player " + playerDone[player][0] +" total: " + playerTotal[player]);
                break;
            }
        }
        //sets the new hand to the currents players hand
        setPlayersHand(playersHand,player);
    }
    
    /**
     * Finds the current players hand 
     * @param plyr the current player
     * @return the players hand
     */
    public static String [][]getPlayersHand(int plyr){
        String [][]personsHand = {{"null","0"}};
        if(plyr == 1){
            personsHand = player1Hand;
        }
        else if(plyr == 2){
            personsHand = player2Hand;
        }
        else if(plyr == 3){
            personsHand = player3Hand;
        }
        else if(plyr == 4){
            personsHand = player4Hand;
        }
        else if(plyr == 5){
            personsHand = player5Hand;
        }
        else if(plyr == 6){
            personsHand = player6Hand;
        }
        else if(plyr == 7){
            personsHand = player7Hand;
        }
        else if(plyr == 8){
            personsHand = player8Hand;
        }
        return personsHand;
    }
    
    /**
     * Sets the new hand to the player
     * @param personsHand the new hand
     * @param plyr the current player
     */
    public static void setPlayersHand(String [][]personsHand,int plyr){        
        if(plyr == 1){
            player1Hand = personsHand;
        }
        else if(plyr == 2){
            player2Hand = personsHand;
        }
        else if(plyr == 3){
            player3Hand = personsHand;
        }
        else if(plyr == 4){
            player4Hand = personsHand;
        }
        else if(plyr == 5){
            player5Hand = personsHand;
        }
        else if(plyr == 6){
            player6Hand = personsHand;
        }
        else if(plyr == 7){
            player7Hand = personsHand;
        }
        else if(plyr == 8){
            player8Hand = personsHand;
        }
    }
    
    /**
     * Checks the total of the player to see if they are still 
     * allowed in the game, or if they won. Also deals with changing
     * any ace in there hand to a value of 1 if there total is to high
     * @param p the player
     */
    public static void checkTotal(int p){
        int player = p;
        if(playerTotal[player] == 21){
            System.out.println("Player " + playerDone[player][0] +" won");
            playerDone[player][1]=1;
        }
        else if (playerTotal[player] > 21){
            //check card value and replace any 11 ace with 1 when needed
            String [][] playersHand = getPlayersHand(player);
            for(int i=0;i<playersHand.length;i++){
            //                System.out.println("SS " +playerHand[i][0]);
                //sort by players hand...can call another method ir have big if here
                if((playersHand[i][0].equals("ace heart"))|| (playersHand[i][0].equals("ace club")) || (playersHand[i][0].equals("ace diamond")) || (playersHand[i][0].equals("ace spade"))){
                     if(playersHand[i][1].equals("11")){
                         playersHand[i][1] = "1";
                         playerTotal[player] = playerTotal[player] - 10;
                         System.out.println("New total: "+playerTotal[player]);
                         if(playerTotal[player] == 21){
                             System.out.println("Player " + playerDone[player][0] +" won");
                             playerDone[player][1]=2;
                             break;
                         }
                         else if(playerTotal[player]< 21){
                             break;
                         }
                        //resets players new hand
                        setPlayersHand(playersHand,player);
                     }
                }else if (((i-1)==playersHand.length) || (playersHand[i][0].equals("null")) ){
                    System.out.println("Player " + playerDone[player][0] +" lost");
                    playerDone[player][1]=1;
                    break;
                } 
            }
            if(playerTotal[player] > 21){
                System.out.println("Player " + playerDone[player][0] +" lost");
                playerDone[player][1]=2;
            }
        }
    }
    
    /**
     * checks for the next legal player, if none game ends
     * @param plyr current player
     * @return next player
     */
    public static int checkNextPlayer(int plyr){
        int temp = plyr;
        //if last possible player set back to first then loop through players
        if(plyr==playerMax-1){
            plyr = 0;
            while(playerDone[plyr][1]==1){
                if(playerDone[plyr][1]==playerDone[temp][1]){                    
                    plyr = temp;
                    break;
                }
            }
        }//loop through to find next player
        else{            
            while(playerDone[plyr][1]==1){
                plyr = plyr+1;
                if(playerDone[plyr][1]==0){
                    break;
                }
                else if(playerDone[plyr][1]==playerDone[temp][1]){
                    plyr = temp;
                    break;
                }
                else if(plyr==(playerMax-1)){
                    plyr = 0;
                }
            }
        }
        return plyr;
        
    }
    
    /**
     * gives a value to the cards for the total
     * @param card the card given
     * @return the value of the card
     */
    public static String cardPoint(String card){
        int v=0;
        switch (card) {
            case "ace heart":
            case "ace club":
            case "ace diamond":
            case "ace spade":
                v=11;
                break;
            case "two heart":
            case "two club":
            case "two diamond":
            case "two spade":
                v=2;
                break;
            case "three heart":
            case "three club":
            case "three diamond":
            case "three spade":
                v=3;
                break;
            case "four heart":
            case "four club":
            case "four diamond":
            case "four spade":
                v=4;
                break;
            case "five heart":
            case "five club":
            case "five diamond":
            case "five spade":
                v=5;
                break;
            case "six heart":
            case "six club":
            case "six diamond":
            case "six spade":
                v=6;
                break;
            case "seven heart":
            case "seven club":
            case "seven diamond":
            case "seven spade":
                v=7;
                break;
            case "eight heart":
            case "eight club":
            case "eight diamond":
            case "eight spade":
                v=8;
                break;
            case "nine heart":
            case "nine club":
            case "nine diamond":
            case "nine spade":
                v=9;
                break;
            case "ten heart":
            case "ten club":
            case "ten diamond":
            case "ten spade":
            case "jack heart":
            case "jack club":
            case "jack diamond":
            case "jack spade":
            case "queen heart":
            case "queen club":
            case "queen diamond":
            case "queen spade":
            case "king heart":
            case "king club":
            case "king diamond":
            case "king spade":
                v=10;
                break;
        }
        String val = String.valueOf(v);
        return val;
    }
    
    
    
}
