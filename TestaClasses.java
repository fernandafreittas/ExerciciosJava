import java.util.Scanner;
import javax.swing.JOptionPane;
public class TestaClasses {

	public static void main(String[] args) {
		
		OperacaoInterface opm[] = new OperacaoInterface[4];
		Soma s = new Soma();
		Subtracao sub = new Subtracao();
		Multiplicacao m = new Multiplicacao();
		Divisao div = new Divisao();
		opm[0] = s;
		opm[1] = sub;
		opm[2] = m;
		opm[3] = div;
		Scanner ler = new Scanner(System.in);
		int op = 0;
		while (op != 5) {
           
			String aux = JOptionPane.showInputDialog("Informe um numero: ");
			int a = Integer.parseInt(aux);
			String aux2 = JOptionPane.showInputDialog("Informe outro numero: ");
			int b = Integer.parseInt(aux2);
			String aux3 = JOptionPane.showInputDialog("Escolha uma das opções de operações para os valores informados------------------------------------"
			+"\n1-Soma"
			+"\n2-Substração"
			+"\n3-Multiplicação"
			+"\n4-Divisão"
			+"\n5-Sair");
			op = Integer.parseInt(aux3);
			
			switch (op) {

			case 1:

				JOptionPane.showMessageDialog(null,"Resultado: " + opm[0].calcula(a, b));
				break;

			case 2:

				JOptionPane.showMessageDialog(null,"Resultado: " + opm[1].calcula(a, b));
				break;

			case 3:

				JOptionPane.showMessageDialog(null,"Resultado: " + opm[2].calcula(a, b));
				break;
			case 4:

				JOptionPane.showMessageDialog(null,"Resultado: " + opm[3].calcula(a, b));
				break;

			case 5:
				JOptionPane.showMessageDialog(null,"Você saiu!!!");
				break;

			}
		}

	}

}
