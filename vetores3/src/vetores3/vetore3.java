package vetores3;
import javax.swing.JOptionPane;

public class vetore3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String impressao = "";
		String numeros[] = new String[5];
		
		 
		for (int c=0; c<=4; c++) {
			
			numeros[c] = JOptionPane.showInputDialog("Digite 5 números em ordem crescente: ");
			
		}
			
			for (int c = 4; c >= 0; c--) {
				impressao = impressao + " " + numeros[c];
	        }
			
			JOptionPane.showMessageDialog(null, "Sequência de forma decrescente:" + impressao);
			System.exit(0);
		}
		
		
	}


