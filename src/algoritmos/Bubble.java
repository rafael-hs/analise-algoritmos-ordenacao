package algoritmos;

public class Bubble {

	public void bubbleSort(int v[]) {
		for (int i = v.length; i >= 1; i--) {
			for(int k = 1; k < i; k++) {
				if(v[k-1] > v[k]) {
					int aux = v[k];
					v[k] = v[k - 1];
					v[k-1] = aux;
				}
			}
		}
	}
}
