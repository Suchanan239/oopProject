
package UIManager;

import java.awt.Dimension;
import javax.swing.JButton;

public class hitButtonUI {
    private JButton hitButton = new JButton();
    
    public hitButtonUI(){
        Dimension ButtonSize = new Dimension(150, 30);
        //set player's hit Button
        hitButton.setMaximumSize(ButtonSize);
        hitButton.setMinimumSize(ButtonSize);
        hitButton.setPreferredSize(ButtonSize);
        
        hitButton.setText("Hit");
    }

    public JButton getHitButton() {
        return hitButton;
    }

    public void setHitButton(JButton hitButton) {
        this.hitButton = hitButton;
    }
    
}
