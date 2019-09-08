package algoritmos;

public class Merge {
	
	private void merge(int v[], int esquerdaV[], int direitaV[],int esquerda, int direita) {
		
		int i = 0, j = 0, k = 0;
		while(i < esquerda && j < direita) {
			if(esquerdaV[i] <= direitaV[j]) {
				v[k++] = esquerdaV[i++];
			}else {
				v[k++] = direitaV[j++];
			}
		}
		while(i < esquerda) {
			v[k++] = esquerdaV[i++];
		}
		while(j < direita) {
			v[k++] = direitaV[j++];
		}
	}
	
	public void MergeSort(int v[], int n) {
		if(n < 2) {
			return;
		}
		int meio = n / 2;
		int esquerda[] = new int[meio];
		int direita[] = new int[n - meio];
		
		for(int i = 0; i < meio; i++) {
			esquerda[i] = v[i];
		}
		for(int i = meio; i < n; i++) {
			direita[i -meio] = v[i];
		}
		
		MergeSort(esquerda, meio);
		MergeSort(direita, n- meio);
		
		merge(v, esquerda, direita, meio, n -meio);
	}
}
