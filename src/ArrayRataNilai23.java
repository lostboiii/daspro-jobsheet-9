import java.util.Scanner;

public class ArrayRataNilai23 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Masukkan jumlah  mahasiswa : ");
         int n = sc.nextInt();

         int[] nilaiMhs = new int[n];
         double totalLulus = 0;
         double totalTidakLulus = 0;
         double rata2Lulus;
         double rata2TidakLulus;
         int lulusCount = 0;
         int tidakLulusCount = 0;
         for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" :");
            nilaiMhs[i] = sc.nextInt();
             if (nilaiMhs[i] > 70) {
            lulusCount++;
            totalLulus += nilaiMhs[i];
        }
        else{
            tidakLulusCount++;
            totalTidakLulus += nilaiMhs[i];
        }
         }
        
    //      for (int i = 0; i < nilaiMhs.length; i++) {
    //         if (nilaiMhs[i] > 70) {
    //            System.out.println("Mahasiswa ke-"+(i+1)+" lulus!");
    //        }
    //        else{
    //            System.out.println("Mahasiswa ke-"+(i+1)+" tidak lulus!");
    //        }
    //    }
       rata2Lulus = totalLulus/lulusCount;
       rata2TidakLulus = totalTidakLulus/tidakLulusCount;
       
       System.out.println("Rata-rata nilai mahasiswa yang lulus: "+ rata2Lulus);
       System.out.println("Rata-rata nilai mahasiswa yang tidak lulus: "+ rata2TidakLulus);
        //  rata2 = total/2;
        //  System.out.println("Rata rata nilai = "+ rata2);
         sc.close();
    }
    
}
