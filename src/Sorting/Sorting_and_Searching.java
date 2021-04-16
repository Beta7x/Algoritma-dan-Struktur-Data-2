package Sorting;

public class Sorting_and_Searching {
	
	public static void profil() {
		System.out.println("===========================");
		System.out.println("Nama : Widies Ade Priyanto" + "\n" + "NIM  : 20090126 (2C)");
		System.out.println("===========================");
	}
	
	public static void InsertionSort(int[] Data){
	       for (int i = 0; i < Data.length; i++) {
	           int key = Data[i];
	           int j = i - 1;
	           while ((j >= 0) && (Data[j] > key)){
	               
	               Data[j + 1] = Data[j];
	               j--;
	           }
	           Data[j + 1] = key;
	       }
	   }
	   
	   public static void show(int data[]){
	       for (int i = 0; i < data.length; i++) {
	           System.out.print(data[i] + " ");
	       }
	       System.out.println();
	}
	   public static void main(String[] args) {
		   	System.out.println("SORTING AND SEARCHING PROGRAM !!!" + "\n" + "***************************");
	        int[] Data = {25, 7, 9, 13, 3};
	        int cari = 13;
	        int LastIndex = Data.length - 1;
	        int FirstIndex = 0;
	        int flag = 0;
	        int point = 0;
	        
	        System.out.println("Data Before Sorting : ");
	        Sorting_and_Searching.show(Data);
	        
	        System.out.println("Data After Sorting :");
	        Sorting_and_Searching.InsertionSort(Data);
	        Sorting_and_Searching.show(Data);
	        
	        System.out.println("");
	        
	        System.out.print("Data Search : ");
	        System.out.println(cari);
	                
	        while((FirstIndex <= LastIndex) && (flag == 0)){
	            point = (LastIndex + FirstIndex) / 2;
	            System.out.println("Index Point : "+ point);
	            
	            if(Data[point] == cari){
	                flag += 1;
	                System.out.println("Data "+cari+" telah ditemukan pada index ke- "+ point);
	            }
	            
	            else if(cari < Data[point]){
	                    System.out.println("Searching on Left Side....");
	                    LastIndex = point - 1;
	         
	            }
	            else {
	                    System.out.println("Searching on Right Side....");
	                    FirstIndex = point + 1;
	   
	                }
	               
	            }
	        
	         if(flag == 1){
	            System.out.println("Data "+cari+" telah ditemukan pada index ke- "+ point + " baris ke- "+ (point + 1));
	             System.out.println("Alert : Data Was found!");
	        } else {
	            System.out.println("Alert : Data Not Found!!!");
	     
	        }
	         System.out.println("");
	         profil();
	        
	        }
}