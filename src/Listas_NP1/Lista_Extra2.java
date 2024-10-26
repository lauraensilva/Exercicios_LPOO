package Listas_NP1;
import javax.swing.*;

public class Lista_Extra2 {
	public Lista_Extra2() {
	}
	public static void exe1(){
		String ler_valor = JOptionPane.showInputDialog(null,"Digite o valor: ");
		double valor = Double.parseDouble(ler_valor);
		String ler_un = JOptionPane.showInputDialog(null,"Digite a unidade de medida:\n(Escolha entre mm, cm, m, km)");
		String un_atual = ler_un;
		String ler_uni = JOptionPane.showInputDialog(null,"Digite a unidade que deseja converte:\n(Escolha entre mm, cm, m, km)");
		String un_conver = ler_uni;
		if (un_atual == "mm" & un_conver == "mm") {
				double novo_v = valor;
				JOptionPane.showMessageDialog(null, novo_v);
			}else if (un_atual == "mm" & un_conver == "cm") {
				double novo_v = valor/10;
				JOptionPane.showMessageDialog(null, novo_v);
			}else if (un_atual == "mm" & un_conver == "m") {
				double novo_v = valor/1000;
				JOptionPane.showMessageDialog(null, novo_v);
			}else if (un_atual == "mm" & un_conver == "km") {
				double novo_v = valor/1000000;
				JOptionPane.showMessageDialog(null, novo_v);
			}else if (un_atual == "cm" & un_conver == "mm") {
				double novo_v = valor*10;
				JOptionPane.showMessageDialog(null, novo_v);
			}else if (un_atual == "cm" & un_conver == "cm") {
				double novo_v = valor;
				JOptionPane.showMessageDialog(null, novo_v);
			}else if (un_atual == "cm" & un_conver == "m") {
				double novo_v = valor/100;
				JOptionPane.showMessageDialog(null, novo_v);
			}else if (un_atual == "cm" & un_conver == "km") {
				double novo_v = valor/100000;
				JOptionPane.showMessageDialog(null, novo_v);
			}else if (un_atual == "m" & un_conver == "mm") {
				double novo_v = valor*1000;
				JOptionPane.showMessageDialog(null, novo_v);
			}else if (un_atual == "m" & un_conver == "cm") {
				double novo_v = valor*10;
				JOptionPane.showMessageDialog(null, novo_v);
			}else if (un_atual == "m" & un_conver == "m") {
				double novo_v = valor*10;
				JOptionPane.showMessageDialog(null, novo_v);
			}else if (un_atual == "m" & un_conver == "km") {
				double novo_v = valor*10;
				JOptionPane.showMessageDialog(null, novo_v);
			}else if (un_atual == "km" & un_conver == "mm") {
				double novo_v = valor*10;
				JOptionPane.showMessageDialog(null, novo_v);
			}else if (un_atual == "km" & un_conver == "cm") {
				double novo_v = valor*10;
				JOptionPane.showMessageDialog(null, novo_v);
			}else if (un_atual == "km" & un_conver == "m") {
				double novo_v = valor*10;
				JOptionPane.showMessageDialog(null, novo_v);
			}else if (un_atual == "km" & un_conver == "km") {
				double novo_v = valor*10;
				JOptionPane.showMessageDialog(null, novo_v);
			}
		
		}

	
	
	
	public static void main(String[]args) {
		exe1();
		
	}
}
