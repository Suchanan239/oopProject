package Controller;

import UIManager.GamePlayDisplayGUI;
import Game.Card;
import Game.CardHandler;
import Game.Judge;
import Game.Player;
import Game.PlayerTwo;
import Game.PlayerOne;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Game.RandomCard;

public class Controller implements ActionListener{
    public GamePlayDisplayGUI gameGUI;
    public PlayerOne playerOne;
    public RandomCard randomCard;
    
    public Controller(){
        gameGUI = new GamePlayDisplayGUI();
        playerOne = new PlayerOne();
        randomCard = new RandomCard();
        gameGUI.init();
        gameGUI.getHitButton().addActionListener(this);
        gameGUI.getStandButton().addActionListener(this);
        randomCard = new RandomCard();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == gameGUI.getHitButton()){
            Player currentTurn = Judge.getPlayerTurn();
            Card card = Judge.giveCard(currentTurn);
            showRandomCard(card, "Player's hit");
        }
        else if (e.getSource() == gameGUI.getStandButton()){
            gameGUI.getHitButton().setVisible(false);
            gameGUI.getStandButton().setVisible(false);
            playerOne.setStatus(false);
        }
    }
    
    public void showRandomCard(Card card, String hit) {
        randomCard.setShowCard(randomCard.randomCard(card));
        if (hit.equals("Player's hit")) {
            gameGUI.getPlayerOneTable().add(randomCard.getShowCard());
            playerOne.setScore(playerOne.getScore() + card.getValue());
            gameGUI.getScoreLabel().setText("Score: " + playerOne.getScore());
            if (playerOne.getScore() > 21) {
                gameGUI.getHitButton().setVisible(false);
                gameGUI.getStandButton().setVisible(false);
                playerOne.setStatus(false);
                gameGUI.getScoreLabel().setText("Score : " + playerOne.getScore());
            }
            gameGUI.getPlayerOneTable().revalidate();
            gameGUI.getPlayerOneTable().repaint();
            gameGUI.getButtonPanel().revalidate();
            gameGUI.getButtonPanel().repaint();
        }
    }
}
