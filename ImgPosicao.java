package Teste;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random.*;

import javax.swing.*;

public class ImgPosicao extends JFrame{
	
	private JButton btn1;
	private JButton btn2;
	private ImageIcon img;
	private JLabel label;
	private int x,y;
	
	ImgPosicao(){
		
		inicializacomponentes();
		defineventos();
		
	}

	private void inicializacomponentes() {
		// TODO Auto-generated method stub
		setTitle("Imagem teimosa");
		setBounds(0,0,500,500);
		setLayout(null);
		
		x = 200;
		y = 200;
		
		btn1 = new JButton("Mostrar");
		btn2 = new JButton("Ocultar");
		
		btn1.setBounds(50,40,90,50);
		btn2.setBounds(200,40,90,50);
		
		add(btn1);
		add(btn2);
		
		img = new ImageIcon("Imagens/nave.png");
		
		label = new JLabel(img);
        label.setBounds(x, y, img.getIconWidth(), img.getIconHeight());
        add(label);
		
	}

	private void defineventos() {
		// TODO Auto-generated method stub
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setIcon(img);
				moverimagem();
				
			}

			private void moverimagem() {
				// TODO Auto-generated method stub
				int novoX = (int) (Math.random() * (getWidth() - img.getIconWidth()));
				int novoY = (int) (Math.random() * (getHeight() - img.getIconHeight()));
				
				x = novoX;
				y = novoY;
				
				label.setBounds(x, y, img.getIconWidth(), img.getIconHeight());
				
				repaint();
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setIcon(null);
				
			}
		});
		
	}
	
	public static void main(String[]args) {
		
		ImgPosicao frame = new ImgPosicao();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.height - frame.getSize().height) /2, (tela.width - frame.getSize().width) /2);
		frame.setVisible(true);
		
	}

}
