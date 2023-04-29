package UIManager;

import java.awt.Dimension;
import javax.swing.JButton;

public class standButtonUI {
    private JButton standButton = new JButton();
    public standButtonUI(){
        Dimension ButtonSize = new Dimension(150, 30);
        //set player's stand Button
        standButton.setMaximumSize(ButtonSize);
        standButton.setMinimumSize(ButtonSize);
        standButton.setPreferredSize(ButtonSize);
    
        standButton.setText("Stand");
    }

    public JButton getStandButton() {
        return standButton;
    }

    public void setStandButton(JButton standButton) {
        this.standButton = standButton;
    }   
}
