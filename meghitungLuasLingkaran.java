import java.util.Scanner;

public class meghitungLuasLingkaran {
    public static void main(String[] args) {
        System.out.println("INI ADALAH PROGRAM MENCARI LUAS LINGKARAN");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan mau berapa radiusnyaaa (dalam cm)= ");
        double r = input.nextInt();

        double luas = r*r*3.14;

        System.out.println("Luas lingkarannya adalah= " + luas + " cm^2");

    }
}
