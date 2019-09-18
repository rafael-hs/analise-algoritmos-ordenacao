package algoritmos;

public class Quick {
	
	private int particiona(int array[], int comeco, int fim) {
		int pivo = array[comeco];
		int i = (comeco - 1);
		
		for(int j = comeco; j < fim; j++) {
			if(array[j] <= pivo) {
				i++;
				
				int aux = array[i];
				array[i] = array[j];
				array[j] = aux;
			}
		}
		
		int aux = array[i+1];
		array[i+1] = array[fim];
		array[fim] = aux;
		
		return i+1;
	}

	public void QuickSort(int array[], int comeco, int fim) {
		if(comeco < fim) {
			int particao = particiona(array, comeco, fim);
			
			QuickSort(array, comeco, particao - 1);
			QuickSort(array, particao + 1, fim);
		}
	}
	
}
