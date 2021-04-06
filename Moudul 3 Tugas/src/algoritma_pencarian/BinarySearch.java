package algoritma_pencarian; // deklarasi package

import java.util.Scanner; // import library scanner

public class BinarySearch { // deklarasi class
	
	public static void profil() { // method untuk mencetak identias
		System.out.println("Nama : Widies Ade Priyanto" + '\n' + "NIM : 20090126");
		System.out.println("=============/// END ///=============");
	}
	public static void main(String[] args) { // class utama
		
		// Pendeklarasian variabel
		System.out.println("========/// BINARY SEARCH ///========");
		int Binary[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int search;
		int IndeksAwal = 0;
		int IndeksAkhir = Binary.length -1;
		int found = 0;
		int point;
		
		try { // statement penanganan error pada kode program yang akan dijalankan
			// Fitur Scanner
			Scanner input = new Scanner(System.in);
			System.out.print("Masukan data angka yang akan dicari : ");
			search = input.nextInt();
			
			// Menampilkan data dalam array
			System.out.print("Daftar Data Angka : ");
			for(int i = 0; i < Binary.length; i++) {
				System.out.print(Binary[i] + ", ");
			}
			System.out.println();
			System.out.println();
			
			// kode program pencarian data
			while((IndeksAwal <= IndeksAkhir) && (found == 0)) {
				point = (IndeksAwal + IndeksAkhir) /2;
				System.out.println("Indeks Pointer: " + point);
				if(search == Binary[point]) {
					found = 1;
					System.out.println("Data " + search + " Telah ditemukan pada Indeks ke-" + point);
				}
				else if(search < Binary[point]) {
					IndeksAkhir = point -1;
					System.out.println("Searching on left side....");
				}
				else{
					IndeksAwal =point +1;
					System.out.println("Searching on right side....");
				}
			
			if(found == 1) {
				System.out.println("Alert: Data ditemukan!!!");
			}
			else {
				System.out.println("Alert: Data tidak ditemukan...!");
			}
			
			}System.out.println();
			profil(); // memanggil method profil untuk mencatak identitas

		}
		catch(java.util.InputMismatchException ex) { // penanganan error yang akan dialihkan
			System.out.println('\n' + "Alert: Data Inputan harus berupa Integer!!!" + '\n');
			profil(); 
		}
	}

}
