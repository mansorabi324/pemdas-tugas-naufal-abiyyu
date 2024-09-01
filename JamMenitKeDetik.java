import java.util.Scanner;

public class JamMenitKeDetik {
    public static void main(String[] args) {

        System.out.println("INI ADALAH PROGRAM KONVERSI KE DETIK");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan mau berapa jam= ");
        int jam = input.nextInt();

        System.out.print("Masukkan nilai menit= ");
        int menit = input.nextInt();

        int jam2 = jam*3600;
        int menit2 = menit*60;

        System.out.println("Ini adalah hasil konversi detiknya= " + (jam2+menit2) + " detik");
    }
}
