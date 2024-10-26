package Listas_NP1;
import javax.swing.JOptionPane;

public class Aula_cinco {
	public Aula_cinco() {
		
	}
	public static void exe1() {
		String cursos [] = new String [5];
		int contador;
		for (contador = 0; contador < 5; contador++) {
			String ler_cursos = JOptionPane.showInputDialog(null,"Digite o nome dos cursos da Unip: ");
			cursos [contador] = ler_cursos;
		}
		for (contador = 0; contador < 5; contador ++) {
		JOptionPane.showMessageDialog(null,"Os cursos digitados foram: "+ cursos[contador]);
		}
	}
	public static void exe2() {
		String nome [] = new String [10];
		String cpf[] = new String [10];
		double n1[] = new double [10];
		double n2[] = new double [10];
		double media;
		int contador = 0;
		for (contador = 0; contador <10; contador ++) {
			String ler_nome = JOptionPane.showInputDialog(null,"Digite seu nome: ");
			nome[contador] = ler_nome;
			String ler_cpf = JOptionPane.showInputDialog(null,"Digite seu CPF: ");
			cpf[contador] = ler_cpf;
			String ler_n1 = JOptionPane.showInputDialog(null," Digite sua NOta 1: ");
			n1[contador] = Double.parseDouble(ler_n1);
			String ler_n2 = JOptionPane.showInputDialog(null,"Digite sua Nota 2: ");
			n2[contador] = Double.parseDouble(ler_n2);
		}
		media = ( n1[2] + n2[2] )/2;
		JOptionPane.showMessageDialog(null, "O nome do 4º aluno cadastrado é: "+ nome[3] +"\nA média das notas do 2º aluno é:"
				+ " "+ media +"\nO CPF do 7º aluno é: "+ cpf[7]);
	}
	
	public static void main ( String [] args) {
		exe1();
	}
}
