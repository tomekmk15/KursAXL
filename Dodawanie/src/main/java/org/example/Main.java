package org.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static Map<String, String> contactBook = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Wyświetl wszystkie kontakty");
            System.out.println("2. Dodaj kontakt");
            System.out.println("3. Zakończ program");
            System.out.println("4. Usun kontakt");
            System.out.println("5. Wyszukaj kontakt po nazwie");
            System.out.println("6. Wyszukaj kontakt po numerze telefonu");
            System.out.println("Wybierz opcję: ");


            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1 -> displayContacts();
                case 2 -> addContact();
                case 3 -> System.exit(0);
                case 4 -> deleteContact();
                case 5 -> searchContactByName();
                case 6 -> searchContactByPhoneNumber();


            }
        }
    }




    private static void addContact() {
        System.out.println("Podaj nazwę: ");
        String name = scanner.nextLine();

        if (contactBook.containsKey(name)) {
            System.out.println("Kontakt o nazwie " + name + " już istnieje.");
            System.out.println("Czy chcesz zaktualizować ten kontakt? (T/N)");
            String updateChoice = scanner.nextLine().toUpperCase();

            if (updateChoice.equals("T")) {
                System.out.println("Podaj nowy numer telefonu: ");
                String newPhoneNumber = scanner.nextLine();
                contactBook.put(name, newPhoneNumber);
                System.out.println("Kontakt zaktualizowany.");
            } else {
                System.out.println("Kontakt nie został zaktualizowany.");
            }
        } else {
            System.out.println("Podaj numer telefonu: ");
            String phoneNumber = scanner.nextLine();
            contactBook.put(name, phoneNumber);
        }
    }


    private static void deleteContact() {
        System.out.println("Podaj nazwę kontaktu do usunięcia: ");
        String name = scanner.nextLine();

        if (contactBook.containsKey(name)) {
            contactBook.remove(name);
            System.out.println("Kontakt " + name + " został usunięty.");
        } else {
            System.out.println("Kontakt o nazwie " + name + " nie istnieje w książce kontaktów.");
        }
    }

    private static void displayContacts() {
        Set<String> names = contactBook.keySet();

        for (String name : names) {
            System.out.println("Nazwa: " + name);
            System.out.println("Numer telefonu: " + contactBook.get(name));
            System.out.println();

        }

    }
    private static void searchContactByName() {
        System.out.println("Podaj nazwę kontaktu do wyszukania: ");
        String name = scanner.nextLine();

        if (contactBook.containsKey(name)) {
            System.out.println("Wyniki wyszukiwania:");
            System.out.println("Nazwa: " + name);
            System.out.println("Numer telefonu: " + contactBook.get(name));
        } else {
            System.out.println("Kontakt o nazwie " + name + " nie istnieje w książce kontaktów.");
        }
    }

    private static void searchContactByPhoneNumber() {
        System.out.println("Podaj numer telefonu do wyszukania: ");
        String phoneNumber = scanner.nextLine();

        boolean found = false;

        System.out.println("Wyniki wyszukiwania:");
        for (Map.Entry<String, String> entry : contactBook.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                found = true;
                System.out.println("Nazwa: " + entry.getKey());
                System.out.println("Numer telefonu: " + entry.getValue());
            }
        }

        if (!found) {
            System.out.println("Nie znaleziono kontaktu o numerze telefonu " + phoneNumber + " w książce kontaktów.");
        }
    }

}
