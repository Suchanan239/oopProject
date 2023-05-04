package Game;


import javax.swing.*;
import java.util.ArrayList;

public abstract class Player {

    private String name;
    private boolean status = true;
    private int numOfCard = 0;
    private int numOfTrumpChip = 0;
    private int score = 0;
    private String connectID;
     //player's card
    private ArrayList<Card> myCard = new ArrayList<Card>();
     //player's chip
    private ArrayList<TrumpChip> myChip = new ArrayList<TrumpChip>();
    
    public Player(){
        
    }
    
//    public Player(String name){
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void addMyCard(Card myCard){
        this.myCard.add(myCard);
    }
    
    public ArrayList<Card> getMyCard() {
        return myCard;
    }
    
    public void addMyChip(TrumpChip myChip){
        this.myChip.add(myChip);
    }
    
    public ArrayList<TrumpChip> getMyChip() {
        return myChip;
    }

    public int getNumOfCard() {
        return numOfCard;
    }

    public void setNumOfCard(int numOfcard) {
        this.numOfCard = numOfcard;
    }

    public String getConnectID() {
        return connectID;
    }

    public void setConnectID(String connectID) {
        this.connectID = connectID;
    }
    
    
    
//    
//    public int cardPoint(){
//        return
//    }
//    
//    public int gameScore(){
//        return
//    }
//    public void buttomHit(){
//        
//    }
    
}
