package Listas_NP1;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Aula_tres {
	public Aula_tres() {
		
	}
	public static void exe1 () {
		
		String nome;
		int quant;
		float valor_unit, valor_total;
		DecimalFormat casas = new DecimalFormat ("0.00");
		String lernome = JOptionPane.showInputDialog(null, "Digite o nome do produto:");
		nome = lernome;
		String lerquant = JOptionPane.showInputDialog(null, "Digite a quantidade de produtos:");
		quant = Integer.parseInt(lerquant);
		String lervalor = JOptionPane.showInputDialog(null, "Digite o valor do produto:");
		valor_unit = Float.parseFloat(lervalor);
		valor_total = quant * valor_unit;
		JOptionPane.showMessageDialog(null,"Produto: "+nome+"\nQuantidade: "+quant+"\nValor unitário: "+casas.format(valor_total)+" reais.\nO valor total da compra foi"
				+ " de: "+casas.format(valor_total)+" reais");
	}
	public static void exe2() {
		int contador;
		float media, num_soma;
		contador = 0;
		int num= 0;
		num_soma= 0;
		
		String lernum = JOptionPane.showInputDialog(null,"Entre com um numero. (Digite 9999 para sair)");
		num = Integer.parseInt(lernum);
		
		while (num != 9999) {
						
			num_soma += num;
			contador++;
			lernum = JOptionPane.showInputDialog(null,"Entre com um numero. (Digite 9999 para sair)");
			num = Integer.parseInt(lernum);
		}
		
		media = num_soma/contador;
		JOptionPane.showMessageDialog(null,"A média dos valores digitados é: "+media);
	}
	
	public static void exe3 () {
		float NP1, INST, NP2, MS, MF, EX=0;
		String lerNP1 = JOptionPane.showInputDialog(null,"Insira sua nota de NP1:");
		NP1 = Float.parseFloat(lerNP1);
		String lerINST = JOptionPane.showInputDialog(null,"Insira sua nota INSTITUCIONAL:");
		INST = Float.parseFloat(lerINST);
		String lerNP2 = JOptionPane.showInputDialog(null,"Insira sua nota de NP2");
		NP2 = Float.parseFloat(lerNP2);
		MS = (NP1*3 + INST*4 + NP2*3)/10;
		if (MS >= 7) {
			JOptionPane.showMessageDialog(null,"Parabéns! Você está aprovado. Sua média final é igual: "+ MS);
			
		}
		else {
			JOptionPane.showMessageDialog(null,"Sua média semestral foi igual a: "+ MS +"\nVocê deverá fazer o Exame.");
			String lerEX = JOptionPane.showInputDialog(null,"Insira sua nota do Exame para calcular a média final:");
			EX = Float.parseFloat(lerEX);
			MF = (MS + EX)/2;
			if (MF <5) {
				JOptionPane.showMessageDialog(null,"Sua média final é: "+ MF +".\nVocê não atingiu a média necessária.\nStatus: REPROVADO");
			}
			else {
				JOptionPane.showMessageDialog(null,"Sua média final é "+ MF +" Você foi aprovado!");
			}
		}		
	}	
	public static void exe4() {
		String NOME, CPF, END;
		int RG;
		float SALARIO, AUMENTO, NOVO_SAL;
		DecimalFormat casas = new DecimalFormat ("0.00");
		String lerNOME = JOptionPane.showInputDialog(null,"Insira seu nome: ");
		NOME = lerNOME;
		String lerCPF = JOptionPane.showInputDialog(null,"Insira seu CPF: ");
		CPF = lerCPF;
		String lerRG = JOptionPane.showInputDialog(null,"Insira seu RG: ");
		RG = Integer.parseInt(lerRG);
		String lerEND = JOptionPane.showInputDialog(null,"Insira seu endereço: ");
		END = lerEND;
		String lerSALARIO = JOptionPane.showInputDialog(null,"Insira seu último salário: ");
		SALARIO = Float.parseFloat(lerSALARIO);
		AUMENTO = SALARIO*7/100;
		NOVO_SAL = SALARIO + AUMENTO;
		JOptionPane.showMessageDialog(null,"Dados Cadastrados:\nNome: "+ NOME +"\nCPF: "+ CPF +"\nRG: "+ RG +"\nEndereço: "+ END +"\nVocê receberá "
				+ "um aumento de: "+ casas.format(AUMENTO) +" R$, durante 6 meses. Seu novo salário será de: "+ casas.format(NOVO_SAL) +" R$.");
	}
	public static void exe5 () {
		String modelo;
		float pc_venda, parcela, montante, juros;
		DecimalFormat casas = new DecimalFormat ("0.00");
		String ler_modelo = JOptionPane.showInputDialog(null,"Digite o modelo do seu veículo dos sonhos: ");
		modelo = ler_modelo;
		String ler_pc_venda = JOptionPane.showInputDialog(null,"Digite o valor de venda encontrado: ");
		pc_venda = Float.parseFloat(ler_pc_venda);
		juros = pc_venda* 15/1000 * 48;
		montante = (pc_venda + juros);
		parcela = montante/48;
		JOptionPane.showMessageDialog(null,"Resultado da Simulação:\nModelo: "+ modelo +"\nValor do Veículo à vista: "+ pc_venda +"R$\nTaxa: 1,5% a.m "
				+ "(taxa simples)\nPrazo: 48 meses\nParcelas: "+ casas.format(parcela) +"R$\nSoma total a pagar:"
						+ " "+ casas.format(montante) +" R$\nDiferença entre Preço à vista e parcelado: "+ casas.format(juros) +" R$");
	}
	
	public static void main ( String [] args ) {
		exe1();

	}
}
