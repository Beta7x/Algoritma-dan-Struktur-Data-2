package Sorting;

public class D_ShellSort {
	
	public static void profil() {
		System.out.println("===========================");
		System.out.println("Nama : Widies Ade Priyanto" + "\n" + "NIM  : 20090126 (2C)");
		System.out.println("===========================");
	}
	
	public static void ShellShort(int[] Data) {
		System.out.println("After Shell Sort : ");
		int n = Data.length;
		int temp;
		int distance, i, j;
		boolean finish = true;
		distance = n;
		
		while (distance >= 1) {
			distance = distance / 2;
			finish = true;
			while (finish) {
				finish = false;
				for (j = 0; j < n - distance; j++) {
					i = j + distance;
					if (Data[j] > Data[i]) {
						temp = Data[j];
						Data[j] = Data[i];
						Data[i] = temp;
						finish = true;
					}
				}
			}
		}
	}
	
	public static void show(int data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		System.out.println("SHELL SORT PROGRAM !!!" + "\n" + "***************************");
		System.out.println("Before Shell Sort : ");
		int Data[] = {25, 7, 9, 13, 3};
		D_ShellSort.show(Data);
		D_ShellSort.ShellShort(Data);
		D_ShellSort.show(Data);
		D_ShellSort.profil();
	}

}
