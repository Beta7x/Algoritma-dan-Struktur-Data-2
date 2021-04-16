package Sorting;

public class F_MergeSort {
	
	public static void profil() {
		System.out.println("===========================");
		System.out.println("Nama : Widies Ade Priyanto" + "\n" + "NIM  : 20090126 (2C)");
		System.out.println("===========================");
	}
	
	private int[] array;
	private int[] tempMergeArray;
	private int length;
	
	public F_MergeSort(int[] array) {
		this.array = array;
		this.length = array.length;
		this.tempMergeArray = new int[length];
	}
	
	public void MergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			//below step sorts the left side of the array
			MergeSort(lowerIndex, middle);
			//below step sorts the right side of the array
			MergeSort(middle +  1, higherIndex);
			//now merge both sides
			MergeParts(lowerIndex, middle, higherIndex);
		}
	}
	
	public void MergeParts(int lowerIndex, int middle, int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergeArray[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergeArray[i] <= tempMergeArray[j]) {
				array[k] = tempMergeArray[i];
				i++;
			}
			else {
				array[k] = tempMergeArray[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergeArray[i];
			k++;
			i++;
		}
	}
	
	public void show() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		System.out.println("MERGE SORT PROGRAM !!!" + "\n" + "***************************");
		System.out.println("Before Merge Sort : ");
		int Data[] = {25, 7, 9, 13, 3};
		F_MergeSort mms = new F_MergeSort(Data);
		mms.show();
		System.out.println("After Merge Sort : ");
		mms.MergeSort(0, Data.length -  1);
		mms.show();
		profil();
	}

}
