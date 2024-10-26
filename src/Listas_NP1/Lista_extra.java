package Listas_NP1;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Lista_extra {
	public Lista_extra() {
		
	}
	public static void exe1a() {
		int a, b, c;
		for (a=1; a<=3; a++) {
			for (b=1; b<=3; b++) {
				for (c=1; c<=3; c++) {
					System.out.println("" + a + b + c);
				}
			}
		}
	}
	public static void exe1b() {
		int a, b, c, d;
		for (a=1; a<=3; a++) {
			for (b=1; b<=3; b++) {
				for (c=1; c<=3; c++) {
					for (d=1; d<=3; d++) {
						System.out.println("" + a + b + c + d);
					}
				}
			}
		}
	}
	public static void exe1c () {
		int a, b, c, d, e;
		for (a=1; a<=3; a++) {
			for (b=1; b<=3; b++) {
				for (c=1; c<=3; c++) {
					for (d=1; d<=3; d++) {
						for (e=1; e<=3; e++) {
							System.out.println("" + a + b + c + d + e);
						}
					}
				}
			}
		}
	}
	public static void exe1d () {
		int a, b, c, d, e, f;
		for (a=1; a<=3; a++) {
			for (b=1; b<=3; b++) {
				for (c=1; c<=3; c++) {
					for (d=1; d<=3; d++) {
						for (e=1; e<=3; e++) {
							for (f=1; f<=3; f++) {
								System.out.println("" + a + b + c + d + e + f);
							}
						}
					}
				}
			}
		}
	}
	public static void exe1e() {
		int a, b, c, d, e, f, g;
		for (a=1; a<=3; a++) {
			for (b=1; b<=3; b++) {
				for (c=1; c<=3; c++) {
					for (d=1; d<=3; d++) {
						for (e=1; e<=3; e++) {
							for (f=1; f<=3; f++) {
								for (g=1; g<=3; g++) {
									System.out.println("" + a + b + c + d + e + f + g);
								}
							}
						}
					}
				}
			}
		}
	}
	public static void exe2() {
		int v_hora, v_fixo, h_semanal, salario;
		v_hora= 18;
		v_fixo=50;
		h_semanal=20;
		salario= v_fixo + v_hora*h_semanal;
		System.out.println("Em uma semana o estagiário irá receber: "+ salario +" R$.");
	}
	public static void exe3() {
		int diaria, orcamento1, orcamento2;
		String ler_diaria = JOptionPane.showInputDialog(null,"Digite a quantidade de diárias que deseja: ");
		diaria = Integer.parseInt(ler_diaria);
		orcamento1 = 220 + 129 * diaria;
		orcamento2 = 173 + 162 * diaria;
		if (orcamento1 < orcamento2) {
			JOptionPane.showMessageDialog(null, "Sua viagem ficará mais barata com o orçamento 1\nValor Total: "+ orcamento1 +" R$");
		}
		else {
			JOptionPane.showMessageDialog(null, "Sua viagem ficará mais barata com o orçamento 2\nValor Total: "+ orcamento2 +" R$");
		}
	}
	public static void exe4() {
		double conta;
		DecimalFormat casas = new DecimalFormat ("00.00");
		String ler_conta = JOptionPane.showInputDialog(null,"Digite o valor da conta: ");
		conta = Double.parseDouble(ler_conta);
		double montante1 = conta * 1.03;
		JOptionPane.showMessageDialog(null,"O valor da conta com juros após 1 mês é de: "+ casas.format(montante1) +" R$.");
		double montante2 = conta * Math.pow(1 + 0.03,3);
		JOptionPane.showMessageDialog(null,"\nO valor da conta com juros após 3 meses é de: "+ casas.format(montante2) +" R$.");
		int i = 1;
		double montante3 = conta * Math.pow(1+0.03,i);
		while (montante3 < 160) {
			i++;
			montante3 = conta * Math.pow(1+0.03,i);
		}
		JOptionPane.showMessageDialog(null,"A partir de "+ i +" meses de atraso a conta ultrapassará 160,00. Valor da conta: "+ montante3);
	}
	public static void exe5() {
		double num;
		String ler_num = JOptionPane.showInputDialog(null,"Entre com qualquer número");
		num = Double.parseDouble(ler_num);
		int num2 = (int) Math.pow(num, 2);
		int num3 = (int) Math.pow(num, 3);
		int num4 = (int) Math.pow(num, 4);
		int num5 = (int) Math.pow(num, 5);
		JOptionPane.showMessageDialog(null,"O quadrado do número digitado: "+ num2 + "\nTriplo: "+ num3 +"\n"
				+ "Quádruplo: "+ num4 +"\nQuintuplo: "+ num5);
	}
	public static void exe6() {
		String nome;
		double valor;
		int i = 1;
		while (i <= 6) {
			String ler_nome = JOptionPane.showInputDialog(null,"Digite o nome do produto;"+ i);
			nome = ler_nome;
			String ler_valor = JOptionPane.showInputDialog(null,"Digite o valor do produto:"+ i);
			valor = Double.parseDouble(ler_valor);
			DecimalFormat casas = new DecimalFormat("00.00");
			if (i == 1) {
				double desconto = valor - valor*0.03;
				JOptionPane.showMessageDialog(null,"O produto "+ nome +" vai receber um desconto de 3%.\nValor com desconto: "+ casas.format(desconto) +" R$.");
			}
			if(i == 2) {
				double desconto = valor - valor*0.035;
				JOptionPane.showMessageDialog(null,"O produto "+ nome +" vai receber um desconto de 3,5%.\nValor com desconto: "+ casas.format(desconto) +"R$.");
			}
			if (i == 3) {
				double desconto = valor - valor*0.042;
				JOptionPane.showMessageDialog(null,"O produto "+ nome +" vai receber um desconto de 4,2%.\nValor com desconto: "+ casas.format(desconto) +"R$.");
			}
			if (i == 4) {
				double desconto = valor - valor*0.0475;
				JOptionPane.showMessageDialog(null,"O produto "+ nome +" vai receber um desconto de 4,75%.\nValor com desconto: "+ casas.format(desconto) +"R$.");
			}
			if (i == 5) {
				double desconto = valor - valor*0.0512;
				JOptionPane.showMessageDialog(null,"O produto "+ nome +" vai receber um desconto de 5,12%.\nValor com desconto: "+ casas.format(desconto) +"R$.");
			}
			if (i == 6) {
				double desconto = valor - valor*0.0523;
				JOptionPane.showMessageDialog(null,"O produto "+ nome +" vai receber um desconto de 5,23%.\nValor com desconto: "+ casas.format(desconto) +"R$.");
			}
			i++;
		}
	}
	public static void exe7() {
		int ano = 2023;
		String ler_ano = JOptionPane.showInputDialog(null,"Digite o ano de nascimento. Digite 0000 para sair");
		int ano_nasc = Integer.parseInt(ler_ano);
		while( ano_nasc != 0000) {
			int idade = ano - ano_nasc;
			if(idade < 18) {
				String ler_nome = JOptionPane.showInputDialog(null,"Digite o nome: ");
				String nome = ler_nome;
				JOptionPane.showMessageDialog(null, nome +" possui menos de 18 anos. Idade atual é de: "+ idade);
			}
			else {
				if(idade > 18 && idade < 30) {
					String ler_nome = JOptionPane.showInputDialog(null,"Digite o nome: ");
					String nome = ler_nome;
					JOptionPane.showMessageDialog(null, nome +" possui menos entre 18 e 30 anos. Idade atual é de: "+ idade);
				}
				else {
					if (idade > 30 && idade < 50) {
						String ler_nome = JOptionPane.showInputDialog(null,"Digite o nome: ");
						String nome = ler_nome;
						JOptionPane.showMessageDialog(null, nome +" possui entre 30 e 50 anos. Idade atual é de: "+ idade);
					}
					else {
						if (idade > 50 && idade < 80) {
							String ler_nome = JOptionPane.showInputDialog(null,"Digite o nome: ");
							String nome = ler_nome;
							JOptionPane.showMessageDialog(null, nome +" possui entre 50 e 80 anos. Idade atual é de: "+ idade);
						}
						else {
							String ler_nome = JOptionPane.showInputDialog(null,"Digite o nome: ");
							String nome = ler_nome;
							JOptionPane.showMessageDialog(null, nome +" possui mais de 80 anos. Idade atual é de: "+ idade);
						}
					}
				}
			}
			String ler__ano = JOptionPane.showInputDialog(null,"Digite o ano de nascimento. Digite 0000 para sair");
			ano_nasc = Integer.parseInt(ler__ano);
		}
	}
	
	public static void exe8() {
		int num [] = new int [10];
		
		for (int i=0; i<10; i++) {
			num [i] = i+1;
		}
		int soma = 0;
		for (int i=0; i < num.length; i++) {
			if (i%2 == 0) {
				soma += num[i];
			}
			else {
				soma -= num[i];
			}
		}
		JOptionPane.showMessageDialog(null, "O resultado da expressão é: "+ soma);
	}
	public static void exe9() {
		 double num[] = new double[10];
	        for (int i = 0; i < 10; i++) {
	            num[i] = 1.0 / (i + 1);
	        }
	        double resultado = 0;
	        for (int i = 0; i < num.length; i++) {
	           
	            if (i % 2 == 0) {
	                resultado += num[i];
	            } else {
	                resultado -= num[i];
	            }
	        }
	        
	        System.out.println("O resultado da operação é: " + resultado);
	    }
	public static void exe10() {
		 double num []  = new double[10];
	        for (int i = 0; i < 10; i++) {
	            num[i] = 1.0 + i / (10 - i);
	        }
	        double resultado = 0;
	        for (int i = 0; i < num.length; i++) {
	           
	            if (i % 2 == 0) {
	                resultado += num[i];
	            } else {
	                resultado -= num[i];
	            }
	        }
	        
	        System.out.println("O resultado da operação é: " + resultado);
	}
	public static void exe11() {
		String usuario_cad [] = new String [2];
		String senha_cad[] = new String [2];
		for (int i=1; i<=2; i++) {
			String ler_usuario = JOptionPane.showInputDialog(null,"Cadastre seu nome de usuário: ");
			usuario_cad [i]= ler_usuario;
			String ler_senha = JOptionPane.showInputDialog(null,"Cadastre sua senha");
			senha_cad[i]=ler_senha;
		}
		String usuario_log [] = new String [2];
		String senha_log[] = new String [2];
		for (int i=1; i<=2; i++) {
			String ler_usuario = JOptionPane.showInputDialog(null,"Login\nDigite seu nome de usuário: ");
			usuario_log [i]= ler_usuario;
			String ler_senha = JOptionPane.showInputDialog(null,"Login\nDigite sua senha");
			senha_log[i]=ler_senha;
		}
		for (int i=1; i<=2; i++) {
			if (usuario_cad[i] == usuario_log[i] & senha_cad[i]==senha_log[i]) {
				JOptionPane.showMessageDialog(null,"Login efetuado com sucesso!");
			}
			else {
				JOptionPane.showMessageDialog(null,"Login inválido!");
			}
		}
	}
			
		
		
	
	
	public static void main (String [] args) {
		exe11();
	}
}
