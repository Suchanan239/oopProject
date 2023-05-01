/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIManager;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Suchanan
 */
public class GamePlayDisplayGUI extends javax.swing.JFrame {

    public GamePlayDisplayGUI() {
        initComponents();
        
//        Dimension hitButtonSize = new Dimension(150, 30);
//        hitButton.setMaximumSize(hitButtonSize);
//        hitButton.setMinimumSize(hitButtonSize);
//        hitButton.setPreferredSize(hitButtonSize);
//        
//        Dimension buttonPanelSize = new Dimension(150, 200);
//        buttonPanel.setMaximumSize(buttonPanelSize);
//        buttonPanel.setMinimumSize(buttonPanelSize);
//        buttonPanel.setPreferredSize(buttonPanelSize);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        hitButton = new javax.swing.JButton();
        standButton = new javax.swing.JButton();
        scoreLabel = new javax.swing.JLabel();
        playerTwoTable = new javax.swing.JPanel();
        trumpChipPlayerTwoPanel = new javax.swing.JPanel();
        playerOneTable = new javax.swing.JPanel();
        playerOneNamePanel = new javax.swing.JPanel();
        trumpHoldChipPlayerOnePanel = new javax.swing.JPanel();
        trumpChipPlayerOnePanel = new javax.swing.JPanel();
        deckCardPanel = new javax.swing.JPanel();
        playerTwoNamePanel = new javax.swing.JPanel();
        trumpHoldChipPlayerTwoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonPanel.setPreferredSize(new java.awt.Dimension(150, 200));

        hitButton.setText("Hit");

        standButton.setText("Stand");

        scoreLabel.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        scoreLabel.setText("Score : ");
        scoreLabel.setPreferredSize(new java.awt.Dimension(150, 100));

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(standButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(standButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(buttonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1118, 520, 156, 212));
        jPanel1.add(playerTwoTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 730, 210));
        jPanel1.add(trumpChipPlayerTwoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 600, 70));
        jPanel1.add(playerOneTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 730, 212));
        jPanel1.add(playerOneNamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 250, 90));

        javax.swing.GroupLayout trumpHoldChipPlayerOnePanelLayout = new javax.swing.GroupLayout(trumpHoldChipPlayerOnePanel);
        trumpHoldChipPlayerOnePanel.setLayout(trumpHoldChipPlayerOnePanelLayout);
        trumpHoldChipPlayerOnePanelLayout.setHorizontalGroup(
            trumpHoldChipPlayerOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        trumpHoldChipPlayerOnePanelLayout.setVerticalGroup(
            trumpHoldChipPlayerOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        jPanel1.add(trumpHoldChipPlayerOnePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 250, 160));

        trumpChipPlayerOnePanel.setAutoscrolls(true);
        jPanel1.add(trumpChipPlayerOnePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 600, 70));

        deckCardPanel.setBackground(new java.awt.Color(255, 102, 255));

        javax.swing.GroupLayout deckCardPanelLayout = new javax.swing.GroupLayout(deckCardPanel);
        deckCardPanel.setLayout(deckCardPanelLayout);
        deckCardPanelLayout.setHorizontalGroup(
            deckCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        deckCardPanelLayout.setVerticalGroup(
            deckCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jPanel1.add(deckCardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 270, 150, 210));

        playerTwoNamePanel.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.add(playerTwoNamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 250, 90));

        trumpHoldChipPlayerTwoPanel.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout trumpHoldChipPlayerTwoPanelLayout = new javax.swing.GroupLayout(trumpHoldChipPlayerTwoPanel);
        trumpHoldChipPlayerTwoPanel.setLayout(trumpHoldChipPlayerTwoPanelLayout);
        trumpHoldChipPlayerTwoPanelLayout.setHorizontalGroup(
            trumpHoldChipPlayerTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        trumpHoldChipPlayerTwoPanelLayout.setVerticalGroup(
            trumpHoldChipPlayerTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        jPanel1.add(trumpHoldChipPlayerTwoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 250, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Suchanan\\OneDrive\\Documents\\NetBeansProjects\\Untitled-BlackJack\\resources\\GamePlayBackground.PNG")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    public void init() {
        initComponents();
//        playerOneTable.setBackground(null);
//        playerTwoTable.setBackground(null);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel deckCardPanel;
    private javax.swing.JButton hitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel playerOneNamePanel;
    private javax.swing.JPanel playerOneTable;
    private javax.swing.JPanel playerTwoNamePanel;
    private javax.swing.JPanel playerTwoTable;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JButton standButton;
    private javax.swing.JPanel trumpChipPlayerOnePanel;
    private javax.swing.JPanel trumpChipPlayerTwoPanel;
    private javax.swing.JPanel trumpHoldChipPlayerOnePanel;
    private javax.swing.JPanel trumpHoldChipPlayerTwoPanel;
    // End of variables declaration//GEN-END:variables

    public JPanel getButtonPanel() {
        return buttonPanel;
    }

    public void setButtonPanel(JPanel buttonPanel) {
        this.buttonPanel = buttonPanel;
    }

    public JButton getHitButton() {
        return hitButton;
    }

    public void setHitButton(JButton hitButton) {
        this.hitButton = hitButton;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getPlayerOneTable() {
        return playerOneTable;
    }

    public void setPlayerOneTable(JPanel playerOneTable) {
        this.playerOneTable = playerOneTable;
    }

    public JPanel getPlayerTwoTable() {
        return playerTwoTable;
    }

    public void setPlayerTwoTable(JPanel playerTwoTable) {
        this.playerTwoTable = playerTwoTable;
    }

    public JLabel getScoreLabel() {
        return scoreLabel;
    }

    public void setScoreLabel(JLabel scoreLabel) {
        this.scoreLabel = scoreLabel;
    }

    public JButton getStandButton() {
        return standButton;
    }

    public void setStandButton(JButton standButton) {
        this.standButton = standButton;
    }
    
}