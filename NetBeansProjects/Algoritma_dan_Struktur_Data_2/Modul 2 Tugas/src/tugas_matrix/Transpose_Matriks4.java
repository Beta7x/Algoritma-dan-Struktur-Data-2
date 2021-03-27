package tugas_matrix;
import java.util.Scanner;

/**
 *
 * @author beta7x; Widies Ade Priyanto; 20090126;
 */
public class Transpose_Matriks4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("4. Transpose matriks, dari matriks 2x3 diubah menjadi matriks 3x2 dimana angka pada elemen-elemen matriks dijelaskan seperti pada gambar soal no 4");
        int baris_B = 2, kolom_B = 3;
        int[][] matriks_B = new int[baris_B][kolom_B];
        for (int i = 0; i < baris_B; i++) {
            for (int j = 0; j < kolom_B; j++) {
                System.out.printf("Masukan Matriks B baris %d kolom %d : ", (i + 1), (j + 1));
                matriks_B[i][j] = input.nextInt();
            }
        }
        System.out.println();
        
        int[][] matriks_Bt = new int [3][2];
        System.out.println("Matriks B : ");
        for(int a = 0; a < baris_B; a++){
            for(int b = 0; b < kolom_B; b++){
                System.out.print(matriks_B[a][b] + " ");
            }
            System.out.println();
        }
        
        for(int a = 0; a < baris_B; a++){
            for(int b = 0; b < kolom_B; b++){
                matriks_Bt[b][a] = matriks_B[a][b];
            }
            System.out.println();
        }

        System.out.println("Hasil Transpose = matriks Bt");
        for(int a = 0; a < kolom_B; a++){
            for(int b = 0; b < baris_B; b++){
                System.out.print(matriks_B[b][a] + " ");
            }
            System.out.println();
        }
        System.out.println();
        Menampilkan_Matriks1.identitas();
    }
}
