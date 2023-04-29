
package ButtonManager;

import UIManager.standButtonUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class standButtonManager implements ActionListener{
    public standButtonUI standButton = new standButtonUI();
    
    public standButtonManager(){
        standButton.getStandButton().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == standButton.getStandButton()){
            
        }
    }
}
