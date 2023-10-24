import java.util.Scanner;

public class ArrayRataNilai23 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Masukkan jumlah  mahasiswa : ");
         int n = sc.nextInt();
         int[] arr = new int[n];
         double total = 0;
         double rata2;
         for (int i = 0; i < arr.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" :");
            arr[i] = sc.nextInt();
         }
         for (int i = 0; i < arr.length; i++) {
            total += arr[i];
         }
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 70) {
               System.out.println("Mahasiswa ke-"+(i+1)+" lulus!");
           }
           else{
               System.out.println("Mahasiswa ke-"+(i+1)+" tidak lulus!");
           }
       }
         rata2 = total/2;
         System.out.println("Rata rata nilai = "+ rata2);
         sc.close();
    }
    
}
