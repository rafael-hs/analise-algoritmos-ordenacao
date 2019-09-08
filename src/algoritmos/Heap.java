package algoritmos;

public class Heap {
	
	private void heapify(int array[], int n, int i) {
		int maior = i;
		int l = 2*i + 1;
		int r = 2*i + 2;
		
		if(l < n && array[l] > array[maior]) {
			maior = l;
		}
		if(r < n && array[r] > array[maior]) {
			maior = r;
		}
		 
		if(maior != i) {
			int aux = array[i];
			array[i] = array[maior];
			array[maior] = aux;
			
			heapify(array, n, maior);
		}
	}
	
	public void Heapsort(int array[]) {
		int n = array.length;
		int i = 0;
		
		for(i = n/2 -1; i >= 0; i--) {
			heapify(array, n, i);
		}
		for(int j = n-1; j >=0; j--) {
			int aux = array[0];
			array[0] = array[j];
			array[j] = aux;
			
			heapify(array, j, 0);
		}
	}
}
