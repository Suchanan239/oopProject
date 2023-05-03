package UIManager;

public class LoginDisplayGUI extends javax.swing.JFrame {

    public LoginDisplayGUI() {
    }
    public void init() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameTitle = new javax.swing.JLabel();
        playerInputName = new javax.swing.JTextField();
        loginPanel = new javax.swing.JButton();
        loginBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gameTitle.setFont(new java.awt.Font("Book Antiqua", 1, 100)); // NOI18N
        gameTitle.setText("Untitled-BlackJack");
        getContentPane().add(gameTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        playerInputName.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        getContentPane().add(playerInputName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 370, 50));

        loginPanel.setBackground(new java.awt.Color(255, 204, 0));
        loginPanel.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        loginPanel.setText("Login");
        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 370, 40));

        loginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/loginBackground.PNG"))); // NOI18N
        getContentPane().add(loginBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-310, -80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginDisplayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDisplayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDisplayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDisplayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginDisplayGUI().init();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gameTitle;
    private javax.swing.JLabel loginBackground;
    private javax.swing.JButton loginPanel;
    private javax.swing.JTextField playerInputName;
    // End of variables declaration//GEN-END:variables
}
