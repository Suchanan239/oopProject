
package ButtonManager;

import UIManager.hitButtonUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import Game.imageDisplay;
import Game.Card;
import Game.Judge;
import Game.Player;

public class hitButtonManager implements ActionListener{ 
    public imageDisplay display = new imageDisplay();
    public hitButtonUI hitButton = new hitButtonUI();
    
    public hitButtonManager(){
        hitButton.getHitButton().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == hitButton.getHitButton()){
            Player currentTurn = Judge.getPlayerTurn();
            Card randomCard = Judge.giveCard(currentTurn);
            display.showRandomCard(randomCard, "player's hit");
            System.out.println("e dok");
        }
    }
    
}
