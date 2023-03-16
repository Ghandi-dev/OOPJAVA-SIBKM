package SIBKM;

import java.util.Scanner;

public class MainClass {
    public static void menu() {
        System.out.println("========================================");
        System.out.format("%12s %s\n", "", "MENU GANJIL GENAP");
        System.out.println("----------------------------------------");
        System.out.println("1. Cek Ganjil Genap");
        System.out.println("2. Print Ganjil/Genap (dengan Limit)");
        System.out.println("3. Exit");
        System.out.println("----------------------------------------");
    }

    public static void printGanjilGenap(int limit, String pilihan) {
        System.out.format("Print bilangan 1 - %d : \n", limit);
        if ((limit > 0) && (pilihan.equals("genap"))) {
            for (int i = 2; i <= limit; i += 2) {
                System.out.print(i + ", ");
            }
            System.out.println();
        } else if ((limit > 0) && (pilihan.equals("ganjil"))) {
            for (int i = 1; i <= limit; i += 2) {
                System.out.print(i + ", ");
            }
            System.out.println();
        } else if (limit <= 0) {
            System.out.println("Input limit tidak valid!!!");
        } else {
            System.out.println("Input pilih tidak valid!!!");
        }
    }

    public static String cekGanjilGenap(int input) {
        if ((input % 2 == 0) && (input > 0)) {
            return "Genap";
        } else if ((input % 2 != 0) && (input > 0)) {
            return "Ganjil";
        } else {
            return "Invalid input!!!";
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int pilihan;
            do {
                menu();
                System.out.print("Pilihan: ");
                pilihan = sc.nextInt();
                switch (pilihan) {
                    case 1:
                        System.out.print("Masukan bilangan yang ingin dicek : ");
                        int input = sc.nextInt();
                        System.out.println(cekGanjilGenap(input));
                        break;
                    case 2:
                        System.out.print("Pilih (Ganjil/Genap) : ");
                        String pilih = sc.next();
                        System.out.print("Masukan limit : ");
                        int limit = sc.nextInt();
                        printGanjilGenap(limit, pilih.toLowerCase());
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Input pilihan tidak valid!!!");
                }
                System.out.println("========================================");
            } while (pilihan != 3);
            sc.close();
        } catch (Exception e) {
            if (e.getClass().getSimpleName().equals("InputMismatchException")) {
                System.out.println("\nInput tidak valid!!!");
            } else {
                System.out.println(e);
            }
            main(args);
        }

    }
}
