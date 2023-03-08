package desafio3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.google.gson.Gson;

public class FaturamentoDiario {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		double menor,maior,soma,media;
		
		int faturamentosZeros=0,posicaoMenor=0,posicaoMaior=0,diasAcimaMedia=0;
		
		String json = String.join(" ",
                Files.readAllLines(
                        Paths.get("src/main/resources/dados.json"),
                        StandardCharsets.UTF_8)
        );

		VendasDiarias[] vendasDiarias = new Gson().fromJson(json, VendasDiarias[].class);
		
		soma=vendasDiarias[0].getValor();
		menor=vendasDiarias[0].getValor();
		maior=vendasDiarias[0].getValor();
		
		for(int i=1;i<vendasDiarias.length;i++) {
			if(menor>vendasDiarias[i].getValor() && vendasDiarias[i].getValor()>0) {
				menor=vendasDiarias[i].getValor();
				posicaoMenor=i;
			}else if(maior<vendasDiarias[i].getValor()){
				maior=vendasDiarias[i].getValor();
				posicaoMaior=i;
			}
			if(vendasDiarias[i].getValor()>0) {
				soma=soma+vendasDiarias[i].getValor();
			}else {
				faturamentosZeros++;
			}
		}
		
		media=soma/(vendasDiarias.length-faturamentosZeros);
		
		for(VendasDiarias faturamento: vendasDiarias) {
			if(faturamento.getValor()>media) {
				diasAcimaMedia++;
			}
		}
		
		long elapsed = System.currentTimeMillis() - start;
		
		System.out.printf("Menor faturamento: Dia: %d, Valor: %f \n",vendasDiarias[posicaoMenor].getDia(),vendasDiarias[posicaoMenor].getValor());
		System.out.printf("Maior faturamento: Dia: %d, Valor: %f \n",vendasDiarias[posicaoMaior].getDia(),vendasDiarias[posicaoMaior].getValor());
		System.out.printf("Em %d dias o faturamento diário foi superior à média mensal",diasAcimaMedia);
		System.out.println(elapsed);
	}
}
