//
//package UIManager;
//
//import ButtonManager.HitButtonManager;
//import java.awt.ActiveEvent;
//import java.awt.Dimension;
//import java.awt.Font;
//import javax.swing.JFrame;
//
//public class GamePlay_UI extends JFrame implements ActiveEvent{
//    public HitButtonUI hitButton = new HitButtonUI();
//    public StandButtonUI standButton = new StandButtonUI();
//    public HitButtonManager hitButtonManager = new HitButtonManager();
//    
//    public GamePlay_UI(){
//        
//        initComponents();
//        
//        showScore.setFont(new Font("Book Antiqua", Font.BOLD, 25));
//        
//        Dimension playerTableSize = new Dimension(1050, 700);
//        //set player's table
//        playerTable.setMaximumSize(playerTableSize);
//        playerTable.setMinimumSize(playerTableSize);
//        playerTable.setPreferredSize(playerTableSize);
//        
//        this.pack();
//        this.setExtendedState(MAXIMIZED_BOTH);
//        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        this.setVisible(true);
//    }
//    
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
//    private void initComponents() {
//
//        gameplayPanel = new javax.swing.JPanel();
//        playerTable = new javax.swing.JPanel();
//        showScore = new javax.swing.JLabel();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        javax.swing.GroupLayout playerTableLayout = new javax.swing.GroupLayout(playerTable);
//        playerTable.setLayout(playerTableLayout);
//        playerTableLayout.setHorizontalGroup(
//            playerTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 405, Short.MAX_VALUE)
//        );
//        playerTableLayout.setVerticalGroup(
//            playerTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 190, Short.MAX_VALUE)
//        );
//
//        showScore.setText("Score : ");
//
//        javax.swing.GroupLayout gameplayPanelLayout = new javax.swing.GroupLayout(gameplayPanel);
//        gameplayPanel.setLayout(gameplayPanelLayout);
//        gameplayPanelLayout.setHorizontalGroup(
//            gameplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(gameplayPanelLayout.createSequentialGroup()
//                .addComponent(playerTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addGroup(gameplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addComponent(hitButton.getHitButton())
//                    .addComponent(standButton.getStandButton())
//                    .addComponent(showScore))
//                .addGap(0, 0, Short.MAX_VALUE))
//        );
//        gameplayPanelLayout.setVerticalGroup(
//            gameplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(gameplayPanelLayout.createSequentialGroup()
//                .addGroup(gameplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(gameplayPanelLayout.createSequentialGroup()
//                        .addGap(79, 79, 79)
//                        .addComponent(playerTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addGroup(gameplayPanelLayout.createSequentialGroup()
//                        .addGap(117, 117, 117)
//                        .addComponent(hitButton.getHitButton())
//                        .addGap(18, 18, 18)
//                        .addComponent(standButton.getStandButton())
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                        .addComponent(showScore)))
//                .addContainerGap(98, Short.MAX_VALUE))
//        );
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(gameplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(gameplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//        );
//
//        pack();
//    }// </editor-fold>                        
//    public javax.swing.JPanel gameplayPanel;
//    public javax.swing.JPanel playerTable;
//    public javax.swing.JLabel showScore;
//
//    @Override
//    public void dispatch() {
//    }
//}
