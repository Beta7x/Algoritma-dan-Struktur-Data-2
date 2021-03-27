package tugas_matrix;

/**
 *
 * @author beta7x; Widies Ade Priyanto; 20090126;
 */
public class Menampilkan_Matriks1 {
    public static void identitas(){
        System.out.println("Nama : Widies Ade Priyanto" + '\n' + "NIM : 20090126" + '\n' + "Kelas : 2C");
    }
    public static void main(String[] args) {
        // Kode program membuat matriks dan mengakses matriks (soal no 1)
        System.out.println("1. Program membuat matriks dan mengasksesnya");
        int[][] soal1 = {{34,56,41},
                         {45,36,37},
                         {51,32,46}};
        
        for(int a = 0; a < soal1.length; a++){
            for(int b = 0; b < soal1[0].length; b++){
                System.out.print(soal1[a][b] +" ");
            }
            System.out.println();
        }
        System.out.println();
        identitas();
    }
}
