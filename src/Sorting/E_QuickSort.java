package Sorting;

public class E_QuickSort {
	
	public static void profil() {
		System.out.println("===========================");
		System.out.println("Nama : Widies Ade Priyanto" + "\n" + "NIM  : 20090126 (2C)");
		System.out.println("===========================");
	}
	
	private static int partition (int[] data, int p, int r) {
		int i, j;
		double pivot;
		
		pivot = data[p];
		i = p - 1;
		j = r + 1;
		for (;;) {
			do {
				i++;
			} while (data[i] < pivot);
			do {
				j--;
			} while (data[j] > pivot);
			
			if (i < j) {
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			} else {
				return j;
			}
		}
	}
	
	public static void QuickSort(int[] Data, int p, int r) {
		int q;
		if (p < r) {
			q = partition(Data, p, r);
			QuickSort(Data, p, q);
			QuickSort(Data, q + 1, r);
		}
	}
	
	public static void show (int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		System.out.println("QUICK SHORT PROGRAM !!!" + "\n" + "***************************");
		System.out.println("Before Quick Short : ");
		int[] Data = {25, 7, 9, 13, 3};
		E_QuickSort.show(Data);
		E_QuickSort.QuickSort(Data, 0, Data.length - 1);
		System.out.println("After Quick Sort : ");
		E_QuickSort.show(Data);
		profil();
	}
}
