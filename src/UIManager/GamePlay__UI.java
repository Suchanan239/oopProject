package UIManager;

import ButtonManager.*;
import Game.Card;
import Game.Judge;
import Game.Player;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Game.PlayerTwo;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class GamePlay__UI {

    public JFrame frame = new JFrame();
    private JButton hitButton, standButton;
    public JPanel gamePanel, backgroundPanel, playerOneSide, playerTwoSide, middleZone, playerOneTable, playerTwoTable, playerTwoButtonZone, graveyardPanel, deckPanel, plainPanel, plainPanel2, plainPanel3, trumpUsePanel;
    public ImageIcon backgroundImage;
    public JLabel playerTwoScore, showCard;
    public PlayerTwo playerTwo;

    public GamePlay__UI() {
        creatingGameplayUI();
        frame.add(gamePanel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
    }

    public void creatingGameplayUI() {
        backgroundImage = new ImageIcon("resources/loginBackground.PNG");
        backgroundPanel = new BackgroundImage(backgroundImage, new Dimension(100, 100));
        hitButton = new JButton();
        standButton = new JButton();
        playerTwo = new PlayerTwo();
        playerTwoScore = new JLabel();
        gamePanel = new JPanel();
        playerOneSide = new JPanel();
        playerTwoSide = new JPanel();
        middleZone = new JPanel();
        playerOneTable = new JPanel();
        playerTwoTable = new JPanel();
        playerTwoButtonZone = new JPanel();
        graveyardPanel = new JPanel();
        deckPanel = new JPanel();
        trumpUsePanel = new JPanel();
        plainPanel = new JPanel();
        plainPanel2 = new JPanel();
        plainPanel3 = new JPanel();
        playerTwoScore.setFont(new Font("Book Antiqua", Font.BOLD, 30));
        playerTwoScore.setText("Score : " + playerTwo.getScore());

        Dimension ButtonSize = new Dimension(150, 30);
        //set player's hit Button
        hitButton.setMaximumSize(ButtonSize);
        hitButton.setMinimumSize(ButtonSize);
        hitButton.setPreferredSize(ButtonSize);

        hitButton.setText("Hit");

        hitButton.addActionListener(event -> {
            Player currentTurn = Judge.getPlayerTurn();
            Card randomCard = Judge.giveCard(currentTurn);
            showRandomCard(randomCard, "Player's hit");
        });

        standButton.setMaximumSize(ButtonSize);
        standButton.setMinimumSize(ButtonSize);
        standButton.setPreferredSize(ButtonSize);

        standButton.setText("Stand");

        standButton.addActionListener(event -> {
            hitButton.setVisible(false);
            standButton.setVisible(false);
            playerTwo.setStatus(false);
        });

        gamePanel.setLayout(new GridLayout(3, 1));
        playerOneSide.setLayout(new BorderLayout());
        playerTwoSide.setLayout(new BorderLayout());
        middleZone.setLayout(new BorderLayout());
        playerOneTable.setLayout(new FlowLayout());
        playerTwoTable.setLayout(new FlowLayout());
//        playerOneTable.setLayout(new GridLayout(1, 6));
//        playerTwoTable.setLayout(new GridLayout(1, 6));
        playerTwoButtonZone.setLayout(new FlowLayout());

        Dimension plainPanelSize = new Dimension(300, 300);
        plainPanel.setMaximumSize(plainPanelSize);
        plainPanel.setMinimumSize(plainPanelSize);
        plainPanel.setPreferredSize(plainPanelSize);

        plainPanel2.setMaximumSize(plainPanelSize);
        plainPanel2.setMinimumSize(plainPanelSize);
        plainPanel2.setPreferredSize(plainPanelSize);

        Dimension plainPanel3Size = new Dimension(200, 300);
        plainPanel3.setMaximumSize(plainPanel3Size);
        plainPanel3.setMinimumSize(plainPanel3Size);
        plainPanel3.setPreferredSize(plainPanel3Size);

        Dimension playerTwoButtonZoneSize = new Dimension(200, 300);
        playerTwoButtonZone.setMaximumSize(playerTwoButtonZoneSize);
        playerTwoButtonZone.setMinimumSize(playerTwoButtonZoneSize);
        playerTwoButtonZone.setPreferredSize(playerTwoButtonZoneSize);

        Dimension gravePanelSize = new Dimension(300, 400);
        graveyardPanel.setMaximumSize(gravePanelSize);
        graveyardPanel.setMinimumSize(gravePanelSize);
        graveyardPanel.setPreferredSize(gravePanelSize);

        Dimension deckPanelSize = new Dimension(200, 400);
        deckPanel.setMaximumSize(deckPanelSize);
        deckPanel.setMinimumSize(deckPanelSize);
        deckPanel.setPreferredSize(deckPanelSize);

        playerTwoButtonZone.add(hitButton);
        playerTwoButtonZone.add(standButton);
        playerTwoButtonZone.add(playerTwoScore);

//        playerTwoButtonZone.add(hitButton.getHitButton());
//        playerTwoButtonZone.add(standButton.getStandButton());
//        playerTwoButtonZone.add(playerTwoScore);
        playerOneSide.add(plainPanel, BorderLayout.WEST);
        playerOneSide.add(playerOneTable, BorderLayout.CENTER);
        playerOneSide.add(plainPanel3, BorderLayout.EAST);

        playerTwoSide.add(plainPanel2, BorderLayout.WEST);
        playerTwoSide.add(playerTwoTable, BorderLayout.CENTER);
        playerTwoSide.add(playerTwoButtonZone, BorderLayout.EAST);

        middleZone.add(graveyardPanel, BorderLayout.WEST);
        middleZone.add(trumpUsePanel, BorderLayout.CENTER);
        middleZone.add(deckPanel, BorderLayout.EAST);

        gamePanel.add(playerOneSide);
        gamePanel.add(middleZone);
        gamePanel.add(playerTwoSide);
        gamePanel.setPreferredSize(new Dimension(1250, 720));
        gamePanel.setBackground(new Color(13, 120, 40));
        playerOneSide.setBackground(null);
        playerTwoSide.setBackground(null);
        middleZone.setBackground(null);
        playerOneTable.setBackground(null);
        playerTwoTable.setBackground(null);
        playerTwoButtonZone.setBackground(null);
        graveyardPanel.setBackground(null);
        deckPanel.setBackground(null);
        plainPanel.setBackground(null);
        plainPanel2.setBackground(null);
        plainPanel3.setBackground(null);
        trumpUsePanel.setBackground(null);
        
        frame.setContentPane(backgroundPanel);
    }

    public void showRandomCard(Card randomCard, String hit) {

        Image image = randomCard.getImage().getImage();//It's ImageIcon icon = randomCard.getImage(); and Image = icon.getImage(); combine together :)
        Image scaledImage = image.getScaledInstance(137, 187, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        showCard = new JLabel(scaledIcon);
        if (hit.equals("Player's hit")) {
            playerTwoTable.add(showCard);
            playerTwo.setScore(playerTwo.getScore() + randomCard.getValue());
            playerTwoScore.setText("score: " + playerTwo.getScore());
            if (playerTwo.getScore() > 21) {
                hitButton.setVisible(false);
                standButton.setVisible(false);
                playerTwo.setStatus(false);
                playerTwoScore.setText("Score : " + playerTwo.getScore());
            }
            playerTwoTable.revalidate();
            playerTwoTable.repaint();
            playerTwoButtonZone.revalidate();
            playerTwoButtonZone.repaint();
        }
        gamePanel.revalidate();
        gamePanel.repaint();
    }
}
