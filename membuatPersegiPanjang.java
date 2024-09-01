import java.util.Scanner;

public class membuatPersegiPanjang {
    public static void main(String[] args) {

        System.out.println("INI ADALAH PROGRAM UNTUK MENCARI LUAS PERSEGI PANJANG");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang= ");
        int panjang = input.nextInt();

        System.out.print("Masukkan Lebar= ");
        int lebar = input.nextInt();

        System.out.println("luasnya adalah= " + panjang*lebar);
    }
}
