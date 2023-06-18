package Teste;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Bandeiras extends JFrame{

	private JComboBox <String> combobox;
	private JLabel lbl1;
	private JLabel img1;
	private JLabel img2;
	private JLabel img3;
	
	public Bandeiras() {
		
		inicializacomponentes();
		definireventos();
		
	}

	private void inicializacomponentes() {
		// TODO Auto-generated method stub
		setTitle("Bandeiras");
		setBounds(0, 0, 600, 600);
		setLayout(null);
		
		combobox = new JComboBox<>();
		
		combobox.addItem("Brasil");
		combobox.addItem("Alemanha");
		combobox.addItem("China");
		combobox.addItem("Espanha");
		combobox.addItem("Portugal");
		lbl1 = new JLabel("Bandeiras:");
		img1 = new JLabel();
		img2 = new JLabel();
		img3 = new JLabel();
		combobox.setBounds(50,100,100,20);
		img1.setBounds(50, 150, 200, 150);
		img2.setBounds(50, 150, 200, 150);
		img3.setBounds(50, 100, 200, 150);
		lbl1.setBounds(50, 50, 200, 50);
		
		add(combobox);
		add(img1);
		add(img2);
		add(img3);
		add(lbl1);
		
	}

	private void definireventos() {
		// TODO Auto-generated method stub
		combobox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon imagemIcon = null;
				
				String item = combobox.getSelectedItem().toString();
				if(item.equals("Brasil")) {
					
					lbl1.setText("Brasil,América do Sul");
					imagemIcon = new ImageIcon("Imagens/brasil.png");
					
				}else if(item.equals("Alemanha")) {
					
					lbl1.setText("Alemanha,Europa");
					imagemIcon = new ImageIcon ("Imagens/alemanha.png");
					
				}else if(item.equals("China")) {
					
					lbl1.setText("China,Ásia");
					imagemIcon = new ImageIcon ("Imagens/china.png");
					
				}else if(item.equals("Espanha")) {
					
					lbl1.setText("Espanha,Europa");
					imagemIcon = new ImageIcon ("Imagens/espanha.png");
					
				}else if(item.equals("Portugal")) {
					
					lbl1.setText("Portugal,Europa");
					imagemIcon = new ImageIcon ("Imagens/portugal.png");
					
				}
				if(imagemIcon!=null) {
					
					img1.setIcon(imagemIcon);
					
				}
				
			}
		});
	}
	
	public static void main(String[] args){
	    Bandeiras frame = new Bandeiras();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width)/2,(tela.height - frame.getSize().height)/2);
        frame.setVisible(true);
}

	
}
