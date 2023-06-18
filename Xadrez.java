package Teste;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.*;

public class Xadrez {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess Board");
        ChessBoardPanel chessBoardPanel = new ChessBoardPanel();
        frame.add(chessBoardPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class ChessBoardPanel extends JPanel {
    private static final int BOARD_SIZE = 8;
    private static final Color LIGHT_COLOR = Color.WHITE;
    private static final Color DARK_COLOR = Color.GRAY;

    public ChessBoardPanel() {
        setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                JPanel square = new JPanel();
                square.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                square.setBackground((row + col) % 2 == 0 ? LIGHT_COLOR : DARK_COLOR);
                add(square);
            }
        }
    }
    
    public static void main(String[] args){
	    Bandeiras frame = new Bandeiras();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width)/2,(tela.height - frame.getSize().height)/2);
        frame.setVisible(true);
}

}