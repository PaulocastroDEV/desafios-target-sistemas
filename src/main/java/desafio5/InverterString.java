package desafio5;


public class InverterString {
	public static void main(String[] args) {
		String nome= "teste";
		char[] letras= nome.toCharArray();
		for(int i= letras.length-1;i>=0;i--) {
			System.out.printf("%s",letras[i]);
		}
	}
}
