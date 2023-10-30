import java.util.Scanner;

public class tugas1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int total = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            total += arr[i];
        }
        double rata2 = total / n;
        System.out.println("Nilai Tertinggi: " + max);
        System.out.println("Nilai Terendah: " + min);
        System.out.println("Nilai Rata-rata: " + rata2);
        
        sc.close();
    }
}
