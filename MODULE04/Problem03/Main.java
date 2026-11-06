package MODULE04.Problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int choice = input.nextInt();
        input.nextLine();

        System.out.print("Nama hewan peliharaankku: ");
        String name = input.nextLine();

        System.out.print("Ras: ");
        String breed = input.nextLine();

        if (choice == 1) {
            System.out.print("Warna Bulu: ");
            String furColor = input.nextLine();

            Cat mycat = new Cat(name, breed, furColor);
            mycat.display();
        }
        else if (choice == 2) {
            System.out.print("Warna Bulu: ");
            String furColor = input.nextLine();

            System.out.print("Kemampuan: ");
            String abilityInput = input.nextLine();
            String[] abilityAnimal = abilityInput.split(",");

            Dog myDog = new Dog(name, breed, furColor, abilityAnimal);
            myDog.display();
        }
        else {
            System.out.println("Invalid choice!");
        }

        input.close();
    }
}