import java.util.Scanner;

public class DariTigaBilanganMenententukanBilanganTerbesarTerkecilDanRataRatanya {
    public static void main(String[] args) {
        System.out.println("MENENTUKAN BILANGAN TERBESAR TERKECIL RATA RATA DARI 3 BILANGAN");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama= ");
        int bil1 = input.nextInt();

        System.out.print("Masukkan bilangan pertama= ");
        int bil2 = input.nextInt();

        System.out.print("Masukkan bilangan pertama= ");
        int bil3 = input.nextInt();

//        Yang versi terbesar
        if (bil1>bil2) {
            if (bil1>bil3) {
                System.out.println(bil1 + " adalah bil terbesar");
            }
        } if (bil2>bil1) {
            if (bil2>bil3) {
                System.out.println(bil2 + " adalah bilangan terbesar");
            }
        } if (bil3>bil1) {
            if (bil3>bil2) {
                System.out.println(bil3 + " adalah bilangan terbesar");
            }
        }

//        Yang versi terkecil
        if (bil1<bil2) {
            if (bil1<bil3) {
                System.out.println(bil1 + " adalah bil terkecil");
            }
        } if (bil2<bil1) {
            if (bil2<bil3) {
                System.out.println(bil2 + " adalah bilangan terkecil");
            }
        } if (bil3<bil1) {
            if (bil3<bil2) {
            System.out.println(bil3 + " adalah bilangan terkecil");
            }
        }

//        ini rata rata
        double rataRata = (bil1+bil2+bil3)/3.0;

        System.out.println("Ini adalah rata ratanya " + rataRata);
    }
}
