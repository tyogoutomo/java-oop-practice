package com.mycompany.oop_gslc1;
import java.util.*;
public class Oop_gslc1 {
    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> pass = new ArrayList<>();
        ArrayList<String> phone = new ArrayList<>();
        do {
            System.out.println("\n1. Input Data");
            System.out.println("2. Show Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Exit");
            System.out.print("\nYour choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    name.add(scan.next());
                    System.out.print("Pass: ");
                    pass.add(scan.next());
                    System.out.print("Phone: ");
                    phone.add(scan.next());
                    System.out.println("New data is added");
                    break;
                case 2:
                    if (name.isEmpty()) {
                        System.out.println("No data to display.");
                    } else {
                        System.out.println("\n============================================");
                        System.out.println("|No|\tName|\tPass|\tPhone|");
                        System.out.println("|===========================================");
                        for (int i = 0; i < name.size(); i++) {
                            System.out.printf("|%d|\t%s|\t%s|\t%s|\n", i + 1, name.get(i), pass.get(i), phone.get(i));
                        }
                        System.out.println("============================================");
                    }
                    break;
                case 3:
                    if (name.isEmpty()) {
                        System.out.println("No data to delete.");
                    } else {
                        System.out.println("\n============================================");
                        System.out.println("|No|\tName|\tPass|\tPhone|");
                        System.out.println("|===========================================");
                        for (int i = 0; i < name.size(); i++) {
                            System.out.printf("|%d|\t%s|\t%s|\t%s|\n", i + 1, name.get(i), pass.get(i), phone.get(i));
                        }
                        System.out.println("============================================");
                        System.out.print("Input data number to be deleted: ");
                        int delete_temp = scan.nextInt() - 1;
                        if (delete_temp >= 0 && delete_temp < name.size()) {
                            name.remove(delete_temp);
                            pass.remove(delete_temp);
                            phone.remove(delete_temp);
                            System.out.println("Data is removed");
                        } else {
                            System.out.println("Invalid input.");
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        } while (true);
    }
}
