
package Game;

import UIManager.GamePlayUI;
import UIManager.GamePlay__UI;

public class test {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        
        Judge.join(player1);
        Judge.join(player2);
        Judge.setCurrentPlayer(player1);
        new GamePlayUI();
    }
}
