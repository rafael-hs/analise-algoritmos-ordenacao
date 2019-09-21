package algoritmos;

import java.util.Random;

public class Quick {
	
	public void QuickSort(int[] vetor, int inicio, int fim)
	{   
	    if (inicio < fim - 1)
	    {
	        int position = inicio;
	        int pivot = pickPivot(inicio, fim);

	        if (pivot != fim - 1)
	            swap(vetor, pivot, fim-1);

	        for (int i = inicio; i < fim - 1; i++)
	        {
	            if (vetor[i] <= vetor[fim-1])
	            {
	                swap(vetor, position, i);
	                position++;
	            }
	        }
	        swap(vetor, position, fim-1);
	        QuickSort(vetor, inicio, position);
	        QuickSort(vetor, position + 1, fim);
	    }
	}

	//[esquerda,direita)
	private int pickPivot(int esquerda, int direita)
	{	 Random rand = new Random();
	     return rand.nextInt(direita-esquerda) + esquerda; 
	}

	private void swap(int[] nums, int comeco, int fim)
	{
	    int troca = nums[fim];
	    nums[fim] = nums[comeco];
	    nums[comeco] = troca;
	}
	
}
