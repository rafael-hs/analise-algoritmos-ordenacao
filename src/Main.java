import algoritmos.Bubble;
import algoritmos.Counting;
import algoritmos.Heap;
import algoritmos.Insertion;
import algoritmos.Merge;
import algoritmos.Quick;
import algoritmos.Selection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
	
	private static void ExecutarSorts(String nomeDaPasta) throws IOException {
		Counting couting = new Counting();

		List<Integer> lista = null;
		File diretorioEntrada = new File("C:\\Users\\rafecu\\Documents\\eclipse-workspace\\PAA-Ordenacao\\src\\dados\\Entrada\\"+nomeDaPasta);
		File[] arquivosEntrada = diretorioEntrada.listFiles();
		
		for (int i = 0; i < arquivosEntrada.length; i++) {
			lista = new ArrayList<Integer>();

			BufferedReader br = null;
			br = new BufferedReader(new InputStreamReader(new FileInputStream(arquivosEntrada[i])));

			while (br.ready()) {
				String linha = br.readLine();
				lista.add(Integer.parseInt(linha));
			}
			br.close();

			int[] vetor = new int[lista.size()];

			for (int r = 0; r < lista.size(); r++) {
				vetor[r] = (int) lista.get(r).intValue();
			}
			
			long tempInicial = System.currentTimeMillis();
			//System.out.println(tempInicial);
			couting.CountingSort(vetor, vetor.length);
			long tempFinal = System.currentTimeMillis();
			//System.out.println(tempFinal);
			System.out.println(nomeDaPasta + " - Tempo em milisegundos: " + (tempFinal - tempInicial) + " " + arquivosEntrada[i].getName());
//			for(int v = 0; i < vetor.length; v++) {
//				System.out.println(vetor[v]);				
//			}
			File diretorioSaida = new File("C:\\Users\\rafecu\\Documents\\eclipse-workspace\\PAA-Ordenacao\\src\\dados\\Saida\\"+nomeDaPasta);
			File[] arquivosSaida = diretorioSaida.listFiles();
			
			FileWriter fw = new FileWriter(new File(arquivosSaida[i].toString()));
			
			for (int j = 0; j < vetor.length; j++) {
				fw.write(vetor[j]+"\n");
			}
			fw.flush();
			fw.close();
		}
	}

	public static void main(String[] args) throws IOException {
		
		//Bubble bubble = new Bubble();
		// Insertion inser = new Insertion();
		// Selection selec = new Selection();
		// Merge merge = new Merge();
		// Quick quick = new Quick();
		// Heap heap = new Heap();
		// Counting cout = new Counting();

		ExecutarSorts("aleatorioDistinto");
		ExecutarSorts("AleatorioRepetido");
		ExecutarSorts("crescenteDistinto");
		ExecutarSorts("crescenteRepetido");
		ExecutarSorts("DecrescenteDistinto");
		ExecutarSorts("decrescenteRepetido");
		
	}
}
