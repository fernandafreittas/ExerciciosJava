package Teste;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Exercicio1 extends JFrame {

	private JLabel lbl1;
	private JTextField txt1;
	public Exercicio1(){
		
		inicializarcomponetes();
		definireventos();
	}
	
	private void inicializarcomponetes() {
		// TODO Auto-generated method stub
		
		setTitle("Evento da Caixa de Texto");
		setBounds(0,0,550,550);
		setLayout(null);
		
		lbl1 = new JLabel("Digite algo:");
		txt1 = new JTextField();
		
		lbl1.setBounds(100,100,100,100);
		txt1.setBounds(175,140,130,20);
		
		add(lbl1);
		add(txt1);
	}
	
	private void definireventos() {

		txt1.addKeyListener(new KeyListener(){


			@Override
			public void keyTyped(KeyEvent e) {
				if(txt1.getText().length() >=10){
					e.consume();
				}
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
			
			
		});
		
	}
	
	public static void main(String[] args){
		    Exercicio1 frame = new Exercicio1();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
	        frame.setLocation((tela.width - frame.getSize().width)/2,(tela.height - frame.getSize().height)/2);
	        frame.setVisible(true);
	}
}
