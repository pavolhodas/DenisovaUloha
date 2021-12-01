package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    ArrayList arrayOfNames = new ArrayList(Arrays.asList("denis", "denis2"));
    ArrayList arrayOfPassword = new ArrayList(Arrays.asList("123", "aaa"));
    Scanner scanner = new Scanner(System.in);

    String input;

    public static void main(String[] args) {
        Main main = new Main();
        main.appOfUsers();
    }

    private void appOfUsers() {

        while (true) {
            System.out.println("Zadaj pismeno: ");
            input = scanner.nextLine();

            if (input.equals("V")) {
                System.out.println(arrayOfNames);

            } else if (input.equals("P")) {
                System.out.print("Zadaj meno: ");
                String user = scanner.nextLine();
                System.out.print("Zadaj heslo: ");
                String password = scanner.nextLine();

                if (arrayOfNames.contains(user) && arrayOfPassword.contains(password)) {
                    System.out.println("Uspesne prihlaseny");
                } else {
                    System.out.println("Neuspesne prihlaseny");
                }
            } else if (input.equals("R")) {
                System.out.print("Zadaj meno noveho uzivatela: ");
                String newUser = scanner.nextLine();
                System.out.print("Zadaj heslo noveho uzivatela: ");
                String newPassword = scanner.nextLine();

                if (arrayOfNames.contains(newUser)) {
                    System.out.println("Uzivatel uz existuje");
                } else {
                    arrayOfNames.add(newUser);
                    arrayOfPassword.add(newPassword);
                    System.out.println("Uzivatel bol pridany");
                }
            } else if (input.equals("K")) {
                break;
            } else {
                System.out.println("Neplatne pismeno");
            }
        }
    }
}
