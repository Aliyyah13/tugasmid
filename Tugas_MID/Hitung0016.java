/*Nama : A. Nur Aliyyah
  Nim : 13020210016*/
  
import java.util.Scanner;

public class Hitung0016 {
    public static void main(String[] args) {
        double mil, meter;
        final double KONVERSI = 1.609; // konversi 1 mil ke km

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai mil: ");
        mil = input.nextDouble();

        meter = mil * KONVERSI * 1000; // konversi km ke meter

        System.out.printf("Hasil %.2f mil = %.2f meter", mil, meter);
    }
}