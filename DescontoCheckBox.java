package Teste;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DescontoCheckBox extends JFrame {

	private JLabel lbl1;
	private JLabel lbl2;
	private JTextField txt1;
	private JTextField txt2;
	private JCheckBox checkBox;
	private JCheckBox checkBox2;
	private JCheckBox checkBox3;
	private JButton btn1;

	public DescontoCheckBox() {

		inicializacomponentes();
		definirEventos();

	}

	private void inicializacomponentes() {
		// TODO Auto-generated method stub
		setTitle("Descontos");
		setBounds(0, 0, 600, 600);
		setLayout(null);

		lbl1 = new JLabel("Digite o valor da compra:");
		lbl1.setBounds(60, 20, 150, 30);
		add(lbl1);

		txt2 = new JTextField();
		txt2.setBounds(210, 20, 150, 30);
		add(txt2);

		checkBox = new JCheckBox("Dinheiro");
		checkBox2 = new JCheckBox("Cartão");
		checkBox3 = new JCheckBox("Cheque");

		checkBox.setBounds(50, 50, 200, 50);
		checkBox2.setBounds(50, 110, 200, 50);
		checkBox3.setBounds(50, 170, 200, 50);

		add(checkBox);
		add(checkBox2);
		add(checkBox3);

		ButtonGroup btnG = new ButtonGroup();
		btnG.add(checkBox);
		btnG.add(checkBox2);
		btnG.add(checkBox3);

		txt1 = new JTextField();
		txt1.setBounds(190, 230, 150, 30);
		add(txt1);

	}

	private void definirEventos() {
		ItemListener itemListener = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getSource() == checkBox) {
					if (checkBox.isSelected()) {
						float dinheirotxt = Float.parseFloat(txt2.getText());
						float descDinheiro = dinheirotxt - ((dinheirotxt * 5) / 100);
						String descDinheiro2 = String.valueOf(descDinheiro);
						txt1.setText(descDinheiro2);
					} else {
						txt2.setText("");
					}
				}
				if (e.getSource() == checkBox2) {

					txt1.setText("");
					float cartao = Float.parseFloat(txt2.getText());
					float desCartao = cartao + ((cartao * 10) / 100);
					String desCartao2 = String.valueOf(desCartao);
					txt1.setText(desCartao2);

				}
				if (e.getSource() == checkBox3) {

					txt1.setText("");
					float cheque = Float.parseFloat(txt2.getText());
					float desCheque = cheque + ((cheque * 5) / 100);
					String desCheque2 = String.valueOf(desCheque);
					txt1.setText(desCheque2);

				}
			}
		};

		checkBox.addItemListener(itemListener);
		checkBox2.addItemListener(itemListener);
		checkBox3.addItemListener(itemListener);
	}

	public static void main(String[] args) {
		DescontoCheckBox frame = new DescontoCheckBox();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
		frame.setVisible(true);
	}

}
