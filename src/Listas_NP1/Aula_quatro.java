package Listas_NP1;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class Aula_quatro {
	public Aula_quatro() {
		
	}
public static void exe1 () {
		
		int contador, soma;
		soma = 0;
		for (contador = 1278; contador >= 1256; contador --) {
			soma += contador;
		}
		JOptionPane.showMessageDialog(null,"A soma dos números compreendidos entre 1278 e 1256 é igual a: "+ soma);
	}
	public static void exe2 () {
		int contador;
		for (contador = 10; contador >=1; contador --) {
			int quadrado = contador *contador;
			JOptionPane.showMessageDialog(null,"Quadrado dos números de 1 a 10 em ordem decrescente: "+ quadrado);
		}
	}
	public static void exe3() {
		int contador, periodo;
		float valor;
		String ler_valor = JOptionPane.showInputDialog(null,"Digite o valor da aplicação");
		valor = Float.parseFloat(ler_valor);
		String ler_periodo = JOptionPane.showInputDialog(null,"Digite o periodo da aplicação em meses");
		periodo = Integer.parseInt(ler_periodo);
		for (contador = periodo; contador >=1; contador --) {
			valor = valor * 110/100;
		}
		JOptionPane.showMessageDialog(null,"O montante da aplicação é igual a:"+ valor);
	}
	public static void exe4 () {
		int contador, soma;
		soma = 0;
		for (contador = 160; contador <= 190; contador = contador+2) {
			soma += contador;
		}
		JOptionPane.showMessageDialog(null,"A soma dos números pares no intervalo de 160 a 190 é: "+ soma);
	}
	public static void exe5() {
		int contador;
		double valor;
		valor = 1000;
		DecimalFormat casas = new DecimalFormat("0000.00");
		for (contador=1; contador<10; contador++) {
			valor = valor * 1.02;
		}
		JOptionPane.showMessageDialog(null,"A última cota do consórcio será de: "+ casas.format(valor));
	}
	public static void exe6 () {
		int contador, cubo;
		for (contador = 1; contador <20; contador=contador+2) {
			cubo = (int) Math.pow(contador, 3);
			JOptionPane.showMessageDialog(null,cubo);
		}
	}
	
	public static void main ( String [] args) {
		exe1();
	}
}