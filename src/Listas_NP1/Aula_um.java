package Listas_NP1;
import java.text.DecimalFormat;

public class Aula_um {
		public Aula_um () {
			
		}
		
		public static void exercicioA () {
			String nome, dn,  end, cidade;
			nome = "Laura";
			dn = "19/08/01";
			end = "Rua Padre Feijó, nº 63";
			cidade = "Imperatriz";
			System.out.println("Meu nome é "+ nome +", data de nascimento é "+ dn +", meu endereço é"
					+ " "+ end +" e nasci na cidade "+ cidade);
			
		}

		


		public static void exercicioB () {
			int J, P, L, R, M, soma;
			J = 31;
			P = 27;
			L = 35;
			R = 23;
			M = 22;
			soma = J+P+L+R+M;
			System.out.println("João tem "+ J +" anos, Pedro tem "+ P +" anos, Lucas tem "+ L +" anos, "
					+ "Rodolfo tem "+ R +" anos e Marina tem "+ M +" anos. A soma das idades deles é "+ soma);
			
		}

		public static void exercicioC () {
			float vreal, vdolar, dolar;
			DecimalFormat conversao = new DecimalFormat("0000.00");
			vreal = 3657.38f;
			vdolar = 2.35f;
			dolar = vreal/vdolar;
			
			System.out.println(vreal +" reais convertido em dólar é igual a "+ conversao.format(dolar) +" dólares");
		}
		
		public static void main (String [] args) {
			exercicioA ();
			exercicioB ();
			exercicioC ();
		
		}
	}
