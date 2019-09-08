package algoritmos;

public class Insertion {

	
	
	public void InsertionSort(int v[]) {
		int n = v.length;
		
		for(int i = 1; i < n; i++) {
			int chave = v[i];
			int j = i-1;
			while(j > -1 && v[j] > chave) {
				v[j+1] = v[j];
				j--;
			}
			v[j+1] = chave;
		}
	}
}
