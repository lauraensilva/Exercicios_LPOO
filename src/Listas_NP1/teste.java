package Listas_NP1;
import java.text.*;

import javax.swing.JOptionPane;
public class teste {
	public static void main (String [] args) {
		double consorcio = 12000;
		for (int i=1; i<=11; i++) {
			consorcio = consorcio + (consorcio *0.02);
			int mes = i+1;
			JOptionPane.showMessageDialog(null,"o valor no mês"+ mes +" será de: "+ consorcio);
		}
	}

}
