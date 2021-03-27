package tugas_matrix;
import java.util.Scanner;

/**
 *
 * @author beta7x; Widies Ade Priyanto; 20090126;
 */
public class Perkalian_Matriks3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        System.out.println("3. Program perkalian matriks A dan B");
        int kolom_A, baris_A, kolom_B, baris_B;
        
            // Proses penginputan jumlah ordo baris dan kolom pada matriks A
            //System.out.print("Inputkan Baris Matriks A : ");
            baris_A = 2; //input.nextInt();
            //System.out.print("Inputkan Kolom Matriks A : ");
            kolom_A = 3; //input.nextInt();
            System.out.println("Matriks A = " + baris_A + "x" + kolom_A + '\n');

            // Proses penginputan jumlah ordo baris dan kolom pada matriks B
            //System.out.print("Inputkan Baris Matriks B : ");
            baris_B = 3; //input.nextInt();
            //System.out.print("Inputkan Kolom Matriks B : ");
            kolom_B = 2; //input.nextInt();
            System.out.println("Matriks B = " + baris_B + "x" + kolom_B + '\n');
        
        // Proses penginputan value pada baris dan kolom matriks A
        int[][] matriks_A = new int[baris_A][kolom_A];
        for (int i = 0; i < baris_A; i++) {
            for (int j = 0; j < kolom_A; j++) {
                System.out.printf("Masukan Matriks A baris %d kolom %d : ", (i + 1), (j + 1));
                matriks_A[i][j] = input.nextInt();
            }
        }
        // Proses menampilkan matriks A
        System.out.println( '\n' + "Matriks A = ");
        for (int i = 0; i < baris_A; i++) {
            for (int j = 0; j < kolom_A; j++) {
                System.out.print(matriks_A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // Proses penginputan value pada baris dan kolom matriks B
        int[][] matriks_B = new int[baris_B][kolom_B];
        for (int i = 0; i < baris_B; i++) {
            for (int j = 0; j < kolom_B; j++) {
                System.out.printf("Masukan Matriks B baris %d kolom %d : ", (i + 1), (j + 1));
                matriks_B[i][j] = input.nextInt();
            }
        }
        // Proses menampilkan matriks B
        System.out.println('\n' + "Matriks B = ");
        for (int i = 0; i < baris_B; i++) {
            for (int j = 0; j < kolom_B; j++) {
                System.out.print(matriks_B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        if(kolom_A == baris_B){
            System.out.println('\n' + "Matriks Hasil Perkalian" + '\n'+ "Matriks C = " + baris_A + "x" +kolom_B);
        int[][] hasil = new int[baris_A][kolom_B];
        for (int i = 0; i < baris_A; i++) {
            for (int j = 0; j < kolom_B; j++) {
                int x = 0;
                for (int k = 0; k < baris_B; k++) {
                    x += matriks_A[i][k] * matriks_B[k][j];
                }
                hasil[i][j] = x;
            }
        }
        for (int i = 0; i < baris_A; i++) {
            for (int j = 0; j < kolom_B; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        Menampilkan_Matriks1.identitas();
        }
        else{
            System.out.println("ORDO MATRIKS TIDAK SESUAI DENGAN SYARAT PERKALIAN MATRIKS!!!");
        }
    }
}
