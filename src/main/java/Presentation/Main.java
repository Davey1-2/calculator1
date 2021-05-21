package Presentation;

import Logic.Caculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Caculate fin = new Caculate(0);

        boolean end = true;

        while (end) {
            System.out.println("KALKULACKA");
            System.out.println("---------------");
            System.out.println("1) SCITANI");
            System.out.println("2) ODCITANI");
            System.out.println("3) NASOBENI");
            System.out.println("4) DELENI");
            System.out.println("5) MOCNINA");
            System.out.println("6) FAKTORIAL");
            System.out.println("7) ODEJIT Z APLIKACE");
            System.out.println("----------------");
            System.out.println("Vyber si svou moznost");

            int choose = sc.nextInt();


            if (choose == 1) {
                System.out.println("Zvol si prvni cislo");
                int a = sc.nextInt();
                System.out.println("Zvol si druhe cislo");
                int b = sc.nextInt();

                fin.sum(a, b);
                System.out.println("Vysledek = " + fin.getFinaleRes());

            }
            if (choose == 2) {
                System.out.println("Zvol si prvni cislo");
                int a = sc.nextInt();
                System.out.println("Zvol si druhe cislo");
                int b = sc.nextInt();

                fin.substract(a, b);
                System.out.println("Vysledek = " + fin.getFinaleRes());
            }
            if (choose == 3) {
                System.out.println("Zvol si prvni cislo");
                int a = sc.nextInt();
                System.out.println("Zvol si cislo kterym chces nasobit");
                int b = sc.nextInt();

                fin.times(a, b);
                System.out.println("Vysledek = " + fin.getFinaleRes());
            }
            if (choose == 4) {
                System.out.println("Zvol si prvni cislo");
                int a = sc.nextInt();
                System.out.println("Zvol si cislo kterym chces delit");
                int b = sc.nextInt();

                fin.divide(a, b);
                System.out.println("Vysledek = " + fin.getFinaleRes());
            }
            if (choose == 5) {
                System.out.println("Zvol si cislo ktere chces mocnit");
                int a = sc.nextInt();
                System.out.println("Zvol si mocnitel");
                int b = sc.nextInt();

                fin.power(a, b);
                System.out.println("Vysledek = " + fin.getFinaleRes());
            }
            if (choose == 6) {
                System.out.println("Zvol si cislo ktere bude tvuj faktorial");
                int a = sc.nextInt();

                fin.factorial(a);
                System.out.println("Vysledek = " + fin.getFinaleRes());

            }
            if (choose == 7) {
                System.exit(0);
            }
            if (choose > 7) {
                System.out.println("Tato moznost neexistuje");
            }

        }


    }
}
