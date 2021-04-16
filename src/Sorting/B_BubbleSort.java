package Sorting;

public class B_BubbleSort {
	
	public static void profil() {
		System.out.println("===========================");
		System.out.println("Nama : Widies Ade Priyanto" + "\n" + "NIM  : 20090126 (2C)");
		System.out.println("===========================");
	}
	
	public static void BubbleSort(int[] Data) {
		System.out.println("After Bubble Sort : ");
		int i = 1, j, n = Data.length, temp;
		while (i < n) {
			j = n -1;
			while (j >= 1) {
				if (Data[j -1] > Data[j]) {
					temp = Data[j];
					Data[j] = Data[j -1];
					Data[j -1] = temp;
				}
				j = j - 1;
			}
			i = i + 1;
		}
	}
	
	public static void show(int data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		System.out.println("BUBBLE SORT PROGRAM !!!" + "\n" + "***************************");
		System.out.println("Before Bubble Sort : ");
		int Data[] = {25, 7, 9, 13, 3};
		B_BubbleSort.show(Data);
		B_BubbleSort.BubbleSort(Data);
		B_BubbleSort.show(Data);
		profil();
	}

}
