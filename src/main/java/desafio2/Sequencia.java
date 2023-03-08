package desafio2;
import java.util.ArrayList;
import java.util.List;

public class Sequencia {
	public static void main(String[] args) {
		fibonacci(89);
	}
	
	public static void fibonacci(int numero) {
		int auxiliar=1;;
		List<Integer> salvarSequencia= new ArrayList<Integer>();
		salvarSequencia.add(0);
		salvarSequencia.add(1);
		while(auxiliar<numero) {
				auxiliar=salvarSequencia.get(salvarSequencia.size()-2)+auxiliar;
				salvarSequencia.add(auxiliar);		
		}
		if(salvarSequencia.contains(numero)) {
			System.out.println("Pertence a sequência");
		}else {
			System.out.println("Não pertence a sequência");
		}
	}
}
