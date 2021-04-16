package Sorting;

public class A_InsertionSort {
	
	public static void profil() {
		System.out.println("===========================");
		System.out.println("Nama : Widies Ade Priyanto" + "\n" + "NIM  : 20090126 (2C)");
		System.out.println("===========================");
	}
	
	public static void InsertionSort(int[] Data) {
		System.out.println("After Insertion Sort : ");
		for (int i = 1; i < Data.length; i++) {
			int key = Data[i];
			int j = i -1;
			while ((j >= 0) && (Data[j] > key)) {
				Data[j + 1] = Data[j];
				j--;
			}
			Data[j + 1] = key;
		}
		
	}
	
	public static void show (int data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("\n");
	} 

	public static void main(String[] args) {
		System.out.println("INSERTION SORT PROGRAM !!!" + "\n" + "***************************");
		int Data[] = {25, 7, 9, 13, 3};
		System.out.println("Before Insertion Sort :");
		A_InsertionSort.show(Data);
		A_InsertionSort.InsertionSort(Data);
		A_InsertionSort.show(Data);
		profil();
		
		//System.out.println("\n" + "Nama : Widies Ade Priyanto");
		//System.out.println("NIM  : 20090126 (2C)");
	}

}
