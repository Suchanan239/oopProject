
package Game;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class imageDisplay {
    private JLabel showCard;

    public void showRandomCard(Card randomCard, String hit) {

        Image image = randomCard.getImage().getImage();//It's ImageIcon icon = randomCard.getImage(); and Image = icon.getImage(); combine together :)
        Image scaledImage = image.getScaledInstance(137, 187, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        showCard = new JLabel(scaledIcon);
    }
}
