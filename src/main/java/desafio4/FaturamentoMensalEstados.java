package desafio4;
import java.util.Scanner;

public class FaturamentoMensalEstados {
	public static void main(String[] Args) {
		Scanner sc= new Scanner(System.in);
		Estado[] estados= new Estado[5];
		double soma= 0;
		for(int i=0;i<estados.length;i++) {
			System.out.println("Digite o nome do estado:");
			String nomeEstado=sc.next();
			System.out.println("Digite o faturamento do estado");
			double valor= sc.nextDouble();
			estados[i]= new Estado(nomeEstado, valor);
			estados[i].setFaturamento(valor);
			estados[i].setNome(nomeEstado);
			soma=soma+estados[i].getFaturamento();
		}
		for(int i=0;i<estados.length;i++) {
			System.out.printf("Nome: %s, Porcentagem: %.2f \n",estados[i].getNome(),(estados[i].getFaturamento()/soma)*100);
		}
		sc.close();
	}
	
	
	
}
