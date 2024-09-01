import java.util.Scanner;

public class ganjilGenap {
    public static void main(String[] args) {
        System.out.println("INI ADALAH PROGRAM UNTUK MENGETAHUI APAKAH BILANGAN ITU GANJIL ATAU GENAP");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan= ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("Waah " + bilangan + " bilangan genap brooo");
        } else {
            System.out.println("Waah " + bilangan + " bilangan ganjil brooo");
        }
    }
}
