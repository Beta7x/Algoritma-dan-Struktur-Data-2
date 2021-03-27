/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriks;
    
public class Lat1_AccessElements {
    
    public static void main(String[] args) {
        int matrix[][] = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(matrix[0][1]);
            System.out.println();
        System.out.println("Widies Ade Priyanto");
        
        int[][] A = {{3,8},{4,2},{5,8}};
        int[][] B = {{3,3,7},{2,8,1}};
        
        if(A[0].length == B.length){
            
            int[][] C = new int[A.length][B[0].length];
            for(int i = 0; i < A.length; i++){
                for(int j = 0; j < B[0].length; j++){
                    for(int k = 0; k < A[0].length; k++){
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            
            for(int[] c : C){
              for(int i : c){
                    System.out.print( i + " ");
                }
                System.out.println();
            }   
        }
        else{
            System.out.println("Ukuran ordo matriks tidak sesuai aturan perkalian matriks");
        }
    }
}
