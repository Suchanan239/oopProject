package Controller;

import Game.RandomCard;
import UIManager.GamePlayDisplayGUI;
import Game.Card;
import Game.CardHandler;
import Game.Player;
import Game.PlayerTwo;
import Game.PlayerTwo;
import Game.PlayerOne;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Component;

public class Controller implements ActionListener{
    public GamePlayDisplayGUI gameGUI;
    public PlayerOne playerOne;
    public PlayerTwo playerTwo;
    public RandomCard randomCard;
    public Judge judge;
    
    public Controller(){
        gameGUI = new GamePlayDisplayGUI();
        playerOne = new PlayerOne();
        playerTwo = new PlayerTwo();
        randomCard = new RandomCard();
        
        gameGUI.init();
        gameGUI.getHitButtonPlayerOne().addActionListener(this);
        gameGUI.getStandButtonPlayerOne().addActionListener(this);
        gameGUI.getHitButtonPlayerTwo().addActionListener(this);
        gameGUI.getStandButtonPlayerTwo().addActionListener(this);
        
        randomCard = new RandomCard();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == gameGUI.getHitButtonPlayerOne()){
            Player currentTurn = Judge.getPlayerTurn();
            Card card = Judge.giveCard(currentTurn);
            showRandomCard(card, "PlayerOne's hit");
            judge.switchTurn();
        }
        else if (e.getSource() == gameGUI.getStandButtonPlayerOne()){
            gameGUI.getHitButtonPlayerOne().setVisible(false);
            gameGUI.getStandButtonPlayerOne().setVisible(false);
            playerOne.setStatus(false);
        }
        else if (e.getSource() == gameGUI.getHitButtonPlayerTwo()){
            Player currentTurn = Judge.getPlayerTurn();
            Card card = Judge.giveCard(currentTurn);
            showRandomCard(card, "PlayerTwo's hit");
            judge.switchTurn();
        }
        else if (e.getSource() == gameGUI.getStandButtonPlayerTwo()){
            gameGUI.getHitButtonPlayerTwo().setVisible(false);
            gameGUI.getStandButtonPlayerTwo().setVisible(false);
            playerOne.setStatus(false);
        }
    }
    
    public void showRandomCard(Card card, String hit) {
        randomCard.setShowCard(randomCard.randomCard(card));
        if (hit.equals("PlayerOne's hit")) {
            gameGUI.getPlayerOneTable().add(randomCard.getShowCard());
            playerOne.setScore(playerOne.getScore() + card.getValue());
            gameGUI.getScoreCardOneLabel().setText("Score: " + playerOne.getScore());
            if (playerOne.getScore() > 21) {
                gameGUI.getHitButtonPlayerOne().setVisible(false);
                gameGUI.getStandButtonPlayerOne().setVisible(false);
                playerOne.setStatus(false);
                gameGUI.getScoreCardOneLabel().setText("Score : " + playerOne.getScore());
            }
//            gameGUI.getPlayerOneTable().revalidate();
//            gameGUI.getPlayerOneTable().repaint();
//            gameGUI.getButtonPanelPlayerOne().revalidate();
//            gameGUI.getButtonPanelPlayerOne().repaint();
        }
        else if (hit.equals("PlayerTwo's hit")) {
            gameGUI.getPlayerTwoTable().add(randomCard.getShowCard());
            playerTwo.setScore(playerTwo.getScore() + card.getValue());
            gameGUI.getScoreCardTwoLabel().setText("Score: " + playerTwo.getScore());
            if (playerTwo.getScore() > 21) {
                gameGUI.getHitButtonPlayerTwo().setVisible(false);
                gameGUI.getStandButtonPlayerTwo().setVisible(false);
                playerOne.setStatus(false);
                gameGUI.getScoreCardTwoLabel().setText("Score : " + playerTwo.getScore());
            }
//            gameGUI.getPlayerTwoTable().revalidate();
//            gameGUI.getPlayerTwoTable().repaint();
//            gameGUI.getButtonPanelPlayerTwo().revalidate();
//            gameGUI.getButtonPanelPlayerTwo().repaint();
        }
    }
}
