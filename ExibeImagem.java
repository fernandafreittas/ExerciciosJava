package Teste;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ExibeImagem extends JFrame{

	private JButton btn;
	private ImageIcon img;
	
	public ExibeImagem() {
		
		inicializacomponentes();
		defineventos();
		
	}

	private void inicializacomponentes() {
		// TODO Auto-generated method stub
		setTitle("Exibe imagem");
		setBounds(0, 0, 500, 500);
		setLayout(null);
		
		btn = new JButton("Imagem");
		btn.setBounds(170, 100, 250, 250);
		add(btn);
		
		img = new ImageIcon("Imagens/flamengo.png");
		
	}

	private void defineventos() {
		// TODO Auto-generated method stub
		btn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				btn.setIcon(null);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				btn.setIcon(img);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	public static void main(String[]args) {
		
		ExibeImagem frame = new ExibeImagem();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width) /2, (tela.height - frame.getSize().height) /2 );
		frame.setVisible(true);
		
	}
	
}
