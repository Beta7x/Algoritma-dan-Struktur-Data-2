package Sorting;

public class C_SelectionSort {
	
	public static void profil() {
		System.out.println("===========================");
		System.out.println("Nama : Widies Ade Priyanto" + "\n" + "NIM  : 20090126 (2C)");
		System.out.println("===========================");
	}
	
	public static void SelectionSort(int[] Data) {
		System.out.println("After Selection Sort : ");
		int smallIndex;
		int pass, j, n = Data.length;
		int temp;
		
		//index of smallest element in the sublist
		for (pass = 0; pass < n - 1; pass++) {
			smallIndex = pass;
			for (j = pass + 1; j < n; j++) {
				if (Data[j] < Data[smallIndex]) {
					smallIndex = j;
				}
			}
			//tukar nilai terkecil dengna array
			temp = Data[pass];
			Data[pass] = Data[smallIndex];
			Data[smallIndex] = temp;
		}
	}
	
	public static void show(int data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		System.out.println("SELECTION SORT PROGRAM !!!" + "\n" + "***************************");
		System.out.println("Before Selection Sort : ");
		int Data[] = {25, 7, 9, 13, 3};
		C_SelectionSort.show(Data);
		C_SelectionSort.SelectionSort(Data);
		C_SelectionSort.show(Data);
		profil();
	}

}
