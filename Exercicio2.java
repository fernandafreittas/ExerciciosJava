package Teste;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Exercicio2 extends JFrame{
	
	private JButton btn1;
	
	public Exercicio2(){
		
		inicializacomponentes();
		definireventos();
		
	}
	
	private void inicializacomponentes() {
		// TODO Auto-generated method stub
		
		setTitle("Mudar cor do Botao");
		setBounds(0,0,600,600);
		setLayout(null);
		
		btn1 = new JButton("Trocar");
		
		btn1.setBounds(250,200,100,100);
		
		add(btn1);
		
	}

	private void definireventos() {
		// TODO Auto-generated method stub
		btn1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn1.setBackground(null);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn1.setBackground(Color.orange);
							
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	public static void main(String[] args){
	    Exercicio2 frame = new Exercicio2();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width)/2,(tela.height - frame.getSize().height)/2);
        frame.setVisible(true);
}
}
