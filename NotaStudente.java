package komponentet;

import javax.swing.JOptionPane;

public class NotaStudente {
	
	public int[] mbushNotat(int nrStudente) {
		int[] vektori = new int[nrStudente];
		
		int i = 0;
		while(i < nrStudente) {
			
			String inputNota = JOptionPane.showInputDialog("Vendosni noten e studentit" + (i +1));
			int temp = Integer.parseInt(inputNota);
			
			if(temp >= 4 && temp <= 10) {
				vektori[i] = temp;
				i++;
			} else {
				JOptionPane.showMessageDialog(null, "Nota duhet mes 4 dhe 10");
				
			}	
		}
		
		return vektori;
	}

	public void afishoNota(int[] vektor) {
		for(int i:vektor) {
			System.out.printf("Nota: %d", i);
		}
	}
	
	public void frekuencat(int[] vektor) {
		int[] frekuenca = new int[7];
		
		for(int i:vektor) {
			frekuenca[i-4]++;	
		}
		
		for(int i = 0; i < 7; i++) {
			System.out.printf("Frekuenca e notes %d eshte %d%n", (i + 4), frekuenca[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = JOptionPane.showInputDialog("Sa studente ka klasa: ");
		int nrStudente = Integer.parseInt(input);
		NotaStudente n = new NotaStudente();
		
		if(nrStudente > 0) {
			int[] vektorNota = n.mbushNotat(nrStudente);
			n.afishoNota(vektorNota);
			n.frekuencat(vektorNota);
		} else {
			JOptionPane.showMessageDialog(null, "Nr i studenteve te futur nuk eshte i lejuar!");
		}
		
		

	}

}
