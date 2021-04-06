package algoritma_pencarian;

import java.util.Scanner;

public class SquentialSearch {
	public static void profil() {
		System.out.println('\n' + "Nama : Widies Ade Priyanto" + '\n' + "NIM : 20090126");
		System.out.println("=============/// END ///=============");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Membuat Varabel pada Scanner
		System.out.println("======/// SEQUENTIAL SEARCH ///======");
			String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Widies", "Tesla"};
			String key;
			boolean found = false;
			
				System.out.print("Masukan data yang akan dicari : ");
				key = input.nextLine();
				
				// Menampilkan data pada array
				System.out.print("Isi data adalah : ");
				for (int x = 0; x < data.length; x++) {
					System.out.print(data[x] + ", ");
				}
				System.out.println("");
				
				// Melakukan pencarian
				for (int x = 0; x < data.length; x++) {
					if (key.equalsIgnoreCase(data[x])) {
						found = true;
						System.out.print("Data " + key + " berada pada indeks ke-" + x + '\n');
						break;
					}
				} System.out.println("");
				
				if (found == true){
		            System.out.println("Alert : Data ditemukan!!!");
		        }
				else {
		            System.out.println("Alert : Data Tidak ditemukan...!");
		        }
				profil(); // Memaggil dn menampilkan class profil
				
	}
}
