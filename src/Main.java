import algoritmos.Bubble;
import algoritmos.Counting;
import algoritmos.Heap;
import algoritmos.Insertion;
import algoritmos.Merge;
import algoritmos.Quick;
import algoritmos.Selection;
import java.util.*;

public class Main {
	
	private static void printe(int array[]) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] atual = {5, 4, 8, 6, 7, 9, 10, 52, 1};
		int[] esperado = {1, 4, 5, 6, 7, 8, 9, 10, 52};
		
		//Bubble bubble = new Bubble();
		//Insertion inser = new Insertion();
		//Selection selec = new Selection();
		//Merge merge = new Merge();
		//Quick quick = new Quick();
		//Heap heap = new Heap();
		//Counting cout = new Counting();
		
		
		printe(atual);
		System.out.println(" ");
		//cout.CountingSort(atual,52); 
		System.out.println(" ");
		printe(atual);
		System.out.println(" ");
		System.out.println(" ");
		printe(esperado);
		
	}
}
