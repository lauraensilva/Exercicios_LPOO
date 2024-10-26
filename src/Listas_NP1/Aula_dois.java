package Listas_NP1;
import java.text.DecimalFormat;

public class Aula_dois {
	public Aula_dois() {
		
	}
	public static void exe1a () {
		int quantirmaos;
		quantirmaos = 3;
		System.out.println("Exercício 1 _ A:");
		if (quantirmaos >=2) {
			System.out.println("Você terá um desconto de 10%");
		}
		else {
			System.out.println("Você não terá desconto");
		}
	}
	public static void exe1b () {
		int quantalunos;
		quantalunos = 32;
		System.out.println("Exercício 1 _ B:");
		if (quantalunos > 30) {
			System.out.println("Ganharão uma passagem para cancun");
		}
		else 
			if (quantalunos==30) {
				System.out.println("Ganharão uma passagem para Fortaleza");
			}
			else {
				System.out.println("Ganharão uma passagem para Caldas Novas");
			}
	}
	public static void exe1c () {
		float compra = 637.78f;
		DecimalFormat casas = new DecimalFormat ("000.00");
		System.out.println("Exercício 1 _ C:");
		if (compra > 150) {
			float desconto = compra*90/100;
			System.out.println("Você ganhou um desconto de 10%. O novo valor será de:"+ casas.format(desconto));
		}
		else
			if (compra == 150) {
				float desconto = compra*93/100;
				System.out.println("Você ganhou um desconto de 7%. O novo valor será de:"+casas.format(desconto));			
			}
			else {
				float desconto = compra*96/100;
				System.out.println ("Você ganhou um desconto de 4%. O novo valor será de:"+casas.format(desconto));
			}
	}
	public static void exe1d () {
		int pontos = 7;
		System.out.println("Exercício 1_D:");
		if (pontos < 5) {
			System.out.println("Você, apesar da multa, é um bom condutor.");
		}
		else
			if (pontos == 5) {
				System.out.println("Você, Apesar de ser um bom condutor, tome cuidado.");
			}
			else {
				System.out.println("Você é uma pessoa legal mas tem que prestar mais atenção às leis de trânsito");
			}
	}
	public static void exe1e () {
		int amigos = 3;
		System.out.println("Exercício 1 _ E:");
		if (amigos<5) {
			System.out.println("Você é uma pessoa tranquila");
		}
		else
			if(amigos==5) {
				System.out.println("Você é uma pessoa normal");
			}
			else {
				System.out.println("TU TÁ ANIMADO");
			}
	}
	public static void exe2 () {
		System.out.println("Exercício 2:");
		System.out.println("A história do Java começa em 1991, na empresa Sun Microsystems, onde foi formado um grupo de"
				+ " programadores para criar algo revolucionário. Eles achavam que num futuro próximo, as residências e seus "
				+ "aparelhos teriam ligação com os computadores, era a ideia de casa e dispositivos inteligentes que temos "
				+ "hoje em dia.");
	}
	public static void exe4 () {
		int v1, v2, v3, v4, media;
		v1= 5;
		v2= 3;
		v3= 14;
		v4= 70;
		media = (v1 + v2 + v3 + v4)/4;
		System.out.println("Exercício 4:");
		System.out.println("A média dos valores: "+v1+", "+v2+", "+v3+", "+v4+", é: "+media);
	}
	public static void exe5 () {
		String local, prova;
		local = "Computação = Bloco D";
		prova = "27/05/2024";
		System.out.println("Exercício 5");
		System.out.println("local das aulas: "+local+" , data da prova: "+prova);
	}
	public static void exe7() {
		String nome, end;
		int num;
		nome = "Laura";
		end = "Vila Alzira";
		num = 63;
		System.out.println("Exercício 7:");
		System.out.println("Nome: "+nome+" Endereço: "+end+", "+num);
		if(num<65) {
			System.out.println("Você pagará o IPTU deste ano parcelado em 3x");
		}
		else
			if(num==65) {
				System.out.println("Você pagará o IPTU deste ano 2x");
			}
			else {
				System.out.println("Você pagará o IPTU deste ano à vista");
			}
	}
	
	public static void main ( String [] args) {
		exe1a ();
		exe1b ();
		exe1c ();
		exe1d ();
		exe1e ();
		exe4 ();
		exe5 ();
		exe7 ();
	}
}
