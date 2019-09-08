package algoritmos;

public class Selection {

	public void SelectionSort(int v[]) {
		int n = v.length;
		
		for(int i = 0; i < n; i++) {
			int menor = i;
			for(int j = i+1; j < n; j++) {
				if(v[menor] > v[j]) {
					menor = j;
				}
			}
			int aux = v[menor];
			v[menor] = v[i];
			v[i] = aux;
		}
	}
}
